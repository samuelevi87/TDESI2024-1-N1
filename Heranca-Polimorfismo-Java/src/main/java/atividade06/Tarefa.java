package main.java.atividade06;

import java.time.LocalDate;

public abstract class Tarefa {

    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private Status status;

    public Tarefa(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, Status status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.dataLimite = dataLimite;
        this.status = Status.PENDENTE;
    }

    public Status getStatus() {
        return status;
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

    public abstract int calcularPrioridade();

    @Override
    public String toString() {
        return
                "Titulo = " + titulo + '\'' +
                        "Descrição= " + descricao + '\'' +
                        "Data criação= " + dataCriacao +
                        "Data limite= " + dataLimite +
                        "Status= " + status;
    }
}
