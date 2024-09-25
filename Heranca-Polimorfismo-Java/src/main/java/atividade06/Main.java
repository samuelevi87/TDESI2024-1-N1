package main.java.atividade06;

import java.time.LocalDate;

public class Main {
    public static <GerenciadorTarefas, Tarefa> void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        // Adicionando tarefas de desenvolvimento
        Tarefa tarefaDev1 = new TarefaDesenvolvimento("Implementar API", "Desenvolver a API de login", LocalDate.of(2024, 10, 10), "Java", 4);
        Tarefa tarefaDev2 = new TarefaDesenvolvimento("Criar Frontend", "Criar a interface do usuário", LocalDate.of(2024, 9, 30), "React", 3);

        // Adicionando tarefas de revisão
        Tarefa tarefaRev1 = new TarefaRevisao("Revisar Código", "Revisar o código da API", LocalDate.of(2024, 9, 20), "João", 500);
        Tarefa tarefaRev2 = new TarefaRevisao("Revisar Frontend", "Revisar código do React", LocalDate.of(2024, 9, 15), "Maria", 300);

        // Adicionando tarefas de bug
        Tarefa tarefaBug1 = new TarefaBug("Corrigir Bug de Login", "Erro ao logar no sistema", LocalDate.of(2024, 9, 10), TarefaBug.Severidade.ALTA, "Web");
        Tarefa tarefaBug2 = new TarefaBug("Corrigir Bug de Renderização", "Falha ao renderizar imagens", LocalDate.of(2024, 9, 5), TarefaBug.Severidade.CRITICA, "Mobile");

        // Adicionar as tarefas no gerenciador
        gerenciador.adicionarTarefa(tarefaDev1);
        gerenciador.adicionarTarefa(tarefaDev2);
        gerenciador.adicionarTarefa(tarefaRev1);
        gerenciador.adicionarTarefa(tarefaRev2);
        gerenciador.adicionarTarefa(tarefaBug1);
        gerenciador.adicionarTarefa(tarefaBug2);

        // Listar todas as tarefas
        System.out.println("Todas as Tarefas:");
        gerenciador.listarTarefas().forEach(t -> System.out.println(t.getTitulo()));

        // Atualizar status de uma tarefa
        gerenciador.atualizarStatusTarefa(tarefaDev1, Status.EM_ANDAMENTO);

        // Listar tarefas por status
        System.out.println("\nTarefas em Andamento:");
        gerenciador.listarTarefasPorStatus(Status.EM_ANDAMENTO).forEach(t -> System.out.println(t.getTitulo()));

        // Listar tarefas por prioridade
        System.out.println("\nTarefas Ordenadas por Prioridade:");
        gerenciador.listarTarefasPorPrioridade().forEach(t -> System.out.println(t.getTitulo() + " - Prioridade: " + t.calcularPrioridade()));
    }
}
