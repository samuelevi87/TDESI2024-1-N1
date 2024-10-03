package main.java.atividade10;

import java.time.LocalDate;
import java.time.Period;

/**
 * Representa o funcionario na lista de empregados da empresa
 */
public abstract class Funcionario {
    private  int id;
    private String nome;
    private String cpf;
    private LocalDate dataAdmicao;
    private Double salarioBase;

    public Funcionario(String nome, String cpf, LocalDate dataAdmicao, Double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmicao = dataAdmicao;
        this.salarioBase = salarioBase;
    }

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

    public LocalDate getDataAdmicao() {
        return dataAdmicao;
    }

    public void setDataAdmicao(LocalDate dataAdmicao) {
        this.dataAdmicao = dataAdmicao;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    /**
     * Calcula o tempo de serviço do funcionario na empresa
     * Tempo do funcionario na empresa
     */
    public int calcularTempoServico(){
        return Period.between(dataAdmicao, LocalDate.now()).getYears();
    }
    /**
     * Calcular o salario do funcionario
     * Retorna o calculo do valor do salario do funcionario
     */
    public abstract Double calcularSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataAdmicao=" + dataAdmicao +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
