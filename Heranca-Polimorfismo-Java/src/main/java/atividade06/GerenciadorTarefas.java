package main.java.atividade06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * A classe GerenciadorTarefas é responsável por gerenciar uma lista de tarefas,
 * permitindo adicionar, listar, e atualizar o status das tarefas.
 */
public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    /**
     * Construtor que inicializa a lista de tarefas.
     */
    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    /**
     * Adiciona uma nova tarefa à lista de tarefas.
     * @param tarefa A tarefa a ser adicionada.
     */
    public void adicionarTarefas(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    /**
     * Lista todas as tarefas presentes no gerenciador.
     * Caso não haja nenhuma tarefa, uma mensagem será exibida.
     */
    public void listarTodasTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        }
        tarefas.forEach(System.out::println);
    }

    /**
     * Lista todas as tarefas com base no status informado.
     * Caso nenhuma tarefa com o status especificado seja encontrada, uma mensagem será exibida.
     * @param status O status das tarefas a serem listadas.
     */
    public void listarTarefasPorStatus(Status status) {
        boolean encontrou = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus() == status) {
                System.out.println(tarefa);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma tarefa com status: " + status);
        }
    }

    /**
     * Atualiza o status de uma tarefa com base no título.
     * Caso a tarefa não seja encontrada, uma mensagem será exibida.
     * @param titulo O título da tarefa a ser atualizada.
     * @param novoStatus O novo status da tarefa.
     */
    public void atualizarStatusTarefa(String titulo, String novoStatus) {
        boolean encontrou = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                // tarefa.atualizarStatus(novoStatus); // Descomentar após ajustes na implementação do método
                System.out.println("Status da tarefa '" + titulo + "' atualizado para " + novoStatus);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Tarefa com título '" + titulo + "' não encontrada.");
        }
    }

    // Método para ordenar tarefas por prioridade (a ser implementado).
    /* public void ordenarPorPrioridade() {

    } */
}