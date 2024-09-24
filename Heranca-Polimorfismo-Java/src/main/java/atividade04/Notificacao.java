package main.java.atividade04;

import java.time.LocalDateTime;

public class Notificacao implements Notificavel {
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
    public abstract String formatarMensagem();

    @Override
    public String toString() {
        return "Notificacao{" +
                "mensagem='" + mensagem + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", dataEnvio=" + dataEnvio +
                '}';
    }
}



