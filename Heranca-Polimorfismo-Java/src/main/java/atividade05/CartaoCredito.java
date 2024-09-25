package main.java.atividade05;

public class CartaoCredito extends FormPagamento{

    private String numeroCartao;
    private String bandeira;

    public CartaoCredito(String nome, Double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    @Override
    public Double calcularTaxa(double valor) {
        return 5 + (valor*1.2);
    }


}
