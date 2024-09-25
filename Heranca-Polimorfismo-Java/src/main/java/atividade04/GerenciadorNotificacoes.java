package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar notificações pendentes e enviadas.
 * Permite adicionar notificações, enviar as notificações pendentes e listar as notificações enviadas.
 */
public class GerenciadorNotificacoes {

    private List<Notificacao> notificacoesPendentes;
    private List<Notificacao> notificacoesEnviadas;

    /**
     * Constrói o gerenciador com listas vazias de notificações pendentes e enviadas.
     */
    public GerenciadorNotificacoes() {
        this.notificacoesPendentes = new ArrayList<>();
        this.notificacoesEnviadas = new ArrayList<>();
    }

    /**
     * Adiciona uma notificação à lista de notificações pendentes.
     * @param notificacao notificação a ser adicionada.
     */
    public void adicionarNotificacao(Notificacao notificacao) {
        notificacoesPendentes.add(notificacao);
    }

    /**
     * Envia todas as notificações pendentes.
     * Após o envio, move as notificações da lista de pendentes para a lista de enviadas e limpa a lista de pendentes.
     */
    public void enviarNotificacoesPendentes() {
        notificacoesPendentes.forEach(notificacao -> {
            notificacao.enviarNotificacao();
            notificacoesEnviadas.add(notificacao);
        });
        notificacoesPendentes.clear();
    }

    /**
     * Lista todas as notificações enviadas.
     */
    public void listarNotificacoesEnviadas() {
        notificacoesEnviadas.forEach(System.out::println);
    }
}
