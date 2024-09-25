package main.java.atividade04;

public class EmailNotificacao extends Notificacao{
    private String assunto;

    public EmailNotificacao(String mensagem, String destinatario, String assunto) {
        super(mensagem, destinatario);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    @Override
    public String toString() {
        return "EmailNotificacao{" +
                "assunto='" + assunto + '\'' +
                '}';
    }
    public void enviarNotificacao() {
        /**
         * Enviar a notoficação por email
         */
        System.out.println("Enviar email:\n" + formatarMensagem());
    }
}
