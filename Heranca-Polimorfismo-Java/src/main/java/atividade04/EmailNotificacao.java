package main.java.atividade04;

public class EmailNotificacao extends Notificação {
    private String assunto;

    public EmailNotificacao(String mensagem, String destinatario, String assunto) {
        super(mensagem, destinatario);
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
        return "E-mail: [" + assunto + "] - " + getMensagem();
    }


    @Override
    public void enviarNotificacão() {
        System.out.println("Enviando e-mail para " + getDestinatario() + ": " + formatarMensagem());
    }
}
