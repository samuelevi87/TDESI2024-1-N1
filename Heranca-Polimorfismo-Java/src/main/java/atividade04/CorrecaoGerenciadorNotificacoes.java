package main.java.atividade04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Gerencia o envio e armazenamento de notificações.
 */
public class CorrecaoGerenciadorNotificacoes {
    private List<CorrecaoNotificacao> todasNotificacoes;

    /**
     * Constrói um novo GerenciadorNotificacoes.
     * Inicializa a lista de notificações.
     */
    public CorrecaoGerenciadorNotificacoes() {
        this.todasNotificacoes = new ArrayList<>();
    }

    /**
     * Adiciona uma notificação à lista.
     *
     * @param notificacao A notificação a ser adicionada.
     */
    public void adicionarNotificacao(CorrecaoNotificacao notificacao) {
        todasNotificacoes.add(notificacao);
    }

    /**
     * Envia todas as notificações pendentes.
     */
    public void enviarTodasNotificacoes() {
        todasNotificacoes.forEach(CorrecaoNotificacao::enviarNotificacao);
    }

    /**
     * Envia todas as notificações pendentes (versão simples).
     */
    public void enviarTodasNotificacoesSimples() {
        for (CorrecaoNotificacao notificacao : todasNotificacoes) {
            notificacao.enviarNotificacao();
        }
    }

    /**
     * Lista todas as notificações enviadas.
     *
     * @return Uma lista de strings representando as notificações.
     */
    public List<String> listarNotificacoesEnviadas() {
        return todasNotificacoes.stream()
                .map(CorrecaoNotificacao::toString)
                .collect(Collectors.toList());
    }

    /**
     * Lista todas as notificações enviadas (versão simples).
     *
     * @return Uma lista de strings representando as notificações.
     */
    public List<String> listarNotificacoesEnviadasSimples() {
        List<String> listaDeNotificacoesEnviadas = new ArrayList<>();
        for (CorrecaoNotificacao notificacao : todasNotificacoes) {
            listaDeNotificacoesEnviadas.add(notificacao.toString());
        }
        return listaDeNotificacoesEnviadas;
    }
}