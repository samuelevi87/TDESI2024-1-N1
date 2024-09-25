package main.java.atividade05;

public abstract class FormPagamento implements Pagavel {
    private String nome;
    private Double taxaTransacao;

    public FormPagamento(String nome, Double taxaTransacao) {
        this.nome = nome;
        this.taxaTransacao = taxaTransacao;
    }

    public String getNome() {
        return nome;
    }

    public Double getTaxaTransacao() {
        return taxaTransacao;
    }

    public abstract Double calcularTaxa(Double valor);


    @Override
    public void processarPagamento(Double valor) {

    }

    @Override
    public void estornarPagamento(Double valor) {

    }
}
