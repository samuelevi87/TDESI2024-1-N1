package main.java.atividade05;

public class CartaoCredito extends FormaPagamento{
    private String numeroCartao;
    private String bandeira;

    public CartaoCredito(String nome, double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
    }

    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao()+(valor*0.02);
    }

    @Override
    public void processarPagamento(double valor) {
        calcularTaxa(getTaxaTransacao());
    }

    @Override
    public void estornarPagamento(double valor) {

    }
}
