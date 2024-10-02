package main.java.atividade10;

import java.time.LocalDate;

public class Funcionario {
    private Integer id;
    private static int contadorId = 0;
    private String nome;
    private String cpf;
    private LocalDate dataAdmissao;
    private Double salarioBase;

    public Funcionario(String nome, String cpf, LocalDate dataAdmissao, Double salarioBase) {
        this.id = contadorId++;
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.salarioBase = salarioBase;
    }

    public void calcularTempoServico() {
        return;
    }

    public abstract double calcularSalario();

    public Integer getId() {
        return id;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static void setContadorId(int contadorId) {
        Funcionario.contadorId = contadorId;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
