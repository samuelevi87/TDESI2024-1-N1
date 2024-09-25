package main.java.atividade06;

import javax.net.ssl.SSLEngineResult;
import java.io.ObjectInputFilter;
import java.time.LocalDate;

public abstract class Tarefa {
    private String titulo;
    private String descriacao;
    private LocalDate dataDescricao;
    private LocalDate dataCriacao;
    private Enum status;

    public enum Status{
    Pendente, Em_Andamento, Concluida

    }

    public Tarefa(String titulo, String descriacao, LocalDate dataDescricao, LocalDate dataCriacao, Enum status) {
        this.titulo = titulo;
        this.descriacao = descriacao;
        this.dataDescricao = dataDescricao;
        this.dataCriacao = dataCriacao;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriacao() {
        return descriacao;
    }

    public void setDescriacao(String descriacao) {
        this.descriacao = descriacao;
    }

    public LocalDate getDataDescricao() {
        return dataDescricao;
    }

    public void setDataDescricao(LocalDate dataDescricao) {
        this.dataDescricao = dataDescricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public void atualizarStatus(Status novoStatus) {
        this.status = novoStatus;
    }
    public abstract int calcularPrioridade();
}
