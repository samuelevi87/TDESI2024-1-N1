package main.java;

import main.java.atividade03.*;
import main.java.atividade04.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        GerenciadorNotificacoes gerenciadorNotificacoes1 = new GerenciadorNotificacoes();

        EmailNotificacao emailNotificacao1 = new EmailNotificacao("Mensagem por email", "Pedro", LocalDateTime.now(), "SObre a mensagem 1");
        EmailNotificacao emailNotificacao2 = new EmailNotificacao("Mensagem por email teste 2", "Arthur", LocalDateTime.now(), "SObre a mensagem 2");

        gerenciadorNotificacoes1.adicionarNotificacao(emailNotificacao1);
        gerenciadorNotificacoes1.adicionarNotificacao(emailNotificacao2);

        SMSNotificacao smsNotificacao1 = new SMSNotificacao("SMS Msg 1", "Maria", LocalDateTime.now(), "+5547995832292");
        SMSNotificacao smsNotificacao2 = new SMSNotificacao("SMS Msg 2", "Vitórid", LocalDateTime.now(), "+446722742293");

        gerenciadorNotificacoes1.adicionarNotificacao(smsNotificacao1);
        gerenciadorNotificacoes1.adicionarNotificacao(smsNotificacao2);

        PushNotificacao pushNotificacao1 = new PushNotificacao("Push MSGG1", "Não sei", LocalDateTime.now(), "IPHONE17");
        PushNotificacao pushNotificacao2 = new PushNotificacao("Push MSGI89", "Não sei Denovo", LocalDateTime.now(), "IPHONE-11");

        gerenciadorNotificacoes1.adicionarNotificacao(pushNotificacao1);
        gerenciadorNotificacoes1.adicionarNotificacao(pushNotificacao2);

        System.out.println("\n" + "Enviando notificações pendentes...");
        gerenciadorNotificacoes1.enviarNotificacoesPendentes();

        System.out.println("\n" + "Notificações enviadas:");
        gerenciadorNotificacoes1.listarNotificacoesEnviadas();
    }
}
