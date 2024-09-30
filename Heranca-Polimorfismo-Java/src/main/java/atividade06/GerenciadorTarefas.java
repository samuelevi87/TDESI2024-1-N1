package main.java.atividade06;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {

    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefas(Tarefa tarefaParaAdicionar) {
        this.tarefas.add(tarefaParaAdicionar);
    }

    public void listarTodasTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.toString());
        }
    }

    public void listaTarefaPorStatus(Status statusParaFiltro) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus() == statusParaFiltro) {
                System.out.println(tarefa.toString());
            }
        }
    }

    public void atualizarStatusTarefa(String titulo, Status novoStatus) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus().equals(titulo)) {
                tarefa.atualizarStatus(novoStatus);
                System.out.println("Status da tarefa: " + titulo + "atualizado para: " + novoStatus);
                return;
            }
        }
        System.out.println("Tarefa nço encontrada");
    }

    public void listarTarefasPorPrioridade() {
        for (int i = 0; i < tarefas.size() - 1; i++) {
            for (int j = 0; j < tarefas.size() - 1 - i; j++) {
                if (tarefas.get(j).calcularPrioridade() > tarefas.get(j + 1).calcularPrioridade()) {

                    Tarefa temporaria = tarefas.get(j);
                    tarefas.set(j, tarefas.get(j + 1));
                    tarefas.set(j + 1, temporaria);
                }
            }
        }
        System.out.println("Tarefas conforme Prioridade");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.toString() + "Prioridade: " + tarefa.calcularPrioridade());
        }
    }

}
