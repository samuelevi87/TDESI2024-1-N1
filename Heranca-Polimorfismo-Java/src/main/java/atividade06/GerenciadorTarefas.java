package main.java.atividade06;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
public class GerenciadorTarefas {
    private static List<Tarefa> tarefas;

    /**
     * Constrói um novo Gerenciador de Tarefas.
     * Inicializa a lista de tarefas.
     */
    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    /**
     * Adiciona uma tarefa ao gerenciador.
     *
     * @param tarefa A tarefa a ser adicionada.
     */
    public static void adicionarTarefa(Tarefa tarefa) {
        if (tarefa == null) {
            throw new IllegalArgumentException("Tarefa não pode ser nula.");
        }
        tarefas.add(tarefa);
    }

    /**
     * Lista todas as tarefas.
     */
    public void listarTarefas() {
        tarefas.forEach(System.out::println);
    }

    /**
     * Lista tarefas filtradas por status.
     *
     * @param status O status a ser filtrado.
     */
    public void listarTarefasPorStatus(Tarefa.Status status) {
        tarefas.stream()
                .filter(tarefa -> tarefa.getStatus() == status)
                .forEach(System.out::println);
    }

    /**
     * Atualiza o status de uma tarefa pelo índice.
     *
     * @param index O índice da tarefa a ser atualizada.
     * @param novoStatus O novo status a ser definido.
     * @throws IndexOutOfBoundsException se o índice for inválido.
     */
    public void atualizarStatusTarefa(int index, Tarefa.Status novoStatus) {
        validarIndice(index);
        tarefas.get(index).atualizarStatus(novoStatus);
    }

    /**
     * Lista tarefas ordenadas por prioridade.
     */
    public void listarTarefasOrdenadasPorPrioridade() {
        tarefas.stream()
                .sorted(Comparator.comparingInt(Tarefa::calcularPrioridade).reversed())
                .forEach(System.out::println);
    }

    /**
     * Valida o índice fornecido.
     *
     * @param index O índice a ser validado.
     * @throws IndexOutOfBoundsException se o índice for inválido.
     */
    private void validarIndice(int index) {
        if (index < 0 || index >= tarefas.size()) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
    }
}
