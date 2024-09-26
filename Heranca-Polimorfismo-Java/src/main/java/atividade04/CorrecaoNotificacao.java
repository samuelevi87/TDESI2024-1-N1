package main.java.atividade04;

import java.time.LocalDateTime;

/**
 * Representa uma notificação abstrata.
 * Esta classe serve como base para todos os tipos de notificações.
 */
public abstract class CorrecaoNotificacao implements CorrecaoNotificavel {
    private String mensagem;
    private String destinatario;
    private LocalDateTime dataEnvio;

    /**
     * Constrói uma nova Notificacao.
     *
     * @param mensagem A mensagem da notificação.
     * @param destinatario O destinatário da notificação.
     */
    public CorrecaoNotificacao(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        this.dataEnvio = LocalDateTime.now();
    }

    /**
     * Formata a mensagem da notificação.
     *
     * @return A mensagem formatada.
     */
    public abstract String formatarMensagem();

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    @Override
    public String toString() {
        return "Notificacao{" +
                "mensagem='" + mensagem + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", dataEnvio=" + dataEnvio +
                '}';
    }
}
