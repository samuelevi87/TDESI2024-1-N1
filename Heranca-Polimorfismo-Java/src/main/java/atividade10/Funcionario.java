package main.java.atividade10;

import java.time.LocalDate;
import java.time.Period;

/***
 * Classe abstrata que representa um funcionário.
 */
public abstract class Funcionario {
    private static int contador = 0;
    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataAdmissao;
    private double salarioBase;

    /***
     * Construtor que inicializa todos os atributos do funcionário.
     *
     * @param nome Nome do funcionário
     * @param cpf CPF do funcionário
     * @param dataAdmissao Data de admissão do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public Funcionario(String nome, String cpf, LocalDate dataAdmissao, double salarioBase) {
        this.id = ++contador; // Incrementa o contador e define o ID
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.salarioBase = salarioBase;
    }

    // Getters e setters
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

    /***
     * Calcula o tempo de serviço em anos.
     *
     * @return Tempo de serviço em anos
     */
    public int calcularTempoServico() {
        return Period.between(dataAdmissao, LocalDate.now()).getYears();
    }

    /***
     * Método abstrato para calcular o salário do funcionário.
     *
     * @return Salário do funcionário
     */
    public abstract double calcularSalario();
}
