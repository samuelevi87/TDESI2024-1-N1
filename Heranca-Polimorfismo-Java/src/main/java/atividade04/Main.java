package main.java.atividade04;

public class Main {
    private static GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();

    public static void main(String[] args) {
        // Criação de notificações
        EmailNotificacao email = new EmailNotificacao("Seu relatório está pronto.", "usuario@example.com", "Relatório Mensal");
        SMSNotificacao sms = new SMSNotificacao("Seu código de verificação é 123456.", "Usuario", "987654321");
        PushNotificacao push = new PushNotificacao("Você tem uma nova mensagem!", "usuario@dispositivo", "Meu Dispositivo");

        // Adicionando as notificações ao gerenciador
        gerenciador.adicionarNotificacao(email);
        gerenciador.adicionarNotificacao(sms);
        gerenciador.adicionarNotificacao(push);

        // Enviando todas as notificações pendentes
        gerenciador.enviarTodasNotificacoes();

        // Listando as notificações que foram enviadas
        gerenciador.listarNotificacoesEnviadas();
    }
}
