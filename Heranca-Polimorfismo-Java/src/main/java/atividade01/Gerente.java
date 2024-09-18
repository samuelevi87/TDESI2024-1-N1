package main.java.atividade01;

/**
 * Representa um gerente na empresa.
 *
 */

public class Gerente extends  Funcionario {

    private Double bonusAnual;

    /**
     * Constroi um Gerente
     * @param nome   O nome do Gerente
     * @param indentificador    o número  indenficador do Gerente
     * @param salarioBase o salário base do Gerente
     * @param bonusAnual  O Gerente recebe um bonus de 10% sobre o salário base.
     */
    public Gerente(String nome, Integer indentificador, double salarioBase, Double bonusAnual) {
        super(nome, indentificador, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    public Double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(Double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    /**
     * Calcula o salário total do gerente.
     * O gerente recebe seu salário base mais o bonus
     * anual dividido por 12 meses.
     * @return   O salário total calculado.
     */
    @Override
    public double calcularSalarioTotal() {
        return  getSalarioBase() + (bonusAnual/12);
    }
}
