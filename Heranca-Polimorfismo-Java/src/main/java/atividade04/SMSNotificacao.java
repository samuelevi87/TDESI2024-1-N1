package main.java.atividade04;

import java.time.LocalDateTime;

public class SMSNotificacao extends Notificacao {

    private Integer numeroTelefone;

    public SMSNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio, Integer numeroTelefone) {
        super(mensagem, destinatario, dataEnvio);
        this.numeroTelefone = numeroTelefone;
    }

    public Integer getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(Integer numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String formatarMensagem() {
        return "SMS para: " + numeroTelefone;
    }

    @Override
    public void enviarNotificacao() {
        System.out.println(formatarMensagem() + "\n" + getMensagem() + "\nDestinatário: " + getDestinatario() + "Envio: " + getDataEnvio() + "\n");
    }
}
