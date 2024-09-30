package main.java.atividade04;
import java.util.ArrayList;
import java.util.List;

/**
 * Gerencia o envio e armazenamento de notificações.
 */
public class GerenciadorNotificacao {
    private List<Notificacao> todasNotificacoes;

    /**
     * Constrói um novo GerenciadorNotificacoes.
     * Inicializa a lista de notificações.
     */
    public GerenciadorNotificacao() {
        this.todasNotificacoes = new ArrayList<>();}

    /**
     * Adiciona uma notificação à lista.
     *
     * @param notificacao A notificação a ser adicionada.
     */
    public void adicionarNotificacao(main.java.atividade04.Notificacao notificacao) {todasNotificacoes.add(notificacao);}

        /**
         * Envia todas as notificações pendentes.
         */
        public void enviarTodasNotificacoes () {
            for (Notificacao notificacao : todasNotificacoes) {
                notificacao.enviarNotificacao();
            }
        }

        /**
         * Lista todas as notificações enviadas.
         *
         * @return Uma lista de strings representando as notificações.
         */
        public List<String> listarNotificacoesEnviadas() {
            List<String> listaDeNotificacoesEnviadas = new ArrayList<>();
            for (Notificacao notificacao : todasNotificacoes) {
                listaDeNotificacoesEnviadas.add(notificacao.toString());
            }
            return listaDeNotificacoesEnviadas;
    }
}