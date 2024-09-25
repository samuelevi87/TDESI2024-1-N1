package main.java;

import main.java.atividade04.EmailNotificacao;
import main.java.atividade04.GerenciadorNotificacoes;
import main.java.atividade04.PushNotificacao;
import main.java.atividade04.SMSNotificacao;

public class Main {
    public static void main(String[] args) {
        GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();
        gerenciador.adicionarNotificacoes(new EmailNotificacao("teste 1", "testando 1", "testado 1"));
        gerenciador.adicionarNotificacoes(new EmailNotificacao("teste 2", "testando 2", "testado 2"));
        gerenciador.adicionarNotificacoes(new PushNotificacao("teste 3", "testando 3", "testado 3"));
        gerenciador.enviarNotificacoes();
        gerenciador.adicionarNotificacoes(new PushNotificacao("teste 4", "testando 4", "testado 4"));
        gerenciador.adicionarNotificacoes(new SMSNotificacao("teste 5", "testando 5", "testado 5"));
        gerenciador.adicionarNotificacoes(new SMSNotificacao("teste 6", "testando 6", "testado 6"));
        System.out.println("===== Lista de notificações =====");
        gerenciador.listarNotificacoes();
        gerenciador.enviarNotificacoes();
        System.out.println("===== Lista de notificações =====");
        gerenciador.listarNotificacoes();
    }
}
