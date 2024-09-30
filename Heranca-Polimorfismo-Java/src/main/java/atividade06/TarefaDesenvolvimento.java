package main.java.atividade06;

import java.time.LocalDate;

public class TarefaDesenvolvimento extends Tarefa {
    private String linguagemProgramacao;
    private int complexidade;

    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite, Status status, String linguagemProgramacao, int complexidade) {
        super(titulo, descricao, dataLimite, status);
        this.linguagemProgramacao = linguagemProgramacao;
        this.complexidade = complexidade;
    }

    @Override
    public int calcularPrioridade() {
        return complexidade * 2;
    }
}
