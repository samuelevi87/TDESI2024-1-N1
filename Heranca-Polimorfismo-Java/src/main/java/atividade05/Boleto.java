package main.java.atividade05;

public class Boleto extends FormaPagamento{

    private String codigoBarras;

    public Boleto(String nome, double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }


    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao();
    }

    @Override
    public void processarPagamento(double valor) {
        double valorFinal = valor + calcularTaxa(valor);
        System.out.println("Pagamento processado com Boleto no valor de R$ " + valorFinal + ". Código de Barras: " + codigoBarras);
    }
    @Override
    public void estornarPagamento(double valor) {
        double valorFinal = valor - calcularTaxa(valor);
        System.out.println("Pagamento estornado do Boleto no valor de R$ " + valorFinal + ". Código de Barras: " + codigoBarras);
    }
}
