package Exercicio14;

public class Projeto {
    private String nome;
    private int duracao;
    private double orcamento;

    public Projeto(String nome, int duracao, double orcamento) {
        this.nome = nome;
        this.duracao = duracao;
        this.orcamento = orcamento;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }
}

