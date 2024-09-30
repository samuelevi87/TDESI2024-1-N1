package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa o gerenciador de notificações.
 */
public class GerenciadorNotificacoes {
    List<Notificacao> notificacoes;

    /**
     * Constrói um novo gerenciador e instancia a lista de notificações.
     */
    public GerenciadorNotificacoes() {
        this.notificacoes = new ArrayList<>();
    }

    /**
     * Adiciona uma notificação na lista de notificações.
     * @param notificacao Notificação a ser adicionada.
     */
    public void adicionarNotificacoes(Notificacao notificacao) {
        this.notificacoes.add(notificacao);
    }

    /**
     * Envia as notificações que ainda não foram enviadas.
     */
    public void enviarNotificacoes() {
        for (Notificacao notificacao : notificacoes) {
            if (!notificacao.getEnviada()) { notificacao.enviarNotificacao(); }
        }

        if(!notificacoes.isEmpty()) System.out.println("Notificações enviadas!");
        else System.out.println("Não há notificações a serem enviadas!");
    }

    /**
     * Lista as notificações que já foram enviadas.
     */
    public void listarNotificacoes() {
        for (Notificacao notificacao : notificacoes) {
            if (notificacao.getEnviada()) System.out.println(notificacao);
        }
    }
}
