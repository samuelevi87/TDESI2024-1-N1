package main.java.atividade05;

/**
 * Representa uma forma de pagamento através de boleto.
 * Esta classe herda da classe abstrata FormaPagamento e implementa os métodos necessários para calcular taxas e processar pagamentos.
 */
public class Boleto extends FormaPagamento {
    private String codigoBarras;

    /**
     * Construtor que inicializa os atributos do boleto
     * @param nome            O nome da forma de pagamento.
     * @param taxaTransacao   A taxa de transação associada a esta forma de pagamento.
     * @param codigoBarras    O código de barras do boleto.
     */
    public Boleto(String nome, Double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    /**
     * Calcula a taxa de transação para o pagamento via boleto, sendo a taxa de transação fixa.
     * @param valor O valor da compra.
     * @return O valor total da taxa a ser cobrada.
     */
    @Override
    public Double calcularTaxa(double valor) {
        return getTaxaTransacao();
    }

    /**
     * Processa o pagamento usando o boleto, exibindo o valor do pagamento e a taxa calculada.
     * @param valor O valor a ser pago.
     */
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via Boleto. Taxa: R$" + calcularTaxa(valor));
    }
    /**
     * Estorna o pagamento usando o boleto, exibindo o valor do pagamento e a taxa calculada.
     * @param valor O valor a ser pago.
     */
    @Override
    public void estornarPagamento(double valor) {
        System.out.println("Estorno de R$" + valor + " processado via Boleto. Taxa: R$" + calcularTaxa(valor));
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}
