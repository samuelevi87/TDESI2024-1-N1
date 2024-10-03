package main.java.atividade10;

import java.time.LocalDate;

/**
 * Classe que representa um Gerente.
 */
public class CorrecaoGerente extends CorrecaoFuncionario {
    private String departamento;
    private double bonus;

    /**
     * Construtor para a classe Gerente.
     *
     * @param nome         O nome do gerente.
     * @param cpf          O CPF do gerente.
     * @param dataAdmissao A data de admissão do gerente.
     * @param salarioBase  O salário base do gerente.
     * @param departamento O departamento do gerente.
     * @param bonus        O bônus do gerente.
     */
    public CorrecaoGerente(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, String departamento, double bonus) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    // Getters e setters específicos
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

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}