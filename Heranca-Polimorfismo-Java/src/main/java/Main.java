package main.java;

import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;
import main.java.atividade02.*;
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
import main.java.atividade05.ProcessadorPagamento;
import main.java.atividade05.TransferenciaBancaria;
import main.java.atividade06.*;
import main.java.atividade07.ImagePost;
import main.java.atividade07.RedeSocial;
import main.java.atividade07.TextPost;
import main.java.atividade07.VideoPost;
import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;

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
import main.java.atividade09.*;
import main.java.atividade10.*;


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

        //CorrecaoAtividade09();
        CorrecaoAtividade10();


//        atividade01();
//        atividade02();
//        atividade03();
//        atividade04();
//        atividade05();
//        atividade06();
//        atividade07();
        atividade09();
    }

    public static void atividade01() {
        Empresa empresaDeTeste = new Empresa();

        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Gabriella", 1, 15000.0, "Java"));
        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Taina", 2, 20000.0, "JavaScript"));
        empresaDeTeste.adicionarFuncionario(new Gerente("Nathalia", 3, 10000.0, 10000));
        empresaDeTeste.adicionarFuncionario(new Gerente("Maria", 4, 12000.0, 5000));
        empresaDeTeste.adicionarFuncionario(new AnalistaQA("Sayonara", 5, 14000, 200));
        empresaDeTeste.adicionarFuncionario(new AnalistaQA("Juliana", 6, 50000, 5));

        empresaDeTeste.listarFuncionarios();
        empresaDeTeste.listarFuncionarios02();
        System.out.println(empresaDeTeste.calcularFolhaDePagamentoTotal());
        empresaDeTeste.listarFuncionarios02();

    }

    private static void CorrecaoAtividade10() {
        CorrecaoEmpresa empresa = new CorrecaoEmpresa("TechCorp");

        // Criando departamentos
        CorrecaoDepartamento ti = new CorrecaoDepartamento("TI");
        CorrecaoDepartamento vendas = new CorrecaoDepartamento("Vendas");

        // Adicionando funcionários ao departamento de TI
        ti.adicionarFuncionario(new CorrecaoGerente("João Silva", "123.456.789-00", LocalDate.of(2015, 1, 1), 10000.0, "TI", 2000.0));
        ti.adicionarFuncionario(new CorrecaoAnalista("Maria Souza", "987.654.321-00", LocalDate.of(2018, 6, 1), 6000.0, "Desenvolvimento", CorrecaoNivelSenioridade.PLENO));
        ti.adicionarFuncionario(new CorrecaoAnalista("Pedro Santos", "111.222.333-44", LocalDate.of(2020, 3, 15), 4500.0, "Suporte", CorrecaoNivelSenioridade.JUNIOR));

        // Adicionando funcionários ao departamento de Vendas
        vendas.adicionarFuncionario(new CorrecaoGerente("Ana Oliveira", "444.555.666-77", LocalDate.of(2017, 4, 1), 8000.0, "Vendas", 1500.0));
        vendas.adicionarFuncionario(new CorrecaoVendedor("Carlos Ferreira", "888.999.000-11", LocalDate.of(2019, 8, 1), 3000.0, 0.05, 50000.0));
        vendas.adicionarFuncionario(new CorrecaoVendedor("Mariana Costa", "222.333.444-55", LocalDate.of(2021, 1, 10), 3000.0, 0.05, 40000.0));

        // Adicionando departamentos à empresa
        empresa.adicionarDepartamento(ti);
        empresa.adicionarDepartamento(vendas);

        // Demonstrando funcionalidades
        System.out.println("Funcionários do departamento de TI:");
        ti.listarFuncionarios();

        System.out.println("\nFuncionários do departamento de Vendas:");
        vendas.listarFuncionariosSimples();

        System.out.println("\nBuscando funcionários com 'Silva' no nome:");
        empresa.buscarFuncionariosPorNome("Silva").forEach(System.out::println);

        System.out.println("\nCalculando folha de pagamento total da empresa:");
        System.out.printf("Total: R$ %.2f%n", empresa.calcularFolhaPagamentoTotal());

        System.out.println("\nRelatório de tempo de serviço:");
        System.out.println(empresa.gerarRelatorioTempoServico());

        // Demonstrando métodos simples
        System.out.println("Usando métodos simples:");
        System.out.println("\nBuscando funcionários com 'a' no nome (método simples):");
        empresa.buscarFuncionariosPorNomeSimples("a").forEach(System.out::println);

        System.out.println("\nRelatório de tempo de serviço (método simples):");
        System.out.println(empresa.gerarRelatorioTempoServicoSimples());

        // Cálculo de salários
        System.out.println("\nDemonstrando cálculo de salários:");
        for (CorrecaoDepartamento departamento : List.of(ti, vendas)) {
            System.out.printf("Departamento: %s%n", departamento.getNome());
            for (CorrecaoFuncionario funcionario : departamento.getFuncionarios()) {
                System.out.printf("%s: R$ %.2f%n", funcionario.getNome(), funcionario.calcularSalario());
            }
            System.out.println();
        }
    }

    private static void CorrecaoAtividade09() {
        CorrecaoRedeHoteis redeHoteis = new CorrecaoRedeHoteis();

        // Criando hotéis
        CorrecaoHotel hotel1 = new CorrecaoHotel("Hotel Vila do Farol");
        CorrecaoHotel hotel2 = new CorrecaoHotel("Resort Ecoar");

        // Adicionando acomodações ao Hotel Vila do Farol
        hotel1.adicionarAcomodacao(new CorrecaoQuartoStandard(101, 2, 150.0, true, CorrecaoTipoCama.CASAL));
        hotel1.adicionarAcomodacao(new CorrecaoQuartoLuxo(201, 2, 280.0, true, true, true));
        hotel1.adicionarAcomodacao(new CorrecaoSuite(301, 4, 390.0, true, 2, true));

        // Adicionando acomodações ao Resort Ecoar
        hotel2.adicionarAcomodacao(new CorrecaoQuartoStandard(101, 1, 80.0, true, CorrecaoTipoCama.SOLTEIRO));
        hotel2.adicionarAcomodacao(new CorrecaoQuartoLuxo(201, 2, 180.0, true, false, true));
        hotel2.adicionarAcomodacao(new CorrecaoSuite(301, 3, 250.0, true, 1, true));

        // Adicionando hotéis à rede
        redeHoteis.adicionarHotel(hotel1);
        redeHoteis.adicionarHotel(hotel2);

        // Demonstrando funcionalidades
        System.out.println("Acomodações disponíveis em toda a rede:");
        redeHoteis.buscarAcomodacoesDisponiveis().forEach(System.out::println);

        System.out.println("\nFazendo reservas:");
        System.out.println("Reserva no Hotel Vila do Farol, quarto 201: " +
                redeHoteis.fazerReserva("Hotel Vila do Farol", 201));
        System.out.println("Reserva no Resort Ecoar, quarto 101: " +
                redeHoteis.fazerReserva("Resort Ecoar", 101));

        System.out.println("\nAcomodações disponíveis após reservas:");
        redeHoteis.buscarAcomodacoesDisponiveis().forEach(System.out::println);

        System.out.println("\nTentando reservar um quarto já ocupado:");
        System.out.println("Reserva no Hotel Vila do Farol, quarto 201: " +
                redeHoteis.fazerReserva("Hotel Vila do Farol", 201));

        System.out.println("\nCalculando receita total para 3 noites:");
        System.out.printf("Hotel Vila do Farol: R$ %.2f%n", hotel1.calcularReceitaTotal(3));
        System.out.printf("Resort Ecoar: R$ %.2f%n", hotel2.calcularReceitaTotal(3));

        System.out.println("\nDemonstrando métodos simples:");
        System.out.println("Acomodações disponíveis (método simples):");
        redeHoteis.buscarAcomodacoesDisponiveisSimples().forEach(System.out::println);

        System.out.println("\nFazendo reserva com método simples:");
        System.out.println("Reserva no Resort Ecoar, quarto 201: " +
                redeHoteis.fazerReservaSimples("Resort Ecoar", 201));

        System.out.println("\nCalculando receita total para 3 noites (método simples):");
        System.out.printf("Hotel Vila do Farol: R$ %.2f%n", hotel1.calcularReceitaTotalSimples(3));
        System.out.printf("Resort Ecoar: R$ %.2f%n", hotel2.calcularReceitaTotalSimples(3));
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
        CorrecaoProduto smartphone = loja.buscarPorNome("Smartphone").get(0);
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

    public static void atividade02() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarItensABiblioteca(new LivroFisico("A vida invisivel de Addie Larue", "V.E Schwab", 2020, 620));
        biblioteca.adicionarItensABiblioteca(new LivroFisico("Bem-vindos a livraria Hyunam Dong", "Hwang Boreum", 2021, 230));

        biblioteca.adicionarItensABiblioteca(new AudioLivro("Os sete maridos de Evelyn Hugo", "Taylor Jenkins Reid", 2023, 1000));
        biblioteca.adicionarItensABiblioteca(new AudioLivro("Daisy Jones & The Six", "Taylor Jenkins Reid", 2024, 1500));

        biblioteca.adicionarItensABiblioteca(new Ebook("Loucos por livros", "Emily Henry", 2024, 1.5));
        biblioteca.adicionarItensABiblioteca(new Ebook("Leitura de Verão", "Emily Henry", 2024, 2.1));

        biblioteca.listarItens();
        System.out.println();
        biblioteca.emprestarItem("Os sete maridos de Evelyn Hugo");
        System.out.println(biblioteca.calcularMulta("Os sete maridos de evelyn hugo", 10));
        biblioteca.listarItens();
        System.out.println();
        biblioteca.devolverItem("Leitura de verão");
        biblioteca.devolverItem("Os sete maridos de Evelyn Hugo");
        biblioteca.listarItens();
        System.out.println();
        biblioteca.emprestarItem("A vida invisivel de Addie Larue");
        System.out.println(biblioteca.calcularMulta("A vida invisivel de Addie Larue", 10));
        biblioteca.emprestarItem("Loucos por livros");
        System.out.println(biblioteca.calcularMulta("Loucos por livros", 10));

    }

    public static void atividade03() {
        Frota frota = new Frota();

        frota.adicionarVeiculo(new Carro("1234", "fiat", 2006, 10000.0, 4));
        frota.adicionarVeiculo(new Carro("5678", "uno", 2024, 15000.0, 4));

        frota.adicionarVeiculo(new Moto("464512", "honda", 2022, 5000.0, 2));
        frota.adicionarVeiculo(new Moto("841535", "civic", 2023, 5000.0, 2));

        frota.adicionarVeiculo(new Caminhao("45684648", "naosei", 2024, 20000.0, 10.0));
        frota.adicionarVeiculo(new Caminhao("2547963", "naosei", 2024, 20000.0, 5.0));

        frota.listarFrota();
        System.out.println(frota.calcularCustoTotalViagem(10));
        frota.removerVeiculo("1234");
        frota.listarFrota();
        System.out.println(frota.calcularCustoTotalViagem(10));
    }

    public static void atividade04() {
        GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();

        gerenciador.adicionarNotificacao(new EmailNotificacao("Sua senha foi alterada", "gabimabento@gmail.com", "Alteração senha"));
        gerenciador.adicionarNotificacao(new EmailNotificacao("Boa tarde", "gabi@gmail.com", "Saudações"));

        gerenciador.adicionarNotificacao(new PushNotificacao("Alerta", "Gabriella", "Redmi 10s"));
        gerenciador.adicionarNotificacao(new PushNotificacao("Dispositivo superaquecido", "Taina", "Samsung galaxy"));

        gerenciador.adicionarNotificacao(new SMSNotificacao("Renove seu plano", "Gabriella", "47984292863"));
        gerenciador.adicionarNotificacao(new SMSNotificacao("voce tem recado", "Gabriella", "564864564"));

        gerenciador.enviarNotificacoesPendentes();
        gerenciador.listarNotificacoesEnviadas();
    }

    public static void atividade05() {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        processador.adicionarFormaPagamento(new CartaoCredito("Cartão de Crédito", 1.5, "1234-5678-9012-3456", "Visa"));
        processador.adicionarFormaPagamento(new Boleto("Boleto", 2.0, "123456789012"));
        processador.adicionarFormaPagamento(new TransferenciaBancaria("Transferência", 1.0, "Banco do Brasil", "1234", "567890"));

        processador.listarFormasPagamento();

        processador.processarPagamento(100.0, "Cartão de Crédito");
        processador.processarPagamento(200.0, "Boleto");
        processador.processarPagamento(150.0, "Transferência");

        processador.estornarPagamento(50.0, "Cartão de Crédito");
        processador.estornarPagamento(30.0, "Boleto");
        processador.estornarPagamento(100.0, "Transferência");


    }
    public static void atividade06 () {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        // Adicionando tarefas
        gerenciador.adicionarTarefa(new TarefaDesenvolvimento("Implementar Login", "Criar sistema de login",
                LocalDate.now().plusDays(7), "Java", 3));
        gerenciador.adicionarTarefa(new TarefaRevisao("Revisar PR #123", "Revisar pull request de feature X",
                LocalDate.now().plusDays(2), "João", 500));
        gerenciador.adicionarTarefa(new TarefaBug("Corrigir bug #456", "Corrigir crash na tela inicial",
                LocalDate.now().plusDays(1), Severidade.ALTA, "Android"));

        // Listando todas as tarefas (usando o método com stream)
        System.out.println("Todas as tarefas (usando streams):");
        gerenciador.listarTodasTarefas().forEach(System.out::println);

        // Listando todas as tarefas (usando o método simples)
        System.out.println("\nTodas as tarefas (usando método simples):");
        gerenciador.listarTarefasSimples().forEach(System.out::println);

        // Listando tarefas por status (usando o método com stream)
        System.out.println("\nTarefas pendentes (usando streams):");
        gerenciador.listarPorStatus(Status.PENDENTE).forEach(System.out::println);

        // Listando tarefas por status (usando o método simples)
        System.out.println("\nTarefas pendentes (usando método simples):");
        gerenciador.listarTarefasPorStatusSimples(Status.PENDENTE).forEach(System.out::println);

        // Atualizando status de uma tarefa (usando o método com stream)
        gerenciador.atualizarStatusTarefa("Implementar Login", Status.EM_ANDAMENTO);
        System.out.println("\nStatus da tarefa 'Implementar Login' atualizado para EM_ANDAMENTO");

        // Listando tarefas ordenadas por prioridade (usando o método com stream)
        System.out.println("\nTarefas ordenadas por prioridade (usando streams):");
       gerenciador.listarTarefasOrdenadasPorPrioridade().forEach(System.out::println);

        // Listando tarefas ordenadas por prioridade (usando o método simples)
        System.out.println("\nTarefas ordenadas por prioridade (usando método simples):");
        gerenciador.listarTarefasOrdenadasPorPrioridadeSimples().forEach(System.out::println);

    }
    public static void atividade07(){
        RedeSocial redeSocial = new RedeSocial();

        redeSocial.adicionarPost(new TextPost("Gabriella", "lalala"));
        redeSocial.adicionarPost(new TextPost("Nathália", "estou programando"));

        redeSocial.adicionarPost(new ImagePost("Gabriella", "código java", "imagem.jpg", "filtro"));
        redeSocial.adicionarPost(new ImagePost("Tainá", "imagem de código", "codigo.png", "filtro código"));

        redeSocial.adicionarPost(new VideoPost("Nathália", "codando", "video.mp4", 120));
        redeSocial.adicionarPost(new VideoPost("Tainá", "vídeo da api", "api.mp4", 50));

        System.out.println("=== Todos os posts ===");
        System.out.println(redeSocial.listarTodosPosts());

        System.out.println("=== Post por autor ===");
        redeSocial.buscarPostsPorAutor("Gabriella").forEach(System.out::println);

        redeSocial.adicionarLike(1);
        redeSocial.adicionarLike(3);
        redeSocial.adicionarLike(3);

        System.out.println("=== Todos os posts ===");
        System.out.println(redeSocial.listarTodosPosts());

        System.out.println("=== Post mais popular ===");
        System.out.println(redeSocial.exibirPostMaisPopular());
    }

    private static void CorrecaoAtividade01() {
        // Código para testar a atividade 01
        main.java.atividade01.CorrecaoEmpresa empresa = new main.java.atividade01.CorrecaoEmpresa();

        empresa.adicionarFuncionario(new CorrecaoDesenvolvedor("Ana Silva", 1, 5000, "Java"));
        empresa.adicionarFuncionario(new CorrecaoDesenvolvedor("Carlos Santos", 2, 5500, "Python"));
        empresa.adicionarFuncionario(new main.java.atividade01.CorrecaoGerente("Maria Oliveira", 3, 8000, 10000));
        empresa.adicionarFuncionario(new main.java.atividade01.CorrecaoGerente("João Pereira", 4, 8500, 12000));
        empresa.adicionarFuncionario(new CorrecaoAnalistaQA("Pedro Costa", 5, 4500, 50));
        empresa.adicionarFuncionario(new CorrecaoAnalistaQA("Lúcia Ferreira", 6, 4800, 60));

        System.out.println("Lista de Funcionários:");
        empresa.listarFuncionarios();

        System.out.println("\nFolha de Pagamento Total: R$" +
                String.format("%.2f", empresa.calcularFolhaPagamentoTotal()));
    }
    public static void atividade09(){
        Hotel hotel = new Hotel("hotel prestol");

        hotel.adicionarAcomodacao(new QuartoStandard(1, 2, 100, QuartoStandard.TipoToCama.CASAL));
        hotel.adicionarAcomodacao(new QuartoLuxo(2, 3, 200, true, false));
        hotel.adicionarAcomodacao(new Suite(3, 4, 150, 2, false));

        System.out.println("=== Acomodações disponíveis ===");
        hotel.listarAcomodacoesDisponiveis().forEach(System.out::println);

        System.out.println();

        System.out.println("=== Acomodações disponíveis simples ===");
        hotel.listarAcomodacoesDisponiveisSimples().forEach(System.out::println);

        System.out.println();

        System.out.println("=== Reservar acomodação ===");
        System.out.println(hotel.reservarAcomodacaoPorNumero(1, 2) ? "Reserva bem sucedida" : "Acomodação indisponível");
        System.out.println(hotel.reservarAcomodacaoPorNumeroSimples(1, 3) ? "Reserva bem sucedida" : "Acomodação indisponível");
        System.out.println(hotel.reservarAcomodacaoPorNumeroSimples(2, 3) ? "Reserva bem sucedida" : "Acomodação indisponível");
        //System.out.println(hotel.reservarAcomodacaoPorNumero(4) ? "Reserva bem sucedida" : "Acomodação indisponível");

        System.out.println();

        System.out.println("=== Acomodações disponíveis simples ===");
        hotel.listarAcomodacoesDisponiveisSimples().forEach(System.out::println);

        System.out.println();

        System.out.println("=== Liberar acomodação ===");
        System.out.println(hotel.liberarAcomodacaoPorNumero(1) ? "Liberação bem sucedida" : "Acomodação já disponível");
        System.out.println(hotel.liberarAcomodacaoPorNumeroSimples(1) ? "Liberação bem sucedida" : "Acomodação já disponível");

        System.out.println("=== Receita total das reservas ===");
        System.out.println(hotel.calcularReceitaTotalReservas());

        RedeHoteis redeHoteis = new RedeHoteis();

        redeHoteis.adicionarHotel(hotel);
        System.out.println(redeHoteis.reservarAcomodacaoNaRede("hotel prestol", 3, 1) ? "Reserva bem sucedida" : "Acomodação indisponível");
        System.out.println("=== Acomodações disponiveis na rede ===");
        redeHoteis.buscarAcomodacoesDisponiveis();
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

