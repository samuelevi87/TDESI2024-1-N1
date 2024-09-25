package main.java.atividade04;

/**
 * Representa uma notificação por email.
 * Estende a classe Notificacao e adiciona funcionalidades específicas para notificações por email.
 */
public class EmailNotificacao extends Notificacao{
    private String assunto;

    /**
     * Constrói um email.
     * @param mensagem A mensagem do email.
     * @param destinatario O destinatário do email.
     * @param assunto O assunto do email.
     */
    public EmailNotificacao(String mensagem, String destinatario, String assunto) {
        super(mensagem, destinatario);
        this.assunto = assunto;
    }

    /**
     * Formata a mensagem da notificação por email.
     * @return A mensagem formatada.
     */
    @Override
    public String formatarMensagem() {
        return "E-mail: " + assunto + " - ";
    }

    /**
     * Envia a notificação formatada.
     */
    @Override
    public void enviarNotificacao() {
        System.out.println(formatarMensagem() + "\nDestinatário: " + this.getDestinatario() + "\n\n" + this.getMensagem());
        this.setEnviada(true);
    }
}
