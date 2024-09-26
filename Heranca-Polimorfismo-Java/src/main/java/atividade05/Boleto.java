package main.java.atividade05;

/**
 * Classe que representa uma forma de pagamento utilizando boleto.
 * Extende a classe abstrata FormaPagamento e implementa métodos específicos
 * para processar e estornar pagamentos via boleto.
 */
public class Boleto extends FormaPagamento {
    private String codigoBarras;

    /**
     * Construtor para inicializar um boleto.
     *
     * @param nome O nome da forma de pagamento (ex: "Boleto").
     * @param taxaTransacao A taxa de transação associada ao uso do boleto.
     * @param codigoBarras O código de barras do boleto.
     */
    public Boleto(String nome, Double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    /**
     * Calcula a taxa total a ser aplicada ao valor do pagamento.
     * Para boletos, a taxa é fixa e definida pelo atributo taxaTransacao.
     * @param valor O valor sobre o qual a taxa será calculada.
     * @return A taxa calculada (fixa).
     */
    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao();
    }

    /**
     * Obtém o código de barras do boleto.
     * @return O código de barras do boleto.
     */
    public String getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * Define um novo código de barras para o boleto.
     * @param codigoBarras O novo código de barras do boleto.
     */
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    /**
     * Processa um pagamento com o boleto.
     * Imprime informações sobre o pagamento e a taxa associada.
     * @param valor O valor a ser processado.
     */
    @Override
    public void processarPagamento(double valor) { // Revisar
        System.out.println("Pagamento de R$ " + valor + " processado via boleto. Taxa: R$ " + calcularTaxa(valor));
    }

    /**
     * Estorna um pagamento realizado com o boleto.
     * Imprime informações sobre o estorno e a taxa associada.
     * @param valor O valor a ser estornado.
     */
    @Override
    public void estornarPagamento(double valor) { // Revisar
        System.out.println("Estorno de R$ " + valor + " processado via boleto. Taxa: R$ " + calcularTaxa(valor));
    }
}