package main.java.atividade04;

import java.time.LocalDateTime;

public  class SMSNotificacao extends Notificacao {
    private String numeroTelefone;

    public SMSNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio, String numeroTelefone) {
        super(mensagem, destinatario, dataEnvio);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String fromatarMensagem() {
        return null;
    }

    @Override
    public String toString() {
        return "SMSNotificacao{" +
                "numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }

    @Override
    public void enviarNotificacao() {

    }
}
