package main.java.atividade10;

import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * classe abstrata base para representar um funcionario no sistema de gestão de RH.
 */
public abstract class Funcionario {

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();

    private final int id;
    private String nome;
    private String cpf;
    private LocalDate dataAdmissao;
    private double salarioBase;

    /**
     * Construtor para a classe Funcionario.
     *
     * @param nome         O nome do funcionário.
     * @param cpf          O CPF do funcionário.
     * @param dataAdmissao A data de admissão do funcionário.
     * @param salarioBase  O salário base do funcionário.
     */
    public Funcionario(String nome, String cpf, LocalDate dataAdmissao, double salarioBase) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.salarioBase = salarioBase;
    }
    // Getters e Setters

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    /**
     * Calcula o tempo de serviço do funcionário em anos.
     *
     * @return O tempo de serviço em anos.
     */
    public int calcularTempoServico() {
        return Period.between(dataAdmissao, LocalDate.now()).getYears();
    }

    /**
     * Método abstrato para calcular o salário do funcionário.
     *
     * @return O salário calculado do funcionário.
     */
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return String.format("Funcionario{id=%d, nome='%s', cpf='%s', dataAdmissao=%s, salarioBase=%.2f}",
                id, nome, cpf, dataAdmissao, salarioBase);
    }
}

