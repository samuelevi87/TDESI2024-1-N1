package main.java.atividade05;

public class Boleto extends FormaPagamento{
    private String codigoBarras;

    public Boleto(String nome, double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {

    }

    @Override
    public void estornarPagamento(double valor) {

    }

    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao()+valor;
    }
}
