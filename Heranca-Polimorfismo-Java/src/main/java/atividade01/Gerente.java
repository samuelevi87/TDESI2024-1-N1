package main.java.atividade01;

/**
 * Representa um gerente da empresa.
 *
 */
public class Gerente extends Funcionario{

    private Double bonusAnual;

    /**
     * Constroi um gerente
     * @param nome
     * @param indetificador
     * @param salarioBase
     * @param bonusAnual
     */
    public Gerente(String nome, Integer indetificador, Double salarioBase, Double bonusAnual) {
        super(nome, indetificador, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    public Double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(Double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    /**
     * calcular o salario total do gerente
     * o gerente recebe seu salario base mais o bonus anul dividido em 12(meses)
     * @return O salario total calculdo.
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + (bonusAnual/12);
    }
}
