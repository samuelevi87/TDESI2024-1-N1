package main.java.atividade10;

import java.time.LocalDate;

public class Gerente extends Funcionario{
    private String departamento;
    private double bonus;

    public Gerente(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, String departamento, double bonus) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
