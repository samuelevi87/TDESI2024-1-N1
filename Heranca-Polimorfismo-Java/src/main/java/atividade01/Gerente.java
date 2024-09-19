package main.java.atividade01;

public class Gerente extends Funcionario {
    private Double bonusAnual;

    /**
     * Constrói o gerente
     * @param nome nome do gerente
     * @param id id do gerente
     * @param salarioBase salario base do gerente
     * @param bonusAnual bonus anual do gerente
     */

    public Gerente(String nome, Integer id, Double salarioBase, double bonusAnual) {
        super(nome, id, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    public Double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(Double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    /**
     * Calcular o salário total do gerente
     * O gerente recebe seu salário base mais o bônus o anual dividido por 12 (meses)
     * @return O salário total calculado
     */

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + (bonusAnual/12);
    }



}
