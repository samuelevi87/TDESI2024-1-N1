package main.java.atividade01;

/**
 * Representa um AnalistaQA na empresa
 * Estende a classe funcionario e adiciona funcionalidades especificas
 */
public class AnalistaQA extends  Funcionario{

    private int projetosTestados;

    /**
     * Constroi um analistaQA
     * @param nome nome do analistaQA
     * @param id identificador do analistaQA
     * @param salarioBase salario base do analistaQA
     * @param projetosTestados quantidade de projetos testados pelo analistaQA
     */
    public AnalistaQA(String nome, int id, double salarioBase, int projetosTestados) {
        super(nome, id, salarioBase);
        this.projetosTestados = projetosTestados;
    }

    @Override
    public double calcularSalario() {
        return (getSalarioBase() * 1.05) + (100 * projetosTestados);
    }
}
