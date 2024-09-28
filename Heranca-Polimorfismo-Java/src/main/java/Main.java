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

public class Main {
    public static void main(String[] args) {
//        atividade01();
//        atividade02();
//        atividade03();
//        atividade04();
        atividade05();
    }
    public static void atividade01(){
        Empresa empresaDeTeste = new Empresa();

        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Gabriella", 1, 15000.0, "Java"));
        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Taina", 2, 20000.0, "JavaScript"));
        empresaDeTeste.adicionarFuncionario(new Gerente("Nathalia", 3, 10000.0, 10000));
        empresaDeTeste.adicionarFuncionario(new Gerente("Maria", 4,12000.0, 5000));
        empresaDeTeste.adicionarFuncionario(new AnalistaQA("Sayonara", 5, 14000, 200));
        empresaDeTeste.adicionarFuncionario(new AnalistaQA("Juliana", 6, 50000, 5));

        empresaDeTeste.listarFuncionarios();
        empresaDeTeste.listarFuncionarios02();
        System.out.println(empresaDeTeste.calcularFolhaDePagamentoTotal());
        empresaDeTeste.listarFuncionarios02();

    }
    public static void atividade02(){
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarItensABiblioteca(new LivroFisico("A vida invisivel de Addie Larue", "V.E Schwab", 2020, 620));
        biblioteca.adicionarItensABiblioteca(new LivroFisico("Bem-vindos a livraria Hyunam Dong", "Hwang Boreum", 2021,230));

        biblioteca.adicionarItensABiblioteca(new AudioLivro("Os sete maridos de Evelyn Hugo", "Taylor Jenkins Reid", 2023, 1000));
        biblioteca.adicionarItensABiblioteca(new AudioLivro("Daisy Jones & The Six", "Taylor Jenkins Reid", 2024, 1500));

        biblioteca.adicionarItensABiblioteca(new Ebook("Loucos por livros", "Emily Henry", 2024,1.5));
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
    public static void atividade03(){
        Frota frota = new Frota();

        frota.adicionarVeiculo(new Carro("1234", "fiat", 2006, 10000.0, 4));
        frota.adicionarVeiculo(new Carro("5678", "uno", 2024, 15000.0, 4));

        frota.adicionarVeiculo(new Moto("464512", "honda", 2022, 5000.0, 2));
        frota.adicionarVeiculo(new Moto("841535", "civic", 2023, 5000.0,2));

        frota.adicionarVeiculo(new Caminhao("45684648", "naosei", 2024, 20000.0, 10.0));
        frota.adicionarVeiculo(new Caminhao("2547963", "naosei", 2024, 20000.0, 5.0));

        frota.listarFrota();
        System.out.println(frota.calcularCustoTotalViagem(10));
        frota.removerVeiculo("1234");
        frota.listarFrota();
        System.out.println(frota.calcularCustoTotalViagem(10));
    }
    public static void atividade04(){
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
    public static void atividade05(){
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

}

