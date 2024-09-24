package main.java.atividade04;

import java.time.LocalDateTime;

public class PushNotificacao extends Notificação{
    private String dispositivo;

    public PushNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio) {
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
