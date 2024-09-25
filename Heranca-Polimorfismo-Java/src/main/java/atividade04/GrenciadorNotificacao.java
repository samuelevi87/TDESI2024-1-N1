package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;
public class GrenciadorNotificacao {private List<Notificacao> listNotificacao;

    /**
     * controi um gerador de notificacao
     * @param listNotificacao
     */
    public GrenciadorNotificacao(List<Notificacao> listNotificacao) {
        this.listNotificacao = listNotificacao;
    }

    /**
     * adiciona uma notificacao
     * @param notificacao
     */
    public void adicionarNotificacao(Notificacao notificacao){
        listNotificacao.add(notificacao);

    }
    public void notificacaoPedentes(){

    }
}
