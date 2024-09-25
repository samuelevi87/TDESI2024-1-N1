package main.java.atividade05;

public class CartaoCredito extends FormaPagamento{
    private String numeroCartao;
    private String bandeira;

    public CartaoCredito(String nome, Double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    @Override
    public Double calcularTaxa(Double valor) {
        return this.getTaxaTransacao() + valor * 0.02;
    }

    @Override
    public void processarPagamento(Double valor) {

    }

    @Override
    public void estornarPagamento(Double valor) {

    }
}
