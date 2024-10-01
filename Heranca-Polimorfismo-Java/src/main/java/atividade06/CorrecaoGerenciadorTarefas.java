package main.java.atividade06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Gerencia as tarefas do sistema.
 */
public class CorrecaoGerenciadorTarefas {
    private List<CorrecaoTarefa> listaDeTarefas;

    /**
     * Constrói um novo GerenciadorTarefas.
     * Inicializa a lista de tarefas.
     */
    public CorrecaoGerenciadorTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    /**
     * Adiciona uma tarefa ao gerenciador.
     *
     * @param tarefa A tarefa a ser adicionada.
     */
    public void adicionarTarefa(CorrecaoTarefa tarefa) {
        listaDeTarefas.add(tarefa);
    }

    /**
     * Lista todas as tarefas.
     *
     * @return Uma lista de strings representando as tarefas.
     */
    public List<String> listarTarefas() {
        return listaDeTarefas.stream()
                .map(CorrecaoTarefa::toString)
                .collect(Collectors.toList());
    }

    /**
     * Lista todas as tarefas (versão simples).
     *
     * @return Uma lista de strings representando as tarefas.
     */
    public List<String> listarTarefasSimples() {
        List<String> listaTarefas = new ArrayList<>();
        for (CorrecaoTarefa tarefa : listaDeTarefas) {
            listaTarefas.add(tarefa.toString());
        }
        return listaTarefas;
    }

    /**
     * Lista tarefas por status.
     *
     * @param status O status das tarefas a serem listadas.
     * @return Uma lista de strings representando as tarefas com o status especificado.
     */
    public List<String> listarTarefasPorStatus(CorrecaoTarefa.Status status) {
        return listaDeTarefas.stream()
                .filter(t -> t.getStatus() == status)
                .map(CorrecaoTarefa::toString)
                .collect(Collectors.toList());
    }

    /**
     * Lista tarefas por status (versão simples).
     *
     * @param status O status das tarefas a serem listadas.
     * @return Uma lista de strings representando as tarefas com o status especificado.
     */
    public List<String> listarTarefasPorStatusSimples(CorrecaoTarefa.Status status) {
        List<String> tarefasFiltradas = new ArrayList<>();
        for (CorrecaoTarefa tarefa : listaDeTarefas) {
            if (tarefa.getStatus() == status) {
                tarefasFiltradas.add(tarefa.toString());
            }
        }
        return tarefasFiltradas;
    }

    /**
     * Atualiza o status de uma tarefa.
     *
     * @param titulo O título da tarefa a ser atualizada.
     * @param novoStatus O novo status da tarefa.
     */
    public void atualizarStatusTarefa(String titulo, CorrecaoTarefa.Status novoStatus) {
        listaDeTarefas.stream()
                .filter(t -> t.getTitulo().equals(titulo))
                .findFirst()
                .ifPresent(t -> t.atualizarStatus(novoStatus));
    }

    /**
     * Atualiza o status de uma tarefa (versão simples).
     *
     * @param titulo O título da tarefa a ser atualizada.
     * @param novoStatus O novo status da tarefa.
     */
    public void atualizarStatusTarefaSimples(String titulo, CorrecaoTarefa.Status novoStatus) {
        for (CorrecaoTarefa tarefa : listaDeTarefas) {
            if (tarefa.getTitulo().equals(titulo)) {
                tarefa.atualizarStatus(novoStatus);
                break;
            }
        }
    }

    /**
     * Lista tarefas ordenadas por prioridade.
     *
     * @return Uma lista de strings representando as tarefas ordenadas por prioridade.
     */
    public List<String> listarTarefasOrdenadasPorPrioridade() {
        return listaDeTarefas.stream()
                .sorted((t1, t2) -> Integer.compare(t2.calcularPrioridade(), t1.calcularPrioridade()))
                .map(t -> t.getTitulo() + " (Prioridade: " + t.calcularPrioridade() + ")")
                .collect(Collectors.toList());
    }

    /**
     * Lista tarefas ordenadas por prioridade (versão simples).
     *
     * @return Uma lista de strings representando as tarefas ordenadas por prioridade.
     */
    public List<String> listarTarefasOrdenadasPorPrioridadeSimples() {
        List<CorrecaoTarefa> tarefasOrdenadas = new ArrayList<>(listaDeTarefas);
        tarefasOrdenadas.sort((t1, t2) -> Integer.compare(t2.calcularPrioridade(), t1.calcularPrioridade()));

        List<String> resultado = new ArrayList<>();
        for (CorrecaoTarefa tarefa : tarefasOrdenadas) {
            resultado.add(tarefa.getTitulo() + " (Prioridade: " + tarefa.calcularPrioridade() + ")");
        }
        return resultado;
    }
}