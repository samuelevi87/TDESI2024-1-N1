package main.java.atividade05;

public class Boleto extends FormPagamento{
    private String codigoBarras;

    public Boleto(String nome, Double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public Double calcularTaxa(Double valor) {
        return getTaxaTransacao() + valor;
    }

    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Boleto\nPagamento informado foi: "+valor+"\nPagamento a pagar com taxas: "+calcularTaxa(valor));
    }

    @Override
    public void estornarPagamento(Double valor) {
        System.out.println("Boleto\nPagamento informado foi: "+valor+"\nPagamento a pagar com taxas: "+calcularTaxa(valor));
    }
}
