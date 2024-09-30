package main.java.atividade01;

public class AnalistaQA extends Funcionario{
    private int projetosTestados;

    public AnalistaQA(String nome, int id, double salarioBase, int projetosTestados) {
        super(nome, id, salarioBase);
        this.projetosTestados = projetosTestados;
    }

    public int getProjetosTestados() {
        return projetosTestados;
    }

    public void setProjetosTestados(int projetosTestados) {
        this.projetosTestados = projetosTestados;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.05;
    }
}
