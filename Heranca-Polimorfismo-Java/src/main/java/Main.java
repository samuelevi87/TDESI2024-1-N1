package main.java;

<<<<<<< HEAD
import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;
import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;
import main.java.atividade03.Caminhao;
import main.java.atividade03.Carro;
import main.java.atividade03.Frota;
import main.java.atividade03.Moto;
import main.java.atividade04.EmailNotificacao;
import main.java.atividade04.GerenciadorNotificacoes;
import main.java.atividade04.PushNotificacao;
import main.java.atividade04.SMSNotificacao;
import main.java.atividade05.Boleto;
import main.java.atividade05.CartaoCredito;
import main.java.atividade05.ProcessarPagamento;
import main.java.atividade05.TransferenciaBancaria;

public class Main {
    public static void main(String[] args) {
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
        CorrecaoAtividade08();
>>>>>>> fec0f85052335bfae6c7d7b99c1fb5e30d6629f3

        System.out.println("\nAtividade 01  -----------------------------------------------------------------------------------------------------------------");
        Empresa empresa = new Empresa();
        empresa.adicionarFuncionario(new Desenvolvedor("Samuel Levi", 123456, 15000.0, "Java"));
        empresa.adicionarFuncionario(new Desenvolvedor("Jackson Callado", 123456, 20000.0, "C++"));
        empresa.adicionarFuncionario(new Gerente("Sanatiel", 789456, 6000.0, 10000.0));
        empresa.adicionarFuncionario(new Gerente("Jackson Stumpf", 789456, 7000.0, 10000.0));
        empresa.adicionarFuncionario(new AnalistaQA("Jonathan Sost", 756248, 12000.0, 15));
        empresa.adicionarFuncionario(new AnalistaQA("Tainá Estefani", 951424, 15000.0, 35));

<<<<<<< HEAD
        System.out.println("******* LISTA DE FUNCIONÁRIOS *******");
=======
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

    private static void CorrecaoAtividade01() {
        // Código para testar a atividade 01
        CorrecaoEmpresa empresa = new CorrecaoEmpresa();

        empresa.adicionarFuncionario(new CorrecaoDesenvolvedor("Ana Silva", 1, 5000, "Java"));
        empresa.adicionarFuncionario(new CorrecaoDesenvolvedor("Carlos Santos", 2, 5500, "Python"));
        empresa.adicionarFuncionario(new CorrecaoGerente("Maria Oliveira", 3, 8000, 10000));
        empresa.adicionarFuncionario(new CorrecaoGerente("João Pereira", 4, 8500, 12000));
        empresa.adicionarFuncionario(new CorrecaoAnalistaQA("Pedro Costa", 5, 4500, 50));
        empresa.adicionarFuncionario(new CorrecaoAnalistaQA("Lúcia Ferreira", 6, 4800, 60));

        System.out.println("Lista de Funcionários:");
>>>>>>> fec0f85052335bfae6c7d7b99c1fb5e30d6629f3
        empresa.listarFuncionarios();

        System.out.println("======= FOLHA DE PAGAMENTO =======");
        System.out.println("Folha de pagamento total: R$ " + String.format("%.2f", empresa.calcularFolhaDePagamentolTotal()));

        System.out.println("\nAtividade 02  -----------------------------------------------------------------------------------------------------------------");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarItem(new AudioLivro("Alice no País das Maravilhas", "Lewis Carroll", 2024, true, 205));
        biblioteca.adicionarItem(new AudioLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 2020, true, 137));
        biblioteca.adicionarItem(new Ebook("O Sítio do Picapau Amarelo", "Monteiro Lobato", 2018, true, 15.00));
        biblioteca.adicionarItem(new Ebook("Tratado da Pintura", "Leonardo Da Vinci", 2023, true, 9.00));
        biblioteca.adicionarItem(new LivroFisico("Os Cadernos de Leonardo Da Vinci", "Leonardo Da Vinci", 2010, true, 347));
        biblioteca.adicionarItem(new LivroFisico("Fédon", "Sócrates", 2004, true, 409));

        biblioteca.getItemBiblioteca().get(1).emprestar();
        biblioteca.getItemBiblioteca().get(3).emprestar();
        biblioteca.getItemBiblioteca().get(5).emprestar();

        System.out.println("******* LISTA DE ITENS *******");
        biblioteca.listarItens();

        biblioteca.getItemBiblioteca().get(1).devolver();
        biblioteca.getItemBiblioteca().get(3).devolver();
        biblioteca.getItemBiblioteca().get(5).devolver();

        System.out.println("\n******* LISTA DE ITENS *******");
        biblioteca.listarItens();
        System.out.println();
        System.out.println("Multa do audiolivro: R$" + biblioteca.getItemBiblioteca().get(1).calcularMulta(10));
        System.out.println("Multa do ebook: R$" + biblioteca.getItemBiblioteca().get(3).calcularMulta(10));
        System.out.println("Multa do livro físico: R$" + biblioteca.getItemBiblioteca().get(5).calcularMulta(10));

        System.out.println("\nAtividade 03  -----------------------------------------------------------------------------------------------------------------");
        Frota frota = new Frota();
        frota.adicionarVeiculo(new Caminhao("ABC1234", "Volvo FH", 2015, 78000.0, 25.0));
        frota.adicionarVeiculo(new Caminhao("DEF5678", "Scania R450", 2012, 120000.0, 18.5));
        frota.adicionarVeiculo(new Carro("GHI9012", "Honda Civic", 2018, 34000.3, 4));
        frota.adicionarVeiculo(new Carro("JKL3456", "Toyota Corolla", 2020, 15000.2, 4));
        frota.adicionarVeiculo(new Moto("MNO7890", "Yamaha XJ6", 2019, 12000.7, 600));
        frota.adicionarVeiculo(new Moto("PQR2345", "Honda CB500", 2017, 9500.4, 500));

        System.out.println("******* LISTA DE VEÍCULOS *******");
        frota.listarVeiculos();
        System.out.println("- Custo total de viagem: R$" + frota.calcularCustoViagem(100.0));
        frota.removerVeiculo("efgh456");
        frota.removerVeiculo("mnop123");
        frota.removerVeiculo("uvwx456");

        System.out.println("\n******* LISTA DE VEÍCULOS *******");
        frota.listarVeiculos();
        System.out.println("- Custo total de viagem: R$" + frota.calcularCustoViagem(100.0));

        System.out.println("\nAtividade 04  -----------------------------------------------------------------------------------------------------------------");
        GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();
        gerenciador.adicionarNotificacoes(new EmailNotificacao("Reunião marcada", "user@example.com", "Reunião de projeto"));
        gerenciador.adicionarNotificacoes(new EmailNotificacao("Novo documento disponível", "user@example.com", "Documento Importante"));
        gerenciador.adicionarNotificacoes(new SMSNotificacao("Lembrete de pagamento", "123456789", "987654321"));
        gerenciador.adicionarNotificacoes(new SMSNotificacao("Promoção especial!", "123456789", "987654321"));
        gerenciador.adicionarNotificacoes(new PushNotificacao("Atualização disponível", "userDevice", "iPhone"));
        gerenciador.adicionarNotificacoes(new PushNotificacao("Mensagem de segurança", "userDevice", "Android"));

        gerenciador.enviarNotificacoesPendentes();
        gerenciador.listarNotificacoesEnviadas();

        System.out.println("\nAtividade 05  -----------------------------------------------------------------------------------------------------------------");
        ProcessarPagamento processarPagamento = new ProcessarPagamento();
        processarPagamento.adicionarFormaPagamento(new CartaoCredito("Cartão de Crédito", 3.5, "1234-5678-9876-5432", "Visa"));
        processarPagamento.adicionarFormaPagamento(new Boleto("Boleto", 2.0, "12345678901234567890"));
        processarPagamento.adicionarFormaPagamento(new TransferenciaBancaria("Transferência", 1.5, "Banco do Brasil", "1234", "56789-0"));

        processarPagamento.listarFormasPagamento();

        processarPagamento.processarPagamento(100.0, "Cartão de Crédito");
        processarPagamento.processarPagamento(150.0, "Boleto");
        processarPagamento.processarPagamento(200.0, "Transferência");

        processarPagamento.estornarPagamento(50.0, "Cartão de Crédito");
        processarPagamento.estornarPagamento(75.0, "Boleto");
        processarPagamento.estornarPagamento(100.0, "Transferência");

        System.out.println("\nAtividade 07  -----------------------------------------------------------------------------------------------------------------");
        /*RedeSocial redeSocial = new RedeSocial();

        List<String> hashtags1 = List.of("#Java", "#Coding");
        List<String> hashtags2 = List.of("#Life", "#Inspiration");
        TextPost textPost1 = new TextPost("Alice", "Amando aprender Java!", hashtags1);
        TextPost textPost2 = new TextPost("Bob", "A vida é uma jornada incrível!", hashtags2);

        ImagePost imagePost1 = new ImagePost("Alice", "Minha nova foto", "https://image.com/foto1.jpg", "Vintage");
        ImagePost imagePost2 = new ImagePost("Charlie", "Céu ao entardecer", "https://image.com/ceu.jpg", "Sunset");

        VideoPost videoPost1 = new VideoPost("Bob", "Treino de hoje", "https://video.com/treino.mp4", 120);
        VideoPost videoPost2 = new VideoPost("Charlie", "Timelapse da cidade", "https://video.com/timelapse.mp4", 60);

        redeSocial.adicionarPost(textPost1);
        redeSocial.adicionarPost(textPost2);
        redeSocial.adicionarPost(imagePost1);
        redeSocial.adicionarPost(imagePost2);
        redeSocial.adicionarPost(videoPost1);
        redeSocial.adicionarPost(videoPost2);

        System.out.println("Todos os posts:");
        redeSocial.listarPosts();

        System.out.println("\nPosts de Bob:");
        redeSocial.buscarPostsPorAutor("Bob");

        redeSocial.adicionarLikeAoPost(1);
        redeSocial.adicionarLikeAoPost(1);
        redeSocial.adicionarLikeAoPost(5);

        System.out.println("\nPost mais popular:");
        redeSocial.exibirPostMaisPopular();*/
    }
}