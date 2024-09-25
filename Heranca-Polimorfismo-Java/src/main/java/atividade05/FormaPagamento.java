package main.java.atividade05;

public abstract class FormaPagamento implements Pagavel {
    private String nome;
    private Double taxaTransacao;

    public FormaPagamento(String nome, Double taxaTransacao) {
        this.nome = nome;
        this.taxaTransacao = taxaTransacao;
    }

    public String getNome() {
        return nome;
    }

    public Double getTaxaTransacao() {
        return taxaTransacao;
    }
    public abstract double calcularTaxa(double valor);


}
