package main.java;

import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;
import main.java.atividade01.CorrecaoEmpresa;
import main.java.atividade01.CorrecaoGerente;
<<<<<<< HEAD
import main.java.atividade04.EmailNotificacao;
import main.java.atividade04.GerenciadorNotificacoes;
import main.java.atividade04.PushNotificacao;
import main.java.atividade04.SMSNotificacao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GerenciadorNotificacoes Gerenciador = new GerenciadorNotificacoes();

        Gerenciador.adicionarNotificacao(new EmailNotificacao("ola bom dia ","Claudyson", LocalDate.now(),"sobre pagamento do cartao"));
        Gerenciador.adicionarNotificacao(new EmailNotificacao("gostariamos de apresentar a nossa marca","Texneo",LocalDate.now(),"Marca esportiva"));

        Gerenciador.adicionarNotificacao(new SMSNotificacao("boa tarde ","Luiza",LocalDate.now(),"47997853831"));
        Gerenciador.adicionarNotificacao(new PushNotificacao("Novo alerta","LUCAS",LocalDate.now(),"Atualizacao de clima"));

        Gerenciador.enviarNotificacao();
        Gerenciador.listarNotificacao();
=======
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

public class Main {
    public static void main(String[] args) {
        //CorrecaoAtividade01();
        //CorrecaoAtividade02();
//        CorrecaoAtividade03();
        CorrecaoAtividade04();

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
>>>>>>> ac47e1b6631175ef2d5c6da6d4230910b10d0d4b
    }

}
