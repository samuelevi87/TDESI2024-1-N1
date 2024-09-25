package main.java.atividade05;

/**
 * Representa uma forma de pagamento.
 * Estende a classe FormaPagamento e adiciona funcionalidades específicas para pagamentos por boleto.
 */
public class Boleto extends FormaPagamento{
    private String codigoBarras;

    /**
     * Constrói um novo pagamento por boleto.
     * @param nome O nome do boleto
     * @param taxaTransacao A taxa de transação do boleto
     * @param codigoBarras O código de barras do boleto
     */
    public Boleto(String nome, Double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    /**
     * Calcula a taxa do boleto. O valor da taxa é o valor padrão.
     * @param valor Valor para pagamento
     * @return A taxa total
     */
    @Override
    public Double calcularTaxa(Double valor) {
        return this.getTaxaTransacao();
    }

    /**
     * Processa o pagamento
     * @param valor O valor a ser pago
     */
    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Pagamento no valor de R$ " + calcularTaxa(valor) + " através de boleto processado com sucesso!");
    }

    /**
     * Estorna o pagamento
     * @param valor O valor pago
     */
    @Override
    public void estornarPagamento(Double valor) {
        System.out.println("Pagamento no valor de R$ " + calcularTaxa(valor) + " através de boleto estornado com sucesso!");
    }
}
