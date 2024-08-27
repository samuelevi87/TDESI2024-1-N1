package Exercicio14;

public class Projeto {

    String nome;
    int duracao;
    double orcamento;

    public Projeto(String nome, int duracao, double orcamento) {
        this.nome = nome;
        this.duracao = duracao;
        this.orcamento = orcamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }
}
