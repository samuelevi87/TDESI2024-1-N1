package main.java.atividade05;

/**
 * Representa uma forma de pagamento através de transferência bancária.
 * Esta classe herda da classe abstrata FormaPagamento e implementa os métodos necessários para calcular taxas e processar pagamentos.
 */
public class TransferenciaBancaria extends FormaPagamento {
    private String banco;
    private String agencia;
    private String conta;

    /**
     * Construtor que inicializa os atributos da transferência bancária.
     *
     * @param nome            O nome da forma de pagamento.
     * @param taxaTransacao   A taxa de transação associada a esta forma de pagamento.
     * @param banco           O nome do banco onde a conta está registrada.
     * @param agencia         O número da agência bancária.
     * @param conta           O número da conta bancária.
     */
    public TransferenciaBancaria(String nome, Double taxaTransacao, String banco, String agencia, String conta) {
        super(nome, taxaTransacao);
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    /**
     * Calcula a taxa de transação para o pagamento via transferência bancária.
     * A taxa é composta pela taxa fixa mais 1% do valor da transação.
     *
     * @param valor O valor da compra.
     * @return O valor total da taxa a ser cobrada.
     */
    @Override
    public Double calcularTaxa(double valor) {
        return getTaxaTransacao() + 0.01 * valor;
    }

    /**
     * Processa o pagamento usando transferência bancária, exibindo o valor do pagamento e a taxa calculada.
     * @param valor O valor a ser pago.
     */
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via Transferência Bancária. Taxa: R$" + calcularTaxa(valor));
    }

    /**
     * Estorna um pagamento feito com transferência bancária, exibindo o valor do estorno e a taxa calculada.
     * @param valor O valor a ser estornado.
     */
    @Override
    public void estornarPagamento(double valor) {
        System.out.println("Estorno de R$" + valor + " processado via Transferência Bancária. Taxa: R$" + calcularTaxa(valor));
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}
