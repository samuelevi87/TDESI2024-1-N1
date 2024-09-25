package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {
    private List<Notificacao> notificacoes;

    public GerenciadorNotificacoes() {
        this.notificacoes = new ArrayList<>();
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void adicionarNotificacoes(Notificacao notificacao) {
        notificacoes.add(notificacao);
    }

    public void enviarNotificacoesPendentes() {
        for (Notificacao notificacao : notificacoes) {
            notificacao.enviarNotificacao();
        }
    }

    public void listarNotificacoesEnviadas() {
        for (Notificacao notificacao : notificacoes) {
            System.out.println(notificacao.formatarMensagem());
        }
    }
}
