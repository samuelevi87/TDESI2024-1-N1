package main.java.atividade04;

import java.util.ArrayList;

public class GerenciadorNotificacoes {

    private ArrayList<Notificacao> notificacaoEnviadas;
    private ArrayList<Notificacao> notificacaoPendentes;

    public GerenciadorNotificacoes(ArrayList<Notificacao> listaDeNotificacao) {
        this.notificacaoEnviadas = new ArrayList<>();
        this.notificacaoPendentes = new ArrayList<>();
    }

    public void adicionarNotificacoes(Notificacao notificacao){
        this.notificacaoPendentes.add(notificacao);
    }

    public void enviandoNoticacoesPendentes(){
        for (Notificacao notificacao : notificacaoPendentes){
            notificacao.enviarNotificacao();
            notificacaoEnviadas.add(notificacao);
        }
        notificacaoPendentes.clear();
    }

    public void listaNotificacoesEnviadas(){
        for (Notificacao notificacao : notificacaoEnviadas) {
            System.out.printf(notificacao.formatarMensagem());
        }
    }
}
