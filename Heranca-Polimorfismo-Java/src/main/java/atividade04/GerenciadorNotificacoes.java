package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {

    private List<Notificacao> notificacoes;

    public GerenciadorNotificacoes() {
        this.notificacoes = new ArrayList<>();
    }

    public void adicionarNotificacao(Notificacao notificacao){
        notificacoes.add(notificacao);
    }

    public void enviarNotificacao(){
        for (Notificacao noti : notificacoes){
            noti.enviarNotificacao();

        }
    }

    public void ListarNotificacoes(){
        for (Notificacao noti : notificacoes){
            System.out.println(noti);
        }
    }
}
