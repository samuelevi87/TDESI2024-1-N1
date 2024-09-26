package main.java.atividade05;

/**
 * Classe que representa uma forma de pagamento utilizando cartão de crédito.
 * Extende a classe abstrata FormaPagamento e implementa métodos específicos
 * para processar e estornar pagamentos via cartão de crédito.
 */
public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String bandeira;

    /**
     * Construtor para inicializar um cartão de crédito.
     *
     * @param nome O nome da forma de pagamento.
     * @param taxaTransacao A taxa de transação associada ao uso do cartão.
     * @param numeroCartao O número do cartão de crédito.
     * @param bandeira A bandeira do cartão.
     */
    public CartaoCredito(String nome, Double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    /**
     * Calcula a taxa total a ser aplicada ao valor do pagamento.
     * A taxa inclui a taxa de transação e 2% do valor.
     * @param valor O valor sobre o qual a taxa será calculada.
     * @return A taxa calculada.
     */
    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao() + (valor * 0.02);
    }

    /**
     * Obtém o número do cartão de crédito.
     * @return O número do cartão.
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * Define um novo número para o cartão de crédito.
     * @param numeroCartao O novo número do cartão.
     */
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    /**
     * Obtém a bandeira do cartão de crédito.
     * @return A bandeira do cartão.
     */
    public String getBandeira() {
        return bandeira;
    }

    /**
     * Define uma nova bandeira para o cartão de crédito.
     * @param bandeira A nova bandeira do cartão.
     */
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    /**
     * Processa um pagamento com o cartão de crédito.
     * Imprime informações sobre o pagamento e a taxa associada.
     * @param valor O valor a ser processado.
     */
    @Override
    public void processarPagamento(double valor) { // Revisar
        System.out.println("Pagamento de R$ " + valor + " processado via cartão de crédito (" + bandeira + "). Taxa: R$ " + calcularTaxa(valor));
    }

    /**
     * Estorna um pagamento realizado com o cartão de crédito.
     * Imprime informações sobre o estorno e a taxa associada.
     * @param valor O valor a ser estornado.
     */
    @Override
    public void estornarPagamento(double valor) { // Revisar
        System.out.println("Estorno de R$ " + valor + " processado via cartão de crédito (" + bandeira + "). Taxa: R$ " + calcularTaxa(valor));
    }
}