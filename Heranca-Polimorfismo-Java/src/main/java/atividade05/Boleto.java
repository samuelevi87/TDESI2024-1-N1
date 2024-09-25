package main.java.atividade05;

public class Boleto extends FormaPagamento {
    private String codigoBarras;
    public Boleto(String nome, Double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao();
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {

        System.out.println("Pagamento de R$" + valor + " processado via boleto. Taxa: R$" + calcularTaxa(valor));
    }

    @Override
    public void estornarPagamento(double valor) {
        System.out.println("Estorno de R$" + valor + " processado via boleto. Taxa: R$" + calcularTaxa(valor));
    }
}