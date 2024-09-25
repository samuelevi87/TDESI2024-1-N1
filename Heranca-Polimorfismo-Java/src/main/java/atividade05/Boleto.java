package main.java.atividade05;

public class Boleto extends FormaPagamento {

    private String codigoBarras;

    public Boleto(String nome, double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao();
    }

    @Override
    public void processarPagamento(double valor) {
        double taxa = calcularTaxa(valor);
        double total = valor + taxa;
        System.out.println("Pagamento de R$ " + valor + " via " + getNome() + " processado. Total: R$ " + total + " (Código de Barras: " + codigoBarras + ")");
    }

    @Override
    public void estornarPagamente(double valor) {
        System.out.println("Estorno de R$ " + valor + " via " + getNome() + " processado.");
    }
}
