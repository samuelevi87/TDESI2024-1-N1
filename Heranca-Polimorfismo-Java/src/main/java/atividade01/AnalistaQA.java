package main.java.atividade01;

public class AnalistaQA extends Funcionario{
    private int projetosTestados;

    public AnalistaQA(String nome, int id, double salarioBase, int projetosTestados) {
        super(nome, id, salarioBase);
        this.projetosTestados = projetosTestados;
    }
}
