package main.java.atividade04;

import java.time.LocalDateTime;

public  class PushNotificacao extends Notificacao {
    private  String dispositivo;

    public PushNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio, String dispositivo) {
        super(mensagem, destinatario, dataEnvio);
        this.dispositivo = dispositivo;
    }

    @Override
    public String fromatarMensagem() {
        return null;
    }

    @Override
    public String toString() {
        return "PushNotificacao{" +
                "dispositivo='" + dispositivo + '\'' +
                '}';
    }

    @Override
    public void enviarNotificacao() {

    }
}
