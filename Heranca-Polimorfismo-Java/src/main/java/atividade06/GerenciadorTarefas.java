package main.java.atividade06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefas(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTodasTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        }
        tarefas.forEach(System.out::println);
    }

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

    public void atualizarStatusTarefa(String titulo, String novoStatus) {
        boolean encontrou = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                // tarefa.atualizarStatus(novoStatus);
                System.out.println("Status da tarefa '" + titulo + "' atualizado para " + novoStatus);
                encontrou = true;
                break;
            }
        }
        if(!encontrou){
            System.out.println("Tarefa com título '" + titulo + "' não encontrada.");
        }
    }

    /* public ordenarPorPrioridade() {

    } */
}