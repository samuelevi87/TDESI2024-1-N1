package main.java.atividade04;

import java.time.LocalDateTime;

public  class EmailNotificacao extends Notificacao {
    private String assunto;

    public EmailNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio, String assunto) {
        super(mensagem, destinatario, dataEnvio);
        this.assunto = assunto;
    }

    @Override
    public String formatarMensagem() {
        return null;
    }

    @Override
    public String toString() {
        return "EmailNotificacao{" +
                "assunto='" + assunto + '\'' +
                '}';
    }
}

