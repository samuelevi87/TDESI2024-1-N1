package main.java.atividade06;

import main.java.atividade07.Tarefa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    // Adicionar tarefa
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    // Listar todas as tarefas
    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.getTitulo() + " - Status: " + tarefa.getStatus());
        }
    }

    // Listar tarefas por status
    public void listarTarefasPorStatus(Tarefa.Status status) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus() == status) {
                System.out.println(tarefa.getTitulo() + " - Status: " + tarefa.getStatus());
            }
        }
    }

    // Atualizar o status de uma tarefa
    public void atualizarStatus(Tarefa tarefa, Tarefa.Status novoStatus) {
        tarefa.atualizarStatus(novoStatus);
    }

    // Listar tarefas ordenadas por prioridade
    public void listarTarefasOrdenadasPorPrioridade() {
        tarefas.sort(Comparator.comparingInt(Tarefa::calcularPrioridade).reversed());
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.getTitulo() + " - Prioridade: " + tarefa.calcularPrioridade());
        }
    }
}
