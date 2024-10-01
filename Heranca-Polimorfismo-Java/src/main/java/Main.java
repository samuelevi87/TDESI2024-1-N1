package main.java;

import main.java.atividade03.*;
import main.java.atividade04.*;
import main.java.atividade06.*;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        GerenciadorTarefas gerenciadorTarefas1 = new GerenciadorTarefas();

        TarefaBug tarefaBug1 = new TarefaBug("Bug na Tela de Login", "Corrigir erro de autenticação",
                LocalDate.now().plusDays(2), LocalDate.parse("2024-10-10"), Status.CONCLUIDA, "VSCODe", Severiedade.ALTA);

        TarefaBug tarefaBug2 = new TarefaBug("Bug na Tela de Senha", "Corrigir erro de autenticação",
                LocalDate.now().plusDays(2), LocalDate.parse("2024-09-30"), Status.PENDENTE, "VSCODe", Severiedade.MEDIA);

        TarefaBug tarefaBug3 = new TarefaBug("Bug na Tela de Produção", "Corrigir erro de autenticação",
                LocalDate.now().plusDays(2), LocalDate.parse("2024-10-01"), Status.PENDENTE, "VSCODe", Severiedade.BAIXA);


        gerenciadorTarefas1.adicionarTarefas(tarefaBug1);
        gerenciadorTarefas1.adicionarTarefas(tarefaBug2);
        gerenciadorTarefas1.adicionarTarefas(tarefaBug3);


        gerenciadorTarefas1.listarTarefasPorPrioridade();
        System.out.println("\n" + "--- Lista de todoas tarefas ---");
        gerenciadorTarefas1.listarTodasTarefas();

    }
}
