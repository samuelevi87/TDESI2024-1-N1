package main.java;

<<<<<<< HEAD
import main.java.atividade05.ProcessadorPagamento;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();
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
import main.java.atividade08.*;

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
        //CorrecaoAtividade07();
        //CorrecaoAtividade08();


    }

    private static void CorrecaoAtividade08() {
        CorrecaoLoja loja = new CorrecaoLoja();
        CorrecaoCarrinho carrinho = new CorrecaoCarrinho();

        // Adicionando produtos à loja
        loja.adicionarProduto(new CorrecaoProdutoFisico("Smartphone", "Último modelo", 999.99, 50, 0.3, "15x7x1 cm"));
        loja.adicionarProduto(new CorrecaoProdutoFisico("Livro", "Bestseller", 29.99, 100, 0.5, "20x15x3 cm"));
        loja.adicionarProduto(new CorrecaoProdutoDigital("E-book", "Versão digital do bestseller", 9.99, 1000, 2.5, "PDF"));
        loja.adicionarProduto(new CorrecaoProdutoDigital("Curso online", "Aprenda programação", 199.99, 500, 1500, "Video"));
        loja.adicionarProduto(new CorrecaoServico("Consultoria", "Consultoria em TI", 150.00, 20, 2));

        // Demonstrando busca por nome
        System.out.println("Buscando produtos com 'book':");
        loja.buscarPorNome("book").forEach(System.out::println);

        // Demonstrando listagem por categoria
        System.out.println("\nListando produtos físicos:");
        loja.listarPorCategoria(CorrecaoProdutoFisico.class).forEach(System.out::println);

        // Realizando uma compra
        CorrecaoProduto smartphone = loja.buscarPorNome("Smartphone").getFirst();
        CorrecaoProduto ebook = loja.buscarPorNome("E-book").get(0);
        carrinho.adicionarProduto(smartphone);
        carrinho.adicionarProduto(ebook);

        System.out.println("\nItens no carrinho:");
        carrinho.listarItens();

        System.out.println("\nTotal da compra: R$" + String.format("%.2f", carrinho.calcularTotal()));

        // Demonstrando métodos simples
        System.out.println("\nUsando métodos simples:");
        System.out.println("Buscando produtos com 'curso' (versão simples):");
        loja.buscarPorNomeSimples("curso").forEach(System.out::println);

        System.out.println("\nListando serviços (versão simples):");
        loja.listarPorCategoriaSimples(CorrecaoServico.class).forEach(System.out::println);

        System.out.println("\nItens no carrinho (versão simples):");
        carrinho.listarItensSimples();

        System.out.println("\nTotal da compra (versão simples): R$" + String.format("%.2f", carrinho.calcularTotalSimples()));
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

    private static void CorrecaoAtividade03() {
        // Código para testar a atividade 03
        CorrecaoFrota frota = new CorrecaoFrota();

        frota.adicionarVeiculo(new CorrecaoCarro("ABC1234", "Fiat Uno", 2015, 50000, 4));
        frota.adicionarVeiculo(new CorrecaoCarro("DEF5678", "Ford Ka", 2018, 30000, 4));
        frota.adicionarVeiculo(new CorrecaoCaminhao("GHI9012", "Volvo FH", 2020, 100000, 20));
        frota.adicionarVeiculo(new CorrecaoCaminhao("JKL3456", "Scania R450", 2019, 150000, 25));
        frota.adicionarVeiculo(new CorrecaoMoto("MNO7890", "Honda CG", 2021, 10000, 150));
        frota.adicionarVeiculo(new CorrecaoMoto("PQR1234", "Yamaha Fazer", 2020, 15000, 250));

        System.out.println("Lista de Veículos na Frota:");
        frota.listarVeiculos().forEach(System.out::println);

        double distanciaViagem = 1000; // km
        System.out.println("\nCusto total da viagem de " + distanciaViagem + " km: R$" +
                String.format("%.2f", frota.calcularCustoTotalViagem(distanciaViagem)));

        System.out.println("\nRemovendo veículo com placa ABC1234");
        frota.removerVeiculo("ABC1234");

        System.out.println("\nLista atualizada de Veículos na Frota:");
        frota.listarVeiculosSimples().forEach(System.out::println);

        System.out.println("\nCusto total da nova viagem de " + distanciaViagem + " km: R$" +
                String.format("%.2f", frota.calcularCustoTotalViagemSimples(distanciaViagem)));
    }

    private static void CorrecaoAtividade02() {
        // Código para testar a atividade 02
        CorrecaoBiblioteca biblioteca = new CorrecaoBiblioteca();

        biblioteca.adicionarItem(new CorrecaoLivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 1178));
        biblioteca.adicionarItem(new CorrecaoEbook("1984", "George Orwell", 1949, 2.5));
        biblioteca.adicionarItem(new CorrecaoAudioLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 520));

        System.out.println("Itens disponíveis:");
        biblioteca.listarItensDisponiveis();

        System.out.println("\nEmprestando 'O Senhor dos Anéis':");
        if (biblioteca.emprestarItem("O Senhor dos Anéis")) {
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Não foi possível emprestar o livro.");
        }

        System.out.println("\nItens disponíveis após empréstimo:");
        biblioteca.listarItensDisponiveis();

        System.out.println("\nDevolvendo 'O Senhor dos Anéis' com 5 dias de atraso:");
        biblioteca.devolverItem("O Senhor dos Anéis");
        double multa = biblioteca.calcularMulta("O Senhor dos Anéis", 5);
        System.out.println("Multa a pagar: R$" + String.format("%.2f", multa));

        System.out.println("\nItens disponíveis após devolução:");
        biblioteca.listarItensDisponiveis();
    }
