package main.java.atividade05;

public class CartaoCredito extends FormaPagamento {

    private String numeroCartao;

    private String bandeira;

    public CartaoCredito(String nome, double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }


    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao() + valor * 1.02;
    }

    @Override
    public void processarPagamento(double valor) {
        double valorFinal = valor + calcularTaxa(valor);
        System.out.println("Pagamento processado com Cartão de Crédito (" + bandeira + ") no valor de R$ " + valorFinal);
    }

    @Override
        public void estornarPagamento(double valor) {
            double valorFinal = valor - calcularTaxa(valor);
            System.out.println("Pagamento estornado do Cartão de Crédito (" + bandeira + ") no valor de R$ " + valorFinal);
        }
}
