package main.java.atividade06;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /**
         * Criação do gerenciador de tarefas
         */
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        /**
         * Criação de algumas tarefas
         */
        Tarefa tarefa1 = (new TarefaDesenvolvimento
                ("Desenvolver API",
                "Criar uma API RESTful",
                LocalDate.of(2024, 12, 31),
                "Java",
                4));

        Tarefa tarefa2 = (new TarefaRevisao
                ("Revisar documento",
                "Revisar o documento de especificações",
                LocalDate.of(2024, 10, 15),
                "João Silva",
                20));

        Tarefa tarefa3 = (new TarefaBug
                ("Corrigir bug na página",
                "Bug na página de login",
                LocalDate.of(2024, 9, 30),
                TarefaBug.Severidade.ALTA,
                "Web"));

        /**
         * Adicionando tarefas ao gerenciador
         */
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        gerenciador.adicionarTarefa(tarefa3);

        /**
         * Listando todas as tarefas
         */
        System.out.println("Todas as tarefas:");
        gerenciador.listarTarefas();
        System.out.println();

        /**
         * Listando tarefas por status (supondo que o status inicial seja PENDENTE)
         */
        System.out.println("Tarefas PENDENTES:");
        gerenciador.listarTarefasPorStatus(Tarefa.Status.PENDENTE);
        System.out.println();

        /**
         * Atualizando o status da primeira tarefa
         */
        gerenciador.atualizarStatusTarefa(0, Tarefa.Status.EM_ANDAMENTO);

        /**
         * Listando tarefas ordenadas por prioridade
         */
        System.out.println("Tarefas ordenadas por prioridade:");
        gerenciador.listarTarefasOrdenadasPorPrioridade();
    }
}
