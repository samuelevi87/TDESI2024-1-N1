package main.java.atividade06;

public class TarefaDesenvolvimento extends Tarefa{
    private String linguagemProgramacao;
    private int complexidade;

    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite, String linguagemProgramacao, int complexidade) {
        super(titulo, descricao, dataLimite);
        this.linguagemProgramacao = linguagemProgramacao;
        this.complexidade = complexidade;
    }

    @Override
    public int calcularPrioridade() {
        return complexidade * 2;
    }

    // Getters e Setters
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

}
