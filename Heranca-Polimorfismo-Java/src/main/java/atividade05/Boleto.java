package main.java.atividade05;

public class Boleto extends FormaPagamento{
    private String codigoBarras;

    public Boleto(String nome, Double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public Double calcularTaxa(Double valor) {
        return this.getTaxaTransacao();
    }

    @Override
    public void processarPagamento(Double valor) {

    }

    @Override
    public void estornarPagamento(Double valor) {

    }
}
