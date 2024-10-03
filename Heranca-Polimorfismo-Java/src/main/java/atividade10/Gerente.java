package main.java.atividade10;

import java.time.LocalDate;

public abstract class Gerente extends Funcionario{
    private String departamento;
    private Double bonus;
    /**
     * Classe do Gerente
     */
    public Gerente(String nome, String cpf, LocalDate dataAdmicao, Double salarioBase, Double bonus) {
        super(nome, cpf, dataAdmicao, salarioBase);
        this.departamento = departamento;
        this.bonus = bonus;
    }
    /**
     * Classe GERENTE
     * id do gerente
     * nome do gerente
     * cpf do gerente
     * data de admissao do gerete
     * salario base do gerente
     * bonus do gerente
     */
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public Double getSalarioBase() {
        return getSalarioBase() + bonus;
    }

}
