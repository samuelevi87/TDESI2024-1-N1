package main.java.atividade04;

import java.time.LocalDateTime;

public class SMSNotificacao extends Notificacao{

    private String numeroTelefone;

    public SMSNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio, String numeroTelefone) {
        super(mensagem, destinatario, dataEnvio);
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String formatarMensagem() {
        return "SMS para " + "[" + numeroTelefone + "]" + "-";
    }

    @Override
    public void enviarNotificacao() {
        formatarMensagem();
    }
}
