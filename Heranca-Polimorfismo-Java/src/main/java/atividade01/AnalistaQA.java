package main.java.atividade01;

/**
 * Representa um AnalistaQA na empresa.
 * Estende a classe Funcionario e adiciona funcionalidades específicas do AnalistaQA.
 */

public class AnalistaQA extends Funcionario {
    private Integer projetosTestados;

    /**
     * Constrói um AnalistaQA.
     * @param nome O nome do AnalistaQA.
     * @param id O número identificador do AnalistaQA.
     * @param salarioBase O salário base do AnalistaQA.
     * @param projetosTestados Os projetos testados do AnalistaQA.
     */

    public AnalistaQA(String nome, Integer id, Double salarioBase, Integer projetosTestados ) {
        super(nome, id, salarioBase);
        this.projetosTestados = projetosTestados;
    }

    public Integer getProjetosTestados() {
        return projetosTestados;
    }

    public void setProjetosTestados(Integer projetosTestados) {
        this.projetosTestados = projetosTestados;
    }

    @Override
    public double calcularSalario() {
        return (getSalarioBase() * 1.05) + (100 * projetosTestados);
    }
}