package main.java.atividade01;

/**
 * Representa um gerente na empresa.
 * Estende a classe Funcionário e adiciona funcionalidades específicas para gerentes.
 */
public class Gerente extends Funcionario{
    private Double bonus;

    /**
     * Constrói um gerente.
     * @param nome O nome do gerente.
     * @param id O número identificador do gerente.
     * @param salarioBase O salário base do gerente.
     * @param bonus O bônus anual do gerente.
     */
    public Gerente(String nome, Integer id, Double salarioBase, Double bonus) {
        super(nome, id, salarioBase);
        this.bonus = bonus;
    }

    /**
     * Calcula o salário total do gerente.
     * O gerente recebe seu salário base mais o bônus anual dividido por 12.
     * @return O salário total calculado do gerente.
     */
    @Override
    public Double calcularSalario() {
        return getSalarioBase() + (bonus/12);
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
