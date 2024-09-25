package main.java.atividade05;

public abstract class FormaPagamento implements Pagavel {
    private String nome;
    private double taxatransacao;

    public FormaPagamento(String nome, double taxatransacao) {
        this.nome = nome;
        this.taxatransacao = taxatransacao;
    }
    public String getNome() {
        return nome;
    }

    public double getTaxatransacao() {
        return taxatransacao;
    }
    public abstract double calcularTaxa(double valor);

    public class CartaoCredito{
        private String numeroCartao;
        private String bandeira;

        public CartaoCredito(String nome, double taxatransacao, String numeroCartao, String bandeira) {
            super(nome, taxatransacao);
            this.numeroCartao = numeroCartao;
            this.bandeira = bandeira;
        }
        public double Calculartaxa(double valor){
            return taxatransacao + (0.02 * valor);
        }
    }
    public class Boleto{
        private String codigoBarras;
    }
    public class TransferenciaBancaria{
        private String banco;
        private String agencia;
        private String conta;

    }

}
