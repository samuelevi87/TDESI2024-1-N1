package main.java.atividade06;

import java.time.LocalDate;

public class TarefaRevisao extends Tarefa {
    private String autorOriginal;
    private Integer numeroLinhas;

    public TarefaRevisao(String titulo, String descricao, LocalDate dataLimite, Status status, String autorOriginal, Integer numeroLinhas) {
        super(titulo, descricao, dataLimite, status);
        this.autorOriginal = autorOriginal;
        this.numeroLinhas = numeroLinhas;
    }

    @Override
    public int calcularPrioridade() {
        return numeroLinhas / 100;
    }
}
