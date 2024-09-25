package main.java.atividade04;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um gerenciador das notificações.
 */
public class GerenciarNotificacoes {

    private List<Notificacao> listaDeNotificacoes;

    /**
     * Constrói um novo gerenciador.
     * Inicializa a lista de notificações.
     */
    public GerenciarNotificacoes(){
        this.listaDeNotificacoes = new ArrayList<>();
    }

    /**
     * Adiciona uma notificação na lista de notificações.
     * @param notificacao
     */
    public void adicionarNotificacao(Notificacao notificacao){
        this.listaDeNotificacoes.add(notificacao);
    }

        /**
         * Envia as notificações que estão pendentes.
         */
        public void enviarNotificacoesPendentes() {
            for (Notificacao notificacao : listaDeNotificacoes) {
                notificacao.enviarNotificacao();
            }
            listaDeNotificacoes.clear();
        }
        /**
         * Lista todas as notificações enviadas.
         */
        public void listarNotificacoesEnviadas() {
            if (listaDeNotificacoes.isEmpty()) {
                System.out.println("Nenhuma notificação pendente ou enviada.");
            } else {
                for (Notificacao notificacao : listaDeNotificacoes) {
                    listaDeNotificacoes.forEach(System.out::println);
                }
            }
        }
}
