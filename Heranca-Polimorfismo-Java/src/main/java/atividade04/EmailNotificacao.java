package main.java.atividade04;

import java.time.LocalDateTime;

public class EmailNotificacao extends Notificacao {

    private String assunto;

    public EmailNotificacao(String mensagem, String destinatario, LocalDateTime dataEnvio, String assunto) {
        super(mensagem, destinatario, dataEnvio);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String formatarMensagem() {
        return "E-mail: " + "[" + assunto + "]" + "-";
    }

    @Override
    public void enviarNotificacao() {
        System.out.println(formatarMensagem() + mensagem );
    }
}
