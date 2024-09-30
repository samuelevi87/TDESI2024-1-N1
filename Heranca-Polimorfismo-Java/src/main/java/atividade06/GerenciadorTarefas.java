package main.java.atividade06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
    public void adicionarTarefas(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    /**
     * imprime todas as tarefas
     */
    public void listarTodasTarefas(){
        tarefas.forEach(System.out::println);
    }

    /**
     * Lista todas as tarefas com o determinado status
     * @param status status a ser buscado
     */
    public void listarPorStatus(Status status){
        tarefas.stream().filter(tarefa -> tarefa.getStatus().equals(status)).forEach(System.out::println);
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


}
