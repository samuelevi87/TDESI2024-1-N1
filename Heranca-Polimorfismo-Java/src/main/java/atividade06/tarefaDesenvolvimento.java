package main.java.atividade06;

import java.time.LocalDate;

public class tarefaDesenvolvimento extends Tarefa {
    private String linguagemProgramacao;
    private int complexidade;

    public tarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite) {
        super(titulo, descricao, dataLimite);
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
        this.complexidade = complexidade;
    }

    @Override
    public int calculaPrioridade() {
        switch (complexidade) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        }
        return complexidade*2;
    }
}
