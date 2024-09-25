package main.java.atividade04;

public class EmailNotificacao extends Notificacao{
    private String assunto;

    public EmailNotificacao(String mensagem, String destinatario, String assunto) {
        super(mensagem, destinatario);
        this.assunto = assunto;
    }

    @Override
    public String formatarMensagem() {
        return "E-mail: [" + assunto + "] - " + getMensagem();
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando Notificação por E-mail para " + getDestinatario() + ": " + formatarMensagem());
    }
}
