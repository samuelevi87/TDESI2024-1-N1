public class TarefaDesenvolvimento extends Tarefa {
    private String linguagemProgramacao;
    private int complexidade; // 1 a 5

    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite, String linguagemProgramacao, int complexidade) {
        super(titulo, descricao, dataLimite);
        this.linguagemProgramacao = linguagemProgramacao;
        this.complexidade = complexidade;
    }

    @Override
    public int calcularPrioridade() {
        return complexidade * 2;
    }
}
