package main.java.atividade06;

public class TarefaBug extends Tarefa{
    private Severidade severidade;
    private String plataforma;

    public TarefaBug(String titulo, String descricao, LocalDate dataLimite, Severidade severidade, String plataforma) {
        super(titulo, descricao, dataLimite);
        this.severidade = severidade;
        this.plataforma = plataforma;
    }
    public enum Severidade {
        BAIXA, MEDIA, ALTA, CRITICA
    }

    @Override
    public int calcularPrioridade() {
        switch (severidade) {
            case BAIXA: return 1;
            case MEDIA: return 2;
            case ALTA: return 3;
            case CRITICA: return 4;
            default: return 0;
        }
    }

    // Getters e Setters
    public Severidade getSeveridade() {
        return severidade;
    }

    public void setSeveridade(Severidade severidade) {
        this.severidade = severidade;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
