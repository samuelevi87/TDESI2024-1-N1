package Exercicio14;

public class CorrecaoProjeto {
    private String nome;
    private int duracao;
    private double orcamento;

    public CorrecaoProjeto(String nome, int duracao, double orcamento) {
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
