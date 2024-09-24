package main.java.atividade04;


import java.time.LocalDate;

public class EmailNotificacao extends Notificação {
    private String assunto;

    public EmailNotificacao(String mensagem, String destinatario, LocalDate dataEnvio) {
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
