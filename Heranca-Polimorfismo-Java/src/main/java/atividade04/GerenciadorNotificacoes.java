package main.java.atividade04;

import java.util.ArrayList;

public class GerenciadorNotificacoes {

    ArrayList<Notificacao> notificacoes;

    public GerenciadorNotificacoes() {
        notificacoes = new ArrayList<>();
    }

    public void addNotificacoes(Notificacao notificacao) {
        notificacoes.add(notificacao);
    }

    public boolean enviarNotificacoes() {
        if (!notificacoes.isEmpty()) {
            for (Notificacao notificacao : notificacoes) {
                notificacao.enviarNotificacao();
            }
            notificacoes.clear();
            return true;
        }
        return false;
    }

    public void listarNotificacoes() {

        for (Notificacao notificacao : notificacoes) {
            System.out.println(notificacao.formatarMensagem());
        }
    }

}
