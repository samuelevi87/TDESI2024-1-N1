package main.java.atividade10;

import java.time.LocalDate;

public abstract class Funcionario {
    private int id;
    private static int contadorId = 0;
    private String nome;
    private String cpf;
    private LocalDate dataAdmissao;
    private double salarioBase;

    public Funcionario(String nome, String cpf, LocalDate dataAdmissao, double salarioBase) {
        this.id = contadorId++;
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.salarioBase = salarioBase;
    }
    public int calcularTempoServico(){
        return LocalDate.now().getYear() - dataAdmissao.getYear();
    }
    public abstract double calcularSalario();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Funcionario.contadorId = contadorId;
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
}
