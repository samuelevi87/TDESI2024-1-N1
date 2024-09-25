import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    // Adicionar tarefas
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    // Listar todas as tarefas
    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    // Listar tarefas por status
    public List<Tarefa> listarTarefasPorStatus(Status status) {
        return tarefas.stream()
                .filter(t -> t.getStatus() == status)
                .collect(Collectors.toList());
    }

    // Atualizar status de uma tarefa
    public void atualizarStatusTarefa(Tarefa tarefa, Status novoStatus) {
        tarefa.atualizarStatus(novoStatus);
    }

    // Listar tarefas ordenadas por prioridade
    public List<Tarefa> listarTarefasPorPrioridade() {
        return tarefas.stream()
                .sorted(Comparator.comparingInt(Tarefa::calcularPrioridade).reversed())
                .collect(Collectors.toList());
    }
}
