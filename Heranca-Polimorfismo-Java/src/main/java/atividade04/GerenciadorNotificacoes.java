package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {
    private List<Notificacao>listaDeNotificacao;

    public GerenciadorNotificacoes() {
        this.listaDeNotificacao = new ArrayList<>();
    }

    public void adicionarNotificacao(Notificacao Mensagem){
        listaDeNotificacao.add(Mensagem);
    }

    public String enviarNotificacao(){
        for(Notificacao enviarNotificaco : listaDeNotificacao)
            if (enviarNotificaco.getDestinario().equals(null)){
                return "mensagem nao enviada";
            }else {
                return "mensagem enviada com sucesso";
            }
        return null;
    }

    public void listarNotificacao(){
        for (Notificacao listarNotifcacao : listaDeNotificacao){
            System.out.println(" mensagem enviada "+ listarNotifcacao.getDestinario());
        }
    }




}
