package main.java.atividade06;

import java.time.LocalDate;

public class TarefaDesenvolvimento extends Tarefa {

    private String linguagemProgramacao;
    private int complexidade;

    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, Status status, String linguagemProgramacao, int complexidade) {
        super(titulo, descricao, dataCriacao, dataLimite, status);
        this.linguagemProgramacao = linguagemProgramacao;
        this.complexidade = complexidade;
    }

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
        if (complexidade < 1 || complexidade > 5) {
            throw new IllegalArgumentException("Complexidade deve estár entre 1 e 5");
        }
        this.complexidade = complexidade;
    }

    @Override
    public int calcularPrioridade() {
        return complexidade * 2;
    }
}
