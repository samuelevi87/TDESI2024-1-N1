package main.java;

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

        System.out.println("\nAtividade 01  -----------------------------------------------------------------------------------------------------------------");
        Empresa empresa = new Empresa();
        empresa.adicionarFuncionario(new Desenvolvedor("Samuel Levi", 123456, 15000.0, "Java"));
        empresa.adicionarFuncionario(new Desenvolvedor("Jackson Callado", 123456, 20000.0, "C++"));
        empresa.adicionarFuncionario(new Gerente("Sanatiel", 789456, 6000.0, 10000.0));
        empresa.adicionarFuncionario(new Gerente("Jackson Stumpf", 789456, 7000.0, 10000.0));
        empresa.adicionarFuncionario(new AnalistaQA("Jonathan Sost", 756248, 12000.0, 15));
        empresa.adicionarFuncionario(new AnalistaQA("Tainá Estefani", 951424, 15000.0, 35));

        System.out.println("******* LISTA DE FUNCIONÁRIOS *******");
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