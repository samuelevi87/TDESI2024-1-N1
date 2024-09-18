package main.java.atividade01;

public class Gerente extends Funcionario{
    private Double bonusAnual;

    /**
     * Constrói um Gerente
     * @param nome O nome do
     * @param id O número identificação do
     * @param salarioBase O salário base do
     * @param bonusAnual
     */

    public Gerente(String nome, int id, double salarioBase, Double bonusAnual) {
        super(nome, id, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    public Double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(Double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * (bonusAnual/12);
    }
}
