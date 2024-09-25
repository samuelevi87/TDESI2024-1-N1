package main.java.atividade04;

import java.time.LocalDateTime;

public class PushNotificacao extends Notificacao{

    private String dispositivo;

    public PushNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio, String dispositivo) {
        super(mensagem, destinatario, dataEnvio);
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public String formatarMensagem() {
        return "Push para " + "[" + dispositivo + "]" + "-";
    }

    @Override
    public void enviarNotificacao() {
        formatarMensagem();
    }
}
