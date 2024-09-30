package main.java.atividade06;

import java.time.LocalDate;

public class TarefaBug extends Tarefa {
    private Severidade severidade;
    private String plataforma;

    public TarefaBug(String titulo, String descricao, LocalDate dataLimite, Status status, Severidade severidade, String plataforma) {
        super(titulo, descricao, dataLimite, status);
        this.severidade = severidade;
        this.plataforma = plataforma;
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