>>>>>>> fec0f85052335bfae6c7d7b99c1fb5e30d6629f3

        processador.adicionarFormaPagamento(new CartaoCredito("1234-5678-9101-1121", "Visa", 2.5));
        processador.adicionarFormaPagamento(new Boleto("123456789012", 1.0));
        processador.adicionarFormaPagamento(new TransferenciaBancaria("Banco do Brasil", "1234", "56789-0", 1.5));

        processador.listarFormasPagamento();

        processador.processarPagamento(100.0, "Cartão de Crédito");
        processador.processarPagamento(150.0, "Boleto");
        processador.processarPagamento(200.0, "Transferência Bancária");

        processador.estornarPagamento(100.0, "Cartão de Crédito");
        processador.estornarPagamento(150.0, "Boleto");
        processador.estornarPagamento(200.0, "Transferência Bancária");
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
        public static void GerenciadorTarefas;() {
            GerenciadorTarefas gerenciador = new GerenciadorTarefas();

            // Adicionando tarefas
            Tarefa tarefa1 = new TarefaDesenvolvimento("Implementar API", "Criar API para gerenciamento de usuários", LocalDate.of(2024, 10, 15), "Java", 4);
            Tarefa tarefa2 = new TarefaRevisao("Revisar Código", "Revisar o código da feature X", LocalDate.of(2024, 10, 10), "Alice", 300);
            Tarefa tarefa3 = new TarefaBug("Corrigir Bug", "Corrigir falha na página de login", LocalDate.of(2024, 10, 5), Severidade.CRITICA, "Web");
            Tarefa tarefa4 = new TarefaDesenvolvimento("Documentar Código", "Documentar o código da feature Y", LocalDate.of(2024, 10, 20), "Python", 3);
            Tarefa tarefa5 = new TarefaRevisao("Revisar Documentação", "Revisar a documentação do projeto", LocalDate.of(2024, 10, 8), "Bob", 150);
            Tarefa tarefa6 = new TarefaBug("Corrigir Bug de Performance", "Aumentar a performance do sistema", LocalDate.of(2024, 10, 12), Severidade.MEDIA, "Mobile");

            gerenciador.adicionarTarefa(tarefa1);
            gerenciador.adicionarTarefa(tarefa2);
            gerenciador.adicionarTarefa(tarefa3);
            gerenciador.adicionarTarefa(tarefa4);
            gerenciador.adicionarTarefa(tarefa5);
            gerenciador.adicionarTarefa(tarefa6);

            // Listar todas as tarefas
            System.out.println("Todas as Tarefas:");
            for (Tarefa t : gerenciador.listarTarefas()) {
                System.out.println(t.getTitulo() + " - Status: " + t.getStatus());
            }

            // Listar tarefas por status
            System.out.println("\nTarefas Pendentes:");
            for (Tarefa t : gerenciador.listarPorStatus(Status.PENDENTE)) {
                System.out.println(t.getTitulo());
            }

            // Atualizar status de uma tarefa
            gerenciador.atualizarStatus(tarefa1, Status.EM_ANDAMENTO);
            System.out.println("\nApós atualização:");
            System.out.println(tarefa1.getTitulo() + " - Status: " + tarefa1.getStatus());

            // Listar tarefas por prioridade
            System.out.println("\nTarefas por Prioridade:");
            for (Tarefa t : gerenciador.listarPorPrioridade()) {
                System.out.println(t.getTitulo() + " - Prioridade: " + t.calcularPrioridade());
            }
        }
    }
    public static void RedeSocial() {
        RedeSocial redeSocial = new RedeSocial();

        // Adicionando posts
        TextPost post1 = new TextPost("Alice", "Hello World!");
        post1.adicionarHashtag("#greetings");
        TextPost post2 = new TextPost("Bob", "Java is awesome!");
        post2.adicionarHashtag("#java");

        ImagePost post3 = new ImagePost("Alice", "Check out my vacation!", "http://exemplo.com/imagem.jpg", "Brilho");
        VideoPost post4 = new VideoPost("Charlie", "Meu novo vídeo!", "http://exemplo.com/video.mp4", 120);

        redeSocial.adicionarPost(post1);
        redeSocial.adicionarPost(post2);
        redeSocial.adicionarPost(post3);
        redeSocial.adicionarPost(post4);

        // Listar todos os posts
        System.out.println("Todos os Posts:");
        for (Post post : redeSocial.listarPosts()) {
            System.out.println(post.exibir() + "\n");
        }

        // Buscar posts por autor
        System.out.println("Posts de Alice:");
        for (Post post : redeSocial.buscarPorAutor("Alice")) {
            System.out.println(post.exibir() + "\n");
        }

        // Adicionar likes
        redeSocial.adicionarLike(post1.getId());
        redeSocial.adicionarLike(post2.getId());
        redeSocial.adicionarLike(post1.getId());

        // Exibir o post mais popular
        Post postMaisPopular = redeSocial.exibirPostMaisPopular();
        System.out.println("Post mais popular:");
        System.out.println(postMaisPopular.exibir() + " - Likes: " + postMaisPopular.getLikes());
    }
}

