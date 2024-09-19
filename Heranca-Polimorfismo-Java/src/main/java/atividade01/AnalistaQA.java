package main.java.atividade01;

/**
 * Representa um analista na empresa
 * Estende a classe Funcionário e adiciona funcionalidades específicas para analistas.
 */
public class AnalistaQA extends Funcionario{
    private int projetosTestados;

    /**
     * Constrói um desenvolvedor,
     * @param nome O nome do analista.
     * @param id O número identificador do analista.
     * @param salarioBase O salário base do analista.
     * @param projetosTestados O número de projetos testados pelo analista.
     */
    public AnalistaQA(String nome, Integer id, Double salarioBase, Integer projetosTestados) {
        super(nome, id, salarioBase);
        this.projetosTestados = projetosTestados;
    }

    /**
     * Calcula o salário total do analista de QA.
     * O analista de QA recebe um adicional de 5% sobre o salário base, mais um bônus de R$100,00 por cada projeto testado.
     * @return O salário total do analista.
     */
    @Override
    public Double calcularSalario() {
        return this.getSalarioBase() * 1.05 + (100 * projetosTestados);
    }
}
