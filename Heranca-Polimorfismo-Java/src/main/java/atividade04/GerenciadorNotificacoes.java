package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gerencia notificações.
 * Esta classe permite adicionar notificações, enviar notificações pendentes
 * e listar notificações enviadas.
 */
public class GerenciadorNotificacoes {
    private List<Notificacao> notificacoes;

    /**
     * Construtor que inicializa a lista de notificações.
     */
    public GerenciadorNotificacoes() {
        this.notificacoes = new ArrayList<>();
    }

    /**
     * Obtém a lista de notificações.
     * @return A lista de notificações gerenciadas.
     */
    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    /**
     * Adiciona uma nova notificação à lista de notificações.
     * @param notificacao A notificação a ser adicionada.
     */
    public void adicionarNotificacoes(Notificacao notificacao) {
        notificacoes.add(notificacao);
    }

    /**
     * Envia todas as notificações pendentes.
     * Esta implementação chama o método enviarNotificacao de cada notificação.
     */
    public void enviarNotificacoesPendentes() {
        for (Notificacao notificacao : notificacoes) {
            notificacao.enviarNotificacao();
        }
        notificacoes.clear();
    }

    /**
     * Lista todas as notificações enviadas.
     * Esta implementação imprime no console a mensagem formatada de cada notificação.
     */
    public void listarNotificacoesEnviadas() { // Revisar
        for (Notificacao notificacao : notificacoes) {
            System.out.println(notificacao.formatarMensagem());

        }
    }
}