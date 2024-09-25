public class TarefaBug extends Tarefa {
    public enum Severidade {
        BAIXA, MEDIA, ALTA, CRITICA
    }

    private Severidade severidade;
    private String plataforma;

    public TarefaBug(String titulo, String descricao, LocalDate dataLimite, Severidade severidade, String plataforma) {
        super(titulo, descricao, dataLimite);
        this.severidade = severidade;
        this.plataforma = plataforma;
    }

    @Override
    public int calcularPrioridade() {
        switch (severidade) {
            case CRITICA: return 4;
            case ALTA: return 3;
            case MEDIA: return 2;
            default: return 1;
        }
    }
}
