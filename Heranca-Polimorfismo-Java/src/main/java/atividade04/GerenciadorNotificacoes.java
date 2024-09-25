package main.java.atividade04;

import java.util.ArrayList;

public class GerenciadorNotificacoes {
    private ArrayList<Notificacao> notificacoes;

    public GerenciadorNotificacoes() {
        this.notificacoes = new ArrayList<>();
    }

    public void adicionarNotificacao(Notificacao notificacao){
        notificacoes.add(notificacao);
    }

    public void enviarNotificacao(){
        for (Notificacao notificacao:notificacoes) {
            notificacao.enviarNotificacao();
        }
    }

    public void listarNotificacoesEnviadas() {
        System.out.println("Notificações enviadas:");
        for (Notificacao notificacao : notificacoes) {
            System.out.println(notificacao.formatarMensagem());
        }
    }
}
