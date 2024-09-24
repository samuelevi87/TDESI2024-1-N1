package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {
    List<Notificacao> notificacoes;

    public GerenciadorNotificacoes() {
        this.notificacoes = new ArrayList<>();
    }

    public void adicionarNotificacoes(Notificacao notificacao) {
        this.notificacoes.add(notificacao);
    }

    public void enviarNotificacoes() {
        for (Notificacao notificacao : notificacoes) {
            if (!notificacao.getEnviada()) { notificacao.enviarNotificacao(); }
        }
    }

    public void listarNotificacoes() { notificacoes.forEach(System.out::println); }
}
