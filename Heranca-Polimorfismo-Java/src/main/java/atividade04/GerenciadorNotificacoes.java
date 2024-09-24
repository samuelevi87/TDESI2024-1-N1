package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {
    private List<Notificacao> notificacoes = new ArrayList<>();

    public void adicionarNotificacao(Notificacao notificacao) {
        notificacoes.add(notificacao);
    }

    public void enviarTodasNotificacoes() {
        for (Notificacao notificacao : notificacoes) {
            notificacao.enviarNotificacao();
        }
    }

    public void listarNotificacoes() {
        for (Notificacao notificacao : notificacoes) {
            System.out.println(notificacao.formatarMensagem());
        }
    }
}
