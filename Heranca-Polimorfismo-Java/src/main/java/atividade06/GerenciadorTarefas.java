package main.java.atividade06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe que gerencia as tarefas de uma equipe de desenvolvimento.
 */
public class GerenciadorTarefas {

    /**
     * Lista que armazena todas as tarefas
     */
    private List<Tarefa> listaDeTarefas;

    /**
     * Construtor que inicializa a lista de tarefas.
     */
    public GerenciadorTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    /**
     * Método para adicionar uma nova tarefa à lista
     * @param tarefas
     */
    public void adicionarTarefa(Tarefa tarefas) {
        listaDeTarefas.add(tarefas);
    }

    /**
     * Método para listar todas as tarefas com suas devidas caracteríticas.
     */
    public void listarTarefas() {
        for (Tarefa tarefas : listaDeTarefas) {
            System.out.println(toString());
        }
    }

    /**
     * Método para listar tarefas com um determinado status.
     * @param status
     */
    public void listarTarefasPorStatus(Tarefa.Status status) {
        //Filtra a lista de tarefas com base no status fornecido e cria uma nova lista.
        List<Tarefa> tarefasFiltradas = listaDeTarefas.stream().filter(tarefa -> tarefa.getStatus() == status) //Filtra as tarefas com o status correspondente.
                .collect(Collectors.toList());// Coleta as tarefas filtradas em uma nova lista.
    }

    /**
     * Método para atualizar o status de uma tarefa com base no seu título.
     * @param titulo
     * @param novoStatus
     */
    public void atualizarStatus(String titulo, Tarefa.Status novoStatus) {
        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                tarefa.atualizarStatus(novoStatus);
                System.out.println("Status da tarefa '" + titulo + "' atualizado para: " + novoStatus);
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    /**
     * Método para listar as tarefas ordenadas por prioridade, da mais alta para a mais baixa.
     */
    public void listarTarefasPorPrioridade() {
        // Cria uma lista ordenada de tarefas com base na prioridade
        List<Tarefa> tarefasOrdenadas = listaDeTarefas.stream()
                .sorted(Comparator.comparingInt(Tarefa::calcularPrioridade).reversed()) // Ordena por prioridade em ordem decrescente.
                .collect(Collectors.toList());  // Coleta as tarefas ordenadas em uma nova lista
            for (Tarefa tarefa : tarefasOrdenadas) {
                System.out.println(tarefa.getTitulo() + " - Prioridade: " + tarefa.calcularPrioridade());
            }
    }
}
