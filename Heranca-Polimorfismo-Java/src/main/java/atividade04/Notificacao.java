package main.java.atividade04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe abstrata que representa uma notificação.
 * Implementa a interface Notificavel e define a estrutura básica de uma notificação
 */
public abstract class Notificacao implements Notificavel{

    private String mensagem;
    private String destinatario;
    private LocalDateTime dataEnvio;

    /**
     * Constrói uma notificação
     * @param mensagem A mensagem da notificação.
     * @param destinatario O destinatário da notificação.
     */
    public Notificacao(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        this.dataEnvio = LocalDateTime.now();
    }
    /**
     * Método abstrato que será implementado nas subclasses para definir o formato da mensagem.
     * @return String formatada com o conteúdo da mensagem específica.
     */
    public abstract String formatarMensagem();

    public String formatarDataEnvio() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataEnvio.format(formatter);
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

    /**
     * Retorna uma representação em String da notificação, incluindo mensagem, destinatário e data de envio.
     * @return Uma string representando a notificação.
     */
    @Override
    public String toString() {
        return "mensagem: '" + mensagem + '\'' +
                ", destinatario: '" + destinatario + '\'' +
                ", dataEnvio: " + dataEnvio;
    }
}
