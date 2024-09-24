package main.java.atividade04;

import java.time.LocalDateTime;

public class PushNotificacao extends Notificacao{
    private String dispositivo;

    public PushNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio) {
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
