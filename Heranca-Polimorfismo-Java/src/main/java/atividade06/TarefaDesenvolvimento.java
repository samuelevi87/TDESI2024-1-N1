package main.java.atividade06;

import java.time.LocalDate;

public class TarefaDesenvolvimento extends Tarefa{
    private String linguagemProgramacao;
    private Integer complexidade;

    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite, String linguagemProgramacao, Integer complexidade) {
        super(titulo, descricao, dataLimite);
        this.linguagemProgramacao = linguagemProgramacao;
        this.complexidade = complexidade;
    }

    @Override
    public Integer calcularPrioridade() {
        return complexidade * 2;
    }
}
