package main.java.atividade05;

public  class CartaoCredito extends FormaPagamento {

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
    public void processarPagamento(double valor) {
        System.out.println("\"Pagamento de R$"+valor+
                "Nome:"+getNome()+
                "Taxa:"+ getTaxaTransacao()+
                "Numero do Cartao:"+getNumeroCartao()+
                "Bandeira:"+getBandeira());
    }

    @Override
    public void estornarPagamento(double valor) {
        System.out.println("\"Estorno de R$"+valor+
                "Nome:"+getNome()+
                "Taxa:"+ getTaxaTransacao()+
                "Numero do Cartao:"+getNumeroCartao()+
                "Bandeira:"+getBandeira());
    }

    public double calcularTaxa(double valor){
        return getTaxaTransacao()+valor*1.2 ;
    }
}
