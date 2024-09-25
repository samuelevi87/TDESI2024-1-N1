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
    public Double calcularTaxa(Double valor) {
        return getTaxaTransacao() + (valor*1.2);
    }

    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Cartão de Credito\nPagamento informado foi: "+valor+"\nPagamento a pagar com taxas: "+calcularTaxa(valor));
    }

    @Override
    public void estornarPagamento(Double valor) {
        System.out.println("Cartão de Credito\nEstorno informado foi: "+valor+"\nEstorno a pagar com taxas: "+calcularTaxa(valor));
    }
}
