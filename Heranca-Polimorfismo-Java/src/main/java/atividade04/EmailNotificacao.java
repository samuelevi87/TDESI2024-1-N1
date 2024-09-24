package main.java.atividade04;

public abstract class EmailNotificacao extends Notificacao {

    private String assunto;

    public EmailNotificacao(String menssagem, String destinatario, String assunto) {
        super(menssagem, destinatario);
        this.assunto = assunto;
    }

    @Override
    public String formatarMensagem(String msg) {
        return "E-mail: ";
    }

    @Override
    public void enviarNotificacao() {

    }
}
