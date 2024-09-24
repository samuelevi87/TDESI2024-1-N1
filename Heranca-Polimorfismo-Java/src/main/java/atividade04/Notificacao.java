package main.java.atividade04;

import java.time.LocalDateTime;

public abstract class Notificacao implements Notificavel{
    private String mensagem;
    private String destinatario;
    private LocalDateTime dataEnvio;

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
        return "\nMensagem: \"" + mensagem + '\"' +
                "\nDestinatario: \"" + destinatario + '\"' +
                "\nData de envio: " + dataEnvio;
    }

    /**
     * Formata a mensagem da notificação.
     * @return A mensagem formatada.
     */
    public abstract String formatarMensagem();
}
