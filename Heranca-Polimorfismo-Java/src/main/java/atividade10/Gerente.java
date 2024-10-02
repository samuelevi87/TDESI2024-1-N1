package main.java.atividade10;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    private String departamento;
    private Double bonus;

    public Gerente(String nome, String cpf, LocalDate dataAdmissao, Double salarioBase, String departamento, Double bonus) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
