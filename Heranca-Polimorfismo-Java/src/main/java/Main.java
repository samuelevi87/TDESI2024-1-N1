package main.java;

import main.java.atividade04.EmailNotificacao;
import main.java.atividade04.GerenciadorNotificacoes;
import main.java.atividade04.PushNotificacao;
import main.java.atividade04.SMSNotificacao;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        GerenciadorNotificacoes gerenciadorNotificacoes1 = new GerenciadorNotificacoes();

        EmailNotificacao emailNotificacao1 = new EmailNotificacao("Reunião às 10h", "email@exemplo.com", LocalDateTime.now(), "aaaa");
        EmailNotificacao emailNotificacao2 = new EmailNotificacao("Novo projeto disponível", "email@exemplo.com", LocalDateTime.now(), "bbbb");

        SMSNotificacao smsNotificacao1 = new SMSNotificacao("Lembrete de pagamento", "usuario@exemplo.com", LocalDateTime.now(), 999);
        SMSNotificacao smsNotificacao2 = new SMSNotificacao("Promoção especial!", "usuario@exemplo.com", LocalDateTime.now(), 666);

        PushNotificacao pushNotificacao1 = new PushNotificacao("Novo alerta!", "usuario@exemplo.com", LocalDateTime.now(), "Celular");
        PushNotificacao pushNotificacao2 = new PushNotificacao("Atualização disponível!", "usuario@exemplo.com", LocalDateTime.now(), "PC");

        gerenciadorNotificacoes1.addNotificacoes(smsNotificacao1);
        gerenciadorNotificacoes1.addNotificacoes(smsNotificacao2);
        gerenciadorNotificacoes1.addNotificacoes(emailNotificacao1);
        gerenciadorNotificacoes1.addNotificacoes(pushNotificacao2);

        gerenciadorNotificacoes1.listarNotificacoes();

        gerenciadorNotificacoes1.enviarNotificacoes();

        gerenciadorNotificacoes1.listarNotificacoes();

    }

}
