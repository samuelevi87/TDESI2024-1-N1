package main.java.atividade05;

public class CartaoCredito extends FormaPagamento {

    private String numeroCartao;
    private String bandeira;

    public CartaoCredito(String nome, double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
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
    public double calcularTaxa(double valor) {
        return getTaxaTransacao() + (valor * 0.02);
    }

    @Override
    public void processarPagamento(double valor) {
        double taxa = calcularTaxa(valor);
        double total = valor + taxa;
        System.out.println("Pagamento de R$ " + valor + " via " + getNome() + " (Bandeira: " + bandeira + ") processado. Total: R$ " + total);
    }

    @Override
    public void estornarPagamente(double valor) {
        System.out.println("Estorno de R$ " + valor + " via " + getNome() + " processado.");
    }
}
