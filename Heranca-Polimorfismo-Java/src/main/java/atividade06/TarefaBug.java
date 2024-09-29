package main.java.atividade06;

import java.time.LocalDate;

public class TarefaBug extends Tarefa{
    public TarefaBug(String titulo, String descricao, LocalDate dataLimite) {
        super(titulo, descricao, dataLimite);
    }

    public enum Severidade{
        BAIXA,
        MEDIA,
        ALTA,
        CRITICA;
    }
    private Severidade severidade;
    private String plataforma;

    public Severidade getSeveridade() {
        return severidade;
    }

    public void setSeveridade(Severidade severidade) {
        this.severidade = severidade;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public int calculaPrioridade() {
        switch (severidade) {
            case CRITICA:
                return 4;
            case ALTA:
                return 3;
            case MEDIA:
                return 2;
            case BAIXA:
                return 1;
            default:
                return 1;
        }
    }
}
