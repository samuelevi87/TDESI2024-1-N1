package main.java.atividade01;

public class Desenvolvedor extends Funcionario {
    private String linguagemProgracacao;
    public Desenvolvedor(String nome, int id, double salarioBase, String linguagemProgracacao) {
        super(nome, id, salarioBase);
        this.linguagemProgracacao = linguagemProgracacao;
    }

    public String getLinguagemProgracacao() {
        return linguagemProgracacao;
    }

    public void setLinguagemProgracacao(String linguagemProgracacao) {
        this.linguagemProgracacao = linguagemProgracacao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.1;
    }
}
