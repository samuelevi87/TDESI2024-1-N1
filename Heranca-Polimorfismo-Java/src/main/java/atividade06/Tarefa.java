package main.java.atividade06;

import java.time.LocalDate;

public abstract class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private  LocalDate dataLimite;
    private Status status;

    public Tarefa(String titulo, String descricao, LocalDate dataLimite, Status status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.dataCriacao = LocalDate.now();
        this.status = status;
    }

    public void atualizarStatus(Status novoStatus) {
        this.status = novoStatus;
    }

    public abstract int calcularPrioridade();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "Título:" + titulo + '\'' +
                ", Descrição: " + descricao + '\'' +
                ", Data Criação: " + dataCriacao +
                ", Data Limite: " + dataLimite +
                ", Status: " + status;
    }
}