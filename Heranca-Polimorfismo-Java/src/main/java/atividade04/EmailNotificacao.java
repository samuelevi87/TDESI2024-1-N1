package main.java.atividade04;

public class EmailNotificacao extends Notificação {
    private String assunto;

    public EmailNotificacao(String mensagem, String destinatario, String assunto) {
        super(mensagem, destinatario);
        this.assunto = assunto;
    }

    @Override
    public String formatarMensagem() {
        return null;
    }

    @Override
    public void enviarNotificacão() {

    }
}
