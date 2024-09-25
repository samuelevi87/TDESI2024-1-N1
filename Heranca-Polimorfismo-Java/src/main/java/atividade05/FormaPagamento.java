package main.java.atividade05;

public abstract class FormaPagamento implements Pagavel{
    private String nome;
    private Double taxaTransacao;

    public FormaPagamento(String nome, Double taxaTransacao) {
        this.nome = nome;
        this.taxaTransacao = taxaTransacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTaxaTransacao() {
        return taxaTransacao;
    }

    public void setTaxaTransacao(Double taxaTransacao) {
        this.taxaTransacao = taxaTransacao;
    }

    public abstract Double calcularTaxa(Double valor);
}
