public class TarefaRevisao extends Tarefa {
    private String autorOriginal;
    private int numeroLinhas;

    public TarefaRevisao(String titulo, String descricao, LocalDate dataLimite, String autorOriginal, int numeroLinhas) {
        super(titulo, descricao, dataLimite);
        this.autorOriginal = autorOriginal;
        this.numeroLinhas = numeroLinhas;
    }

    @Override
    public int calcularPrioridade() {
        return numeroLinhas / 100;
    }
}
