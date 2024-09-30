package main.java.atividade05;

/**
 * Representa um pagamento por transferência bancária.
 * Estende a classe FormaPagamento e implementa funcionalidades específicas para transferência bancária.
 */
public class CorrecaoTransferenciaBancaria extends CorrecaoFormaPagamento {
    private String banco;
    private String agencia;
    private String conta;

    /**
     * Constrói uma nova TransferenciaBancaria.
     *
     * @param nome O nome da forma de pagamento.
     * @param taxaTransacao A taxa de transação aplicada.
     * @param banco O nome do banco.
     * @param agencia O número da agência.
     * @param conta O número da conta.
     */
    public CorrecaoTransferenciaBancaria(String nome, double taxaTransacao, String banco, String agencia, String conta) {
        super(nome, taxaTransacao);
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    /**
     * Calcula a taxa para uma transação de transferência bancária.
     *
     * @param valor O valor da transação.
     * @return O valor da taxa calculada (1% do valor + taxa fixa).
     */
    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao() + (valor * 0.01);
    }

    /**
     * Processa um pagamento com transferência bancária.
     *
     * @param valor O valor a ser pago.
     * @return O valor total após a aplicação da taxa.
     */
    @Override
    public double processarPagamento(double valor) {
        double taxa = calcularTaxa(valor);
        double valorTotal = valor + taxa;
        System.out.println("Processando transferência bancária de R$" + valor + ". Taxa: R$" + taxa);
        return valorTotal;
    }

    /**
     * Estorna um pagamento feito com transferência bancária.
     *
     * @param valor O valor a ser estornado.
     * @return O valor estornado (sem aplicação de taxa).
     */
    @Override
    public double estornarPagamento(double valor) {
        System.out.println("Estornando transferência bancária de R$" + valor + ".");
        return valor;
    }
}