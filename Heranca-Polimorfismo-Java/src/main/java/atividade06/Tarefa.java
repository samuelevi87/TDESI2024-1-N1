package main.java.atividade06;

import java.time.LocalDate;

public abstract class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private enum status { PENDENTE, EM_ANDAMENTO, CONCLUIDA };

    public Tarefa(String titulo, String descricao, LocalDate dataLimite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.dataCriacao = LocalDate.now();
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

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void atualizarStatus(Integer novoStatus) {

    }

    public abstract Integer calcularPrioridade();
}
