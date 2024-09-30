package main.java.atividade01;

public class Gerente extends Funcionario{
    private double bonusAnual;

    public Gerente(String nome, int id, double salarioBase, double bonusAnual) {
        super(nome, id, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (bonusAnual / 12);
    }
}
