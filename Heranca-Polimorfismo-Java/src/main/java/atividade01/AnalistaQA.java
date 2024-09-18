package main.java.atividade01;

public class AnalistaQA extends Funcionario{
    private int projetosTestados;

    public AnalistaQA(String nome, Integer id, Double salarioBase, Integer projetosTestados) {
        super(nome, id, salarioBase);
        this.projetosTestados = projetosTestados;
    }

    @Override
    public Double calcularSalario() {
        return this.getSalarioBase() * 1.05 + (100 * this.projetosTestados);
    }
}
