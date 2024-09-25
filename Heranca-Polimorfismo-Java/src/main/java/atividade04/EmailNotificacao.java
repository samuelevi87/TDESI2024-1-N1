package main.java.atividade04;

public class EmailNotificacao extends Notificacao {

    private String assunto;

    public EmailNotificacao(String menssagem, String destinatario, String assunto) {
        super(menssagem, destinatario);
        this.assunto = assunto;
    }

    @Override
    public String formatarMensagem() {
        return "E-mail: "+assunto;
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando "+formatarMensagem()+"\nDestinatario: "+getDestinatario());

    }
}
