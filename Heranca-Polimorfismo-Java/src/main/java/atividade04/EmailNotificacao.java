package main.java.atividade04;

/**
 * Representa uma notificação por e-mail.
 * Herda da classe abstrata Notificacao e implementa o método formatarMensagem().
 * Além dos atributos da classe base, possui o campo específico "assunto".
 */
public class EmailNotificacao extends Notificacao {

    private String assunto;

    /**
     * Constrói um Email
     * @param mensagem A mensagem a ser enviada no corpo do e-mail.
     * @param destinatario O destinatário da notificação por e-mail.
     * @param assunto O assunto do e-mail.
     */
    public EmailNotificacao(String mensagem, String destinatario, String assunto) {
        super(mensagem, destinatario);
        this.assunto = assunto;
    }
    /**
     * Formata a mensagem da notificação
     * @return Uma string formatada que inclui o tipo da notificação (E-mail), o assunto e a mensagem.
     */
    @Override
    public String formatarMensagem() {
        return "\nE-mail: [" + assunto + "] - " + getMensagem();
    }
    /**
     * Imprime a notificação formatada.
     * Exibe o destinatário, a data de envio e o a mensagem formatada.
     */
    @Override
    public void enviarNotificacao() {
        System.out.println("Para " + getDestinatario() + " em " + formatarDataEnvio() + formatarMensagem());
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
