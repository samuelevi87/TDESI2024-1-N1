package main.java.atividade04;

import java.time.LocalDateTime;

public class EmailNotificacao extends Notificacao{
    private String assunto;

    public EmailNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio) {
        super(mensagem, destinatario, dataEnvio);
    }

    @Override
    public String FormatarMensagem() {
        return null;
    }

    @Override
    public void enviarNotificacao() {

    }
}
