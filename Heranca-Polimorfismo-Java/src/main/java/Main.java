package main.java;

import main.java.atividade04.EmailNotificacao;
import main.java.atividade04.GerenciadorNotificacoes;
import main.java.atividade04.PushNotificacao;
import main.java.atividade04.SMSNotificacao;

public class Main {
    public static void main(String[] args) {
        GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();
        gerenciador.adicionarNotificacoes(new EmailNotificacao("Reunião marcada", "user@example.com", "Reunião de projeto"));
        gerenciador.adicionarNotificacoes(new EmailNotificacao("Novo documento disponível", "user@example.com", "Documento Importante"));
        gerenciador.adicionarNotificacoes(new SMSNotificacao("Lembrete de pagamento", "123456789", "987654321"));
        gerenciador.adicionarNotificacoes(new SMSNotificacao("Promoção especial!", "123456789", "987654321"));
        gerenciador.adicionarNotificacoes(new PushNotificacao("Atualização disponível", "userDevice", "iPhone"));
        gerenciador.adicionarNotificacoes(new PushNotificacao("Mensagem de segurança", "userDevice", "Android"));

        gerenciador.enviarNotificacoesPendentes();
        gerenciador.listarNotificacoesEnviadas();
    }
}