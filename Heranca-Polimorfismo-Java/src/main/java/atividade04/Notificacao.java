package main.java.atividade04;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 * Cria a mensagem com dados de destinatário e data de envio.
 */
public abstract class Notificacao implements Notificavel {

    private String mensagem;

    private String destinatario;

    private LocalDateTime dataEnvio;
    /**
     * Constrói uma nova notificação.
     */
    public Notificacao(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        this.dataEnvio = LocalDateTime.now();
    }

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

    @Override
    public String toString() {
        return "Notificacao{" +
                "mensagem='" + mensagem + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", dataEnvio=" + dataEnvio +
                '}';
    }

    /**
     * Formata a mensagem da notificação
     * @return A mensagem formatada.
     */
    public abstract String formatarMensagem();
}
