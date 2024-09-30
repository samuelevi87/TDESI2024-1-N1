package main.java.atividade05;

/**
 * Representa uma forma de pagamento.
 * Estende a classe FormaPagamento e adiciona funcionalidades específicas para pagamentos por transferência bancária.
 */
public class TransferenciaBancaria extends FormaPagamento{
    private String banco;
    private String agencia;
    private String conta;

    /**
     * Constrói um novo pagamento por transferência bancária.
     * @param nome O nome do transferência bancária
     * @param taxaTransacao A taxa de transação do transferência bancária
     * @param banco O banco da transferência bancária
     * @param agencia A agência do transferência bancária
     * @param conta A conta do transferência bancária
     */
    public TransferenciaBancaria(String nome, Double taxaTransacao, String banco, String agencia, String conta) {
        super(nome, taxaTransacao);
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    /**
     * Calcula a taxa da transferência bancária. O valor da taxa é o valor padrão mais 1%.
     * @param valor Valor para pagamento
     * @return A taxa total
     */
    @Override
    public Double calcularTaxa(Double valor) {
        return this.getTaxaTransacao() + valor * 0.01;
    }

    /**
     * Processa o pagamento
     * @param valor O valor a ser pago
     */
    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Pagamento no valor de R$ " + calcularTaxa(valor) + " através de transferência bancária processado com sucesso!");
    }

    /**
     * Estorna o pagamento
     * @param valor O valor pago
     */
    @Override
    public void estornarPagamento(Double valor) {
        System.out.println("Pagamento no valor de R$ " + calcularTaxa(valor) + " através de transferência bancária estornado com sucesso!");
    }
}
