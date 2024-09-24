package main.java.atividade04;

import java.time.LocalDateTime;

public class SMSNotificacao extends Notificacao{
    private String numeroTelefone;

    public SMSNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio) {
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
