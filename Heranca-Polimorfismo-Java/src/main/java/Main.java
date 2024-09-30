package main.java;

<<<<<<< HEAD
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
=======
import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;
import main.java.atividade01.CorrecaoEmpresa;
import main.java.atividade01.CorrecaoGerente;
import main.java.atividade02.CorrecaoAudioLivro;
import main.java.atividade02.CorrecaoBiblioteca;
import main.java.atividade02.CorrecaoEbook;
import main.java.atividade02.CorrecaoLivroFisico;
import main.java.atividade03.CorrecaoCaminhao;
import main.java.atividade03.CorrecaoCarro;
import main.java.atividade03.CorrecaoFrota;
import main.java.atividade03.CorrecaoMoto;
import main.java.atividade04.CorrecaoEmailNotificacao;
import main.java.atividade04.CorrecaoGerenciadorNotificacoes;
import main.java.atividade04.CorrecaoPushNotificacao;
import main.java.atividade04.CorrecaoSMSNotificacao;
import main.java.atividade05.CorrecaoBoleto;
import main.java.atividade05.CorrecaoCartaoCredito;
import main.java.atividade05.CorrecaoProcessadorPagamento;
import main.java.atividade05.CorrecaoTransferenciaBancaria;
import main.java.atividade06.*;
import main.java.atividade07.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //CorrecaoAtividade01();
        //CorrecaoAtividade02();
        //CorrecaoAtividade03();
        //CorrecaoAtividade04();
        //CorrecaoAtividade05();
        //CorrecaoAtividade06();
        CorrecaoAtividade07();


    }

    private static void CorrecaoAtividade07() {
        CorrecaoRedeSocial redeSocial = new CorrecaoRedeSocial();

        // Criando posts de texto
        CorrecaoTextPost textPost1 = new CorrecaoTextPost("Alice", "Olá, mundo!", List.of("saudação", "programação"));
        CorrecaoTextPost textPost2 = new CorrecaoTextPost("Bob", "Java é incrível!", List.of("java", "programação"));
        redeSocial.adicionarPost(textPost1);
        redeSocial.adicionarPost(textPost2);

        // Criando posts de imagem
        CorrecaoImagePost imagePost1 = new CorrecaoImagePost("Charlie", "Minha nova foto de perfil", "http://exemplo.com/foto1.jpg", "sepia");
        CorrecaoImagePost imagePost2 = new CorrecaoImagePost("Diana", "Paisagem linda", "http://exemplo.com/foto2.jpg", "vivid");
        redeSocial.adicionarPost(imagePost1);
        redeSocial.adicionarPost(imagePost2);

        // Criando posts de vídeo
        CorrecaoVideoPost videoPost1 = new CorrecaoVideoPost("Eve", "Tutorial de Java", "http://exemplo.com/video1.mp4", 600);
        CorrecaoVideoPost videoPost2 = new CorrecaoVideoPost("Frank", "Vlog de viagem", "http://exemplo.com/video2.mp4", 900);
        redeSocial.adicionarPost(videoPost1);
        redeSocial.adicionarPost(videoPost2);

        // Demonstrando funcionalidades
        System.out.println("Listando todos os posts:");
        redeSocial.listarPosts();

        System.out.println("\nBuscando posts de Alice:");
        List<CorrecaoPost> postsAlice = redeSocial.buscarPorAutor("Alice");
        postsAlice.forEach(post -> System.out.println(post.exibir()));

        System.out.println("\nAdicionando likes:");
        redeSocial.adicionarLike(1);
        redeSocial.adicionarLike(1);
        redeSocial.adicionarLike(3);
        redeSocial.adicionarLike(5);
        redeSocial.adicionarLike(5);
        redeSocial.adicionarLike(5);

        System.out.println("\nExibindo post mais popular:");
        redeSocial.exibirPostMaisPopular();

        // Demonstrando métodos simples
        System.out.println("\nUsando métodos simples:");
        System.out.println("Listando posts (versão simples):");
        redeSocial.listarPostsSimples();

        System.out.println("\nBuscando posts de Bob (versão simples):");
        List<CorrecaoPost> postsBob = redeSocial.buscarPorAutorSimples("Bob");
        for (CorrecaoPost post : postsBob) {
            System.out.println(post.exibir());
        }

        System.out.println("\nAdicionando like (versão simples):");
        redeSocial.adicionarLikeSimples(2);

        System.out.println("\nExibindo post mais popular (versão simples):");
        redeSocial.exibirPostMaisPopularSimples();
    }

    private static void CorrecaoAtividade06() {
        CorrecaoGerenciadorTarefas gerenciador = new CorrecaoGerenciadorTarefas();

        // Adicionando tarefas
        gerenciador.adicionarTarefa(new CorrecaoTarefaDesenvolvimento("Implementar Login", "Criar sistema de login",
                LocalDate.now().plusDays(7), "Java", 3));
        gerenciador.adicionarTarefa(new CorrecaoTarefaRevisao("Revisar PR #123", "Revisar pull request de feature X",
                LocalDate.now().plusDays(2), "João", 500));
        gerenciador.adicionarTarefa(new CorrecaoTarefaBug("Corrigir bug #456", "Corrigir crash na tela inicial",
                LocalDate.now().plusDays(1), CorrecaoTarefaBug.Severidade.ALTA, "Android"));

        // Listando todas as tarefas (usando o método com stream)
        System.out.println("Todas as tarefas (usando streams):");
        gerenciador.listarTarefas().forEach(System.out::println);

        // Listando todas as tarefas (usando o método simples)
        System.out.println("\nTodas as tarefas (usando método simples):");
        gerenciador.listarTarefasSimples().forEach(System.out::println);

        // Listando tarefas por status (usando o método com stream)
        System.out.println("\nTarefas pendentes (usando streams):");
        gerenciador.listarTarefasPorStatus(CorrecaoTarefa.Status.PENDENTE).forEach(System.out::println);

        // Listando tarefas por status (usando o método simples)
        System.out.println("\nTarefas pendentes (usando método simples):");
        gerenciador.listarTarefasPorStatusSimples(CorrecaoTarefa.Status.PENDENTE).forEach(System.out::println);

        // Atualizando status de uma tarefa (usando o método com stream)
        gerenciador.atualizarStatusTarefa("Implementar Login", CorrecaoTarefa.Status.EM_ANDAMENTO);
        System.out.println("\nStatus da tarefa 'Implementar Login' atualizado para EM_ANDAMENTO");

        // Atualizando status de outra tarefa (usando o método simples)
        gerenciador.atualizarStatusTarefaSimples("Revisar PR #123", CorrecaoTarefa.Status.EM_ANDAMENTO);
        System.out.println("Status da tarefa 'Revisar PR #123' atualizado para EM_ANDAMENTO");

        // Listando tarefas ordenadas por prioridade (usando o método com stream)
        System.out.println("\nTarefas ordenadas por prioridade (usando streams):");
        medirTempo(() -> gerenciador.listarTarefasOrdenadasPorPrioridade().forEach(System.out::println));

        // Listando tarefas ordenadas por prioridade (usando o método simples)
        System.out.println("\nTarefas ordenadas por prioridade (usando método simples):");
        medirTempo(() -> gerenciador.listarTarefasOrdenadasPorPrioridadeSimples().forEach(System.out::println));
    }

    private static void CorrecaoAtividade05() {
        CorrecaoProcessadorPagamento processador = new CorrecaoProcessadorPagamento();

        processador.adicionarFormaPagamento(new CorrecaoCartaoCredito("Cartão de Crédito", 1.5, "1234-5678-9012-3456", "Visa"));
        processador.adicionarFormaPagamento(new CorrecaoBoleto("Boleto", 2.0, "23791.23405 67890.123456 78901.234567 8 12345678901234"));
        processador.adicionarFormaPagamento(new CorrecaoTransferenciaBancaria("Transferência", 5.0, "Banco XYZ", "1234", "56789-0"));

        System.out.println("Formas de pagamento disponíveis:");
        processador.listarFormasPagamento().forEach(System.out::println);

        double valorPagamento = 100.0;

        System.out.println("\nProcessando pagamentos:");
        double totalCartao = processador.processarPagamento(valorPagamento, "Cartão de Crédito");
        System.out.println("Total pago (Cartão de Crédito): R$" + String.format("%.2f", totalCartao));

        double totalBoleto = processador.processarPagamentoSimples(valorPagamento, "Boleto");
        System.out.println("Total pago (Boleto): R$" + String.format("%.2f", totalBoleto));

        double totalTransferencia = processador.processarPagamento(valorPagamento, "Transferência");
        System.out.println("Total pago (Transferência): R$" + String.format("%.2f", totalTransferencia));

        System.out.println("\nEstornando pagamentos:");
        processador.estornarPagamento(valorPagamento, "Cartão de Crédito");
        processador.estornarPagamento(valorPagamento, "Boleto");
        processador.estornarPagamento(valorPagamento, "Transferência");
    }

    private static void CorrecaoAtividade04() {
        // Código para testar a atividade 04
        CorrecaoGerenciadorNotificacoes gerenciador = new CorrecaoGerenciadorNotificacoes();

        gerenciador.adicionarNotificacao(new CorrecaoEmailNotificacao("Oferta especial!", "usuario@email.com", "Promoção"));
        gerenciador.adicionarNotificacao(new CorrecaoSMSNotificacao("Seu código de verificação é 123456", "João", "123456789"));
        gerenciador.adicionarNotificacao(new CorrecaoPushNotificacao("Nova mensagem recebida", "Maria", "device_id_123"));

        System.out.println("Enviando todas as notificações:");
        gerenciador.enviarTodasNotificacoes();

        System.out.println("\nLista de notificações enviadas:");
        gerenciador.listarNotificacoesEnviadas().forEach(System.out::println);

        System.out.println("\nEnviando notificações (versão simples):");
        gerenciador.enviarTodasNotificacoesSimples();

        System.out.println("\nLista de notificações enviadas (versão simples):");
        gerenciador.listarNotificacoesEnviadasSimples().forEach(System.out::println);
    }
>>>>>>> a61a85f515121f620658e79746528ddfab9adac3

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

    /**
     * Mede o tempo de execução de uma operação.
     *
     * @param runnable A operação a ser executada e medida.
     */
    private static void medirTempo(Runnable runnable) {
        long inicio = System.nanoTime();
        runnable.run();
        long fim = System.nanoTime();
        long duracaoNanos = fim - inicio;
        System.out.printf("Tempo de execução: %.3f ms%n", duracaoNanos / 1000000.0);
    }
}
