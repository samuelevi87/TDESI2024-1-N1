package main.java.atividade06;

import main.java.atividade07.Tarefa;

import java.time.LocalDate;

public class TarefaDesenvolvimento extends Tarefa {

    private String linguagemProgramacao;
    private int complexidade; // de 1 a 5

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }

    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, String linguagemProgramacao, int complexidade) {
        super(titulo, descricao, dataCriacao);
        this.linguagemProgramacao = linguagemProgramacao;
        this.complexidade = complexidade;
    }

    @Override
    public int calcularPrioridade() {
        return complexidade * 2;
    }
}
