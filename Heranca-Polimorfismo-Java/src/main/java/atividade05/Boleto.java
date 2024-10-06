package main.java.atividade05;

/**
 * Representa um pagamento por boleto.
 * Estende a classe FormaPagamento e implementa funcionalidades específicas para boleto.
 */
public class Boleto extends CorrecaoFormaPagamento {
    private String codigoBarras;

    /**
     * Constrói um novo Boleto.
     *
     * @param nome O nome da forma de pagamento.
     * @param taxaTransacao A taxa de transação aplicada.
     * @param codigoBarras O código de barras do boleto.
     */
    public Boleto(String nome, double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    /**
     * Calcula a taxa para uma transação de boleto.
     *
     * @param valor O valor da transação.
     * @return O valor da taxa fixa.
     */
    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao();
    }

    /**
     * Processa um pagamento com boleto.
     *
     * @param valor O valor a ser pago.
     * @return O valor total após a aplicação da taxa.
     */
    @Override
    public double processarPagamento(double valor) {
        double taxa = calcularTaxa(valor);
        double valorTotal = valor + taxa;
        System.out.println("Processando pagamento de R$" + valor + " por boleto. Taxa: R$" + taxa);
        return valorTotal;
    }

    /**
     * Estorna um pagamento feito com boleto.
     *
     * @param valor O valor a ser estornado.
     * @return O valor estornado (sem aplicação de taxa).
     */
    @Override
    public double estornarPagamento(double valor) {
        System.out.println("Estornando pagamento de R$" + valor + " do boleto.");
        return valor;
    }
}
