package main.java.atividade04;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Notificacao implements Notificavel {
    private String mensagem;
    private String destinatario;
    private LocalDate dataEnvio;

    public Notificacao(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        this.dataEnvio = dataEnvio.now();
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public LocalDate getDataEnvio() {
        return dataEnvio;
    }
    public String formatarMensagem() {
        return formatarMensagem();
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
