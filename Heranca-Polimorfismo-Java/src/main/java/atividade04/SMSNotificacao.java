package main.java.atividade04;

import java.time.LocalDateTime;

public class SMSNotificacao extends Notificação {
    private String numeroTelefone;

    public SMSNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio) {
        super(mensagem, destinatario, dataEnvio);
    }

    @Override
    public String FromaTarMensagem() {
        return null;
    }

    @Override
    public void enviarNotificacão() {

    }
}
