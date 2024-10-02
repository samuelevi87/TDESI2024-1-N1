package main.java.atividade06;
import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private Status status;

    public Tarefa(String titulo, String descricao, LocalDate dataLimite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.dataLimite = dataLimite;
        this.status = Status.PENDENTE;
    }
    public enum Status {
        PENDENTE, EM_ANDAMENTO, CONCLUIDA
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

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Status getStatus() {
        return status;
    }

    public void atualizarStatus(Status novoStatus) {
        this.status = novoStatus;
    }

    public int calcularPrioridade() {
        return 0;
    }
}

