package main.java.atividade04;

/**
 * Representa uma notificação por e-mail.
 * Estende a classe Notificacao e implementa funcionalidades específicas para e-mail.
 */
public class CorrecaoEmailNotificacao extends CorrecaoNotificacao {
    private String assunto;

    /**
     * Constrói uma nova EmailNotificacao.
     *
     * @param mensagem A mensagem da notificação.
     * @param destinatario O endereço de e-mail do destinatário.
     * @param assunto O assunto do e-mail.
     */
    public CorrecaoEmailNotificacao(String mensagem, String destinatario, String assunto) {
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
    public void enviarNotificacao() {
        System.out.println("Enviando e-mail para " + getDestinatario() + ": " + formatarMensagem());
    }
}