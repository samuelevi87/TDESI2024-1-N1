package main.java.atividade01;

public class AnalistaQA extends Funcionario {


    private int projetosTestados;

    public AnalistaQA(String nome, Integer indentificador, double salarioBase, int projetosTestados) {
        super(nome, indentificador, salarioBase);
        this.projetosTestados = projetosTestados;
    }

    public int getProjetosTestados() {
        return projetosTestados;
    }

    public void setProjetosTestados(int projetosTestados) {
        this.projetosTestados = projetosTestados;
    }

    @Override
    public double calcularSalarioTotal() {
        return (getSalarioBase() * 1.05) + (100 * projetosTestados);
    }
}
