package main.java.atividade06;

import java.time.LocalDate;

public class TarefaBug extends Tarefa {

    private String plataforma;
    private Severiedade severidade;

    public TarefaBug(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, Status status, String plataforma, Severiedade severidade) {
        super(titulo, descricao, dataCriacao, dataLimite, status);
        this.plataforma = plataforma;
        this.severidade = severidade;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Severiedade getSeveridade() {
        return severidade;
    }

    public void setSeveridade(Severiedade severidade) {
        this.severidade = severidade;
    }

    @Override
    public int calcularPrioridade() {
        switch (severidade) {
            case BAIXA:
                return 1;
            case MEDIA:
                return 2;
            case ALTA:
                return 3;
            case CRITICA:
                return 4;
            default:
                return 0;

        }
    }
}
