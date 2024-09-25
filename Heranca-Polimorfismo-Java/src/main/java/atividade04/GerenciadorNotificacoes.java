package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {

    private List<Notificacao> notificacoesPendentes;

    private List<Notificacao> notificacoesEnviadas;

    public GerenciadorNotificacoes() {
        this.notificacoesPendentes = new ArrayList<>();
        this.notificacoesEnviadas = new ArrayList<>();
    }

    public void adicionarNotificacao(Notificacao notificacao) {
        this.notificacoesPendentes.add(notificacao);
    }

    public void enviarNotificacoesPendentes() {
        for (Notificacao notificacao : notificacoesPendentes) {
            notificacao.enviarNotificacao();
            notificacoesEnviadas.add(notificacao);
        }
        notificacoesPendentes.clear();
    }

    public void listarNotificacoesEnviadas() {
        for (Notificacao notificacao : notificacoesEnviadas) {
            System.out.println(notificacao.formatarMensagem());
        }
    }
}
