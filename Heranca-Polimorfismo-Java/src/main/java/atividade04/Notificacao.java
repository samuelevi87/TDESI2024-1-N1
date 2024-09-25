package main.java.atividade04;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Notificacao implements Notificavel {
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

    public String getDestinatario() {
        return destinatario;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public abstract String formatarMensagem();
}
