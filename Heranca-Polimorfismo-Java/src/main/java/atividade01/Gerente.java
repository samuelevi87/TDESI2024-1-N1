package main.java.atividade01;

/**
 * Representa um Gerente na empresa.
 * Estende a classe Funcionario e adiciona funcionalidades específicas do Gerente.
 */

public class Gerente extends Funcionario {
    private Double bonusAnual;

    /**
     * Constrói um desenvolvedor.
     * @param nome O nome do Gerente.
     * @param id O número identificador do Gerente.
     * @param salarioBase O salário base do Gerente.
     * @param bonusAnual O bônus recebido do Gerente.
     */

    public Gerente(String nome, int id, double salarioBase, Double bonusAnual) {
        super(nome, id, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    /**
     * Calcula o salário total do Gerente.
     * O Gerente recebe seu salário base mais o bônus anul dividido por 12 (meses).
     * @return O salário total calculado.
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (bonusAnual/12);
    }
}
