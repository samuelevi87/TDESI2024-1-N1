package main.java.atividade10;
import java.time.LocalDate;
/***
 * Classe que representa um Gerente, que é um tipo de funcionário.
 */
public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    /***
     * Construtor que inicializa todos os atributos do gerente.
     *
     * @param nome Nome do funcionário
     * @param cpf CPF do funcionário
     * @param dataAdmissao Data de admissão do funcionário
     * @param salarioBase Salário base do funcionário
     * @param departamento Departamento do gerente
     * @param bonus Bônus do gerente
     */
    public Gerente(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, String departamento, double bonus) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    // Getters e setters
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
