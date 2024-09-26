package main.java.atividade05;

/**
 * Classe que representa uma forma de pagamento utilizando transferência bancária.
 * Extende a classe abstrata FormaPagamento e implementa métodos específicos
 * para processar e estornar pagamentos via transferência bancária.
 */
public class TransferenciaBancaria extends FormaPagamento {
    private String banco;
    private String agencia;
    private String conta;

    /**
     * Construtor para inicializar uma transferência bancária.
     * @param nome O nome da forma de pagamento (ex: "Transferência Bancária").
     * @param taxaTransacao A taxa de transação associada ao uso da transferência.
     * @param banco O nome do banco.
     * @param agencia O número da agência.
     * @param conta O número da conta.
     */
    public TransferenciaBancaria(String nome, Double taxaTransacao, String banco, String agencia, String conta) {
        super(nome, taxaTransacao);
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    /**
     * Calcula a taxa total a ser aplicada ao valor do pagamento.
     * A taxa inclui a taxa de transação e 1% do valor.
     * @param valor O valor sobre o qual a taxa será calculada.
     * @return A taxa calculada.
     */
    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao() + (valor * 0.01);
    }

    /**
     * Obtém o nome do banco.
     * @return O nome do banco.
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define um novo nome para o banco.
     * @param banco O novo nome do banco.
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * Obtém o número da agência.
     * @return O número da agência.
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define um novo número para a agência.
     * @param agencia O novo número da agência.
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Obtém o número da conta.
     * @return O número da conta.
     */
    public String getConta() {
        return conta;
    }

    /**
     * Define um novo número para a conta.
     * @param conta O novo número da conta.
     */
    public void setConta(String conta) {
        this.conta = conta;
    }

    /**
     * Processa um pagamento com a transferência bancária.
     * Imprime informações sobre o pagamento e a taxa associada.
     * @param valor O valor a ser processado.
     */
    @Override
    public void processarPagamento(double valor) { // Revisar
        System.out.println("Pagamento de R$ " + valor + " processado via transferência bancária. Taxa: R$ " + calcularTaxa(valor));
    }

    /**
     * Estorna um pagamento realizado com a transferência bancária.
     * Imprime informações sobre o estorno e a taxa associada.
     * @param valor O valor a ser estornado.
     */
    @Override
    public void estornarPagamento(double valor) { // Revisar
        System.out.println("Estorno de R$ " + valor + " processado via transferência bancária. Taxa: R$ " + calcularTaxa(valor));
    }
}