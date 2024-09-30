package main.java;

import main.java.atividade06.GerenciadorTarefas;
import main.java.atividade06.TarefaBug;
import main.java.atividade06.TarefaDesenvolvimento;
import main.java.atividade06.TarefaRevisao;
import main.java.atividade07.Tarefa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        // Adicionando tarefas de desenvolvimento
        TarefaDesenvolvimento tarefaDev1 = new TarefaDesenvolvimento(
                "Implementar Login", "Criar a tela de login", LocalDate.of(2024, 10, 1),
                LocalDate.of(2024, 10, 5), "JAVA", 3);
        TarefaDesenvolvimento tarefaDev2 = new TarefaDesenvolvimento(
                "Desenvolver API", "Criar a API REST", LocalDate.of(2024, 10, 5),
                LocalDate.of(2024, 10, 5), "Python", 3);
        // Adicionando tarefas de revisão
        TarefaRevisao tarefaRev1 = new TarefaRevisao(
                "Revisar Código de Login", "Revisar implementação do login", LocalDate.of(2024, 10, 2),
                LocalDate.of(2024, 10, 5), "Alice", 900);
        TarefaRevisao tarefaRev2 = new TarefaRevisao(
                "Revisar Documentação", "Revisar a documentação da API", LocalDate.of(2024, 10, 6),
                LocalDate.of(2024, 10, 5), "aaa", 50);

        // Adicionando tarefas de bug
        TarefaBug tarefaBug1 = new TarefaBug(
                "Corrigir Falha no Login", "Erro 500 ao tentar logar", LocalDate.of(2024, 10, 3),
                LocalDate.of(2024, 10, 5), "Web");
        TarefaBug tarefaBug2 = new TarefaBug(
                "Erro na API", "API não retorna dados corretos", LocalDate.of(2024, 10, 7),
                LocalDate.of(2024, 10, 5), "Mobile");

        // Adicionando tarefas ao gerenciador
        gerenciador.adicionarTarefa(tarefaDev1);
        gerenciador.adicionarTarefa(tarefaDev2);
        gerenciador.adicionarTarefa(tarefaRev1);
        gerenciador.adicionarTarefa(tarefaRev2);
        gerenciador.adicionarTarefa(tarefaBug1);
        gerenciador.adicionarTarefa(tarefaBug2);

        // Listar todas as tarefas
        System.out.println("Todas as Tarefas:");
        gerenciador.listarTarefas();

        // Listar tarefas por status
        System.out.println("\nTarefas Pendentes:");
        gerenciador.listarTarefasPorStatus(Tarefa.Status.PENDENTE);

        // Atualizando o status de uma tarefa
        gerenciador.atualizarStatus(tarefaDev1, Tarefa.Status.EM_ANDAMENTO);
        System.out.println("\nApós atualizar o status da tarefa de desenvolvimento:");
        gerenciador.listarTarefas();

        // Listar tarefas ordenadas por prioridade
        System.out.println("\nTarefas Ordenadas por Prioridade:");
        gerenciador.listarTarefasOrdenadasPorPrioridade();
    }
}
