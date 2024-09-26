package main.java.atividade05;

public abstract class FormaPagamento implements Pagavel{

    private String nome;
    private double taxaTransacao;

    public FormaPagamento(String nome, double taxaTransacao) {
        this.nome = nome;
        this.taxaTransacao = taxaTransacao;
    }

    public String getNome() {
        return nome;
    }

    public double getTaxaTransacao() {
        return taxaTransacao;
    }

    public abstract double calcularTaxa(double valor);
}
