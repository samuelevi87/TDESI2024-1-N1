package main.java.atividade06;

import java.time.LocalDate;

public class TarefaBug extends Tarefa{
    private enum severidade { BAIXA, MEDIA, ALTA, CRITICA };
    private String plataforma;

    public TarefaBug(String titulo, String descricao, LocalDate dataLimite, String plataforma) {
        super(titulo, descricao, dataLimite);
        this.plataforma = plataforma;
    }

    @Override
    public Integer calcularPrioridade() {
        return null;
    }
}
