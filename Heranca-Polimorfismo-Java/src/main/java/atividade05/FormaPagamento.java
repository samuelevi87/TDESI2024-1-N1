package main.java.atividade05;

public abstract class FormaPagamento implements Pagavel {
    private String nome;
    private double taxaTransacao;

    public FormaPagamento(String nome, double taxaTransacao) {
        this.nome = nome;
        this.taxaTransacao = taxaTransacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTaxaTransacao() {
        return taxaTransacao;
    }

    public void setTaxaTransacao(double taxaTransacao) {
        this.taxaTransacao = taxaTransacao;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" +
                "nome='" + nome + '\'' +
                ", taxaTransacao=" + taxaTransacao +
                '}';
    }

    public double calcularTaxa(double valor){

        return valor;
    }
}
