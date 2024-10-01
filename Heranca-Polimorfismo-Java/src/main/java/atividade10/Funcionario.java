package main.java.atividade10;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Funcionario {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();

    private final int id;
    private String nome;
    private String cpf;
    private LocalDate dataAdmissao;
    private Double salarioBase;

    public Funcionario(String nome, String cpf, LocalDate dataAdmissao, Double salarioBase) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
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

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Integer calcularTempoServico() {
        return LocalDate.now().getYear() - this.dataAdmissao.getYear();
    }

    public abstract Double calcularSalario();
}
