package main.java.atividade05;

public class Boleto extends FormPagamento{
    private String codigoBarras;

    public Boleto(String nome, Double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public Double calcularTaxa(double valor) {
        return 8 + valor;
    }
}
