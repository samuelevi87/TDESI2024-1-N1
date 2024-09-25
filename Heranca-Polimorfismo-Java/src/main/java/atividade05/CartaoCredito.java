package main.java.atividade05;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String bandeira;

    public CartaoCredito(String nome, Double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao() + valor * 0.02;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via cartão de crédito (" + bandeira + "). Taxa: R$" + calcularTaxa(valor));
    }

    @Override
    public void estornarPagamento(double valor) {
        System.out.println("Estorno de R$" + valor + " processado via cartão de crédito (" + bandeira + "). Taxa: R$" + calcularTaxa(valor));
    }
}