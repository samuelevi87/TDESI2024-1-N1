package main.java.atividade04;

public class Main {
    public static void main(String[] args) {
    GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();

        gerenciador. new EmailNotificacao("Oferta especial!", "usuario@email.com", "Promoção");
        gerenciador.adicionarNotificacao(new SMSNotificacao
            ("Seu código de verificação é 123456", "João", "123456789"));
        gerenciador.adicionarNotificacao(new PushNotificacao
            ("Nova mensagem recebida", "Maria", "device_id_123"));

        System.out.println("Enviando todas as notificações:");
        gerenciador.enviarTodasNotificacoes();

        System.out.println("\nLista de notificações enviadas:");
        gerenciador.listarNotificacoesEnviadas().forEach(System.out::println);

        System.out.println("\nEnviando notificações (versão simples):");
        gerenciador.enviarTodasNotificacoesSimples();

        System.out.println("\nLista de notificações enviadas (versão simples):");
        gerenciador.listarNotificacoesEnviadasSimples().forEach(System.out::println);
}
}
