package main.java.atividade07;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Tarefa {

    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;

    private Status status;

    public enum Status {
        PENDENTE,
        EM_ANDAMENTO,
        CONCLUIDA
    }

    public Tarefa(String titulo, String descricao, LocalDate dataLimite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.dataLimite = dataLimite;
    }

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

    public void atualizarStatus(Status novoStatus) {
        this.status = novoStatus;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract int calcularPrioridade();

}