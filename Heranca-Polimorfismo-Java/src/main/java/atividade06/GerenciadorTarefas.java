package main.java.atividade06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    /**
     * Inicializa o arrayList de tarefas
     */
    public GerenciadorTarefas(){
        this.tarefas = new ArrayList<>();
    }

    /**
     * Adiciona uma tarefa à lista de tarefas
     * @param tarefa tarefa a ser adicionada
     */
    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    /**
     * Lista todas as tarefas
     *
     * @return Uma lista de strings representando as tarefas.
     */
    public List<String> listarTodasTarefas(){
        return tarefas.stream().map(Tarefa::toString).collect(Collectors.toList());
    }
    /**
     * Lista todas as tarefas (versão simples).
     *
     * @return Uma lista de strings representando as tarefas.
     */
    public List<String> listarTarefasSimples() {
        List<String> listaTarefas = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            listaTarefas.add(tarefa.toString());
        }
        return listaTarefas;
    }

    /**
     * Lista todas as tarefas com o determinado status
     * @param status status a ser buscado
     */
    public List<String> listarPorStatus(Status status){
        return tarefas.stream().filter(tarefa -> tarefa.getStatus() == status)
                .map(Tarefa::toString).collect(Collectors.toList());
    }
    /**
     * Lista tarefas por status (versão simples).
     *
     * @param status O status das tarefas a serem listadas.
     * @return Uma lista de strings representando as tarefas com o status especificado.
     */
    public List<String> listarTarefasPorStatusSimples(Status status) {
        List<String> tarefasFiltradas = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus() == status) {
                tarefasFiltradas.add(tarefa.toString());
            }
        }
        return tarefasFiltradas;
    }

    /**
     * Atualiza o status da tarefa
     * @param tituloTarefa titulo da tarefa a ser atualizada
     * @param novoStatus novo status da tarefa
     */
    public void atualizarStatusTarefa(String tituloTarefa, Status novoStatus){
        tarefas.stream().filter(tarefa -> tarefa.getTitulo().equalsIgnoreCase(tituloTarefa)).findFirst()
                .ifPresent(tarefa -> tarefa.atualizarStatus(novoStatus));
    }


    /**
     * Imprime as tarefas em ordem de prioridade, da maior prioridade para a menor
     */
    public void ordenarPorPrioridade(){
        tarefas.stream().sorted(Comparator.comparingInt(Tarefa::calcularPrioridade).reversed()).forEach(System.out::println);
    }
    /**
     * Lista tarefas ordenadas por prioridade.
     *
     * @return Uma lista de strings representando as tarefas ordenadas por prioridade.
     */
    public List<String> listarTarefasOrdenadasPorPrioridade() {
        return tarefas.stream()
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
        List<Tarefa> tarefasOrdenadas = new ArrayList<>(tarefas);
        tarefasOrdenadas.sort((t1, t2) -> Integer.compare(t2.calcularPrioridade(), t1.calcularPrioridade()));

        List<String> resultado = new ArrayList<>();
        for (Tarefa tarefa : tarefasOrdenadas) {
            resultado.add(tarefa.getTitulo() + " (Prioridade: " + tarefa.calcularPrioridade() + ")");
        }
        return resultado;
    }


}
