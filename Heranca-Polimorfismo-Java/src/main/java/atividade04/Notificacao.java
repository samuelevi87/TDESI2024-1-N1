package main.java.atividade04;

import java.time.LocalDateTime;

public abstract class Notificacao implements Notificavel {

    private String mensagem;
    private String destinatario;
    private LocalDateTime dataEnvio;

    public Notificacao(String mensagem, String destinatario, LocalDateTime dataEnvio) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        this.dataEnvio = dataEnvio;
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

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public abstract String formatarMensagem();

}
