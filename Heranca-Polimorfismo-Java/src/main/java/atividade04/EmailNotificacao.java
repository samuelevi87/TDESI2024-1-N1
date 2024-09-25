package main.java.atividade04;

/**
 * Classe que representa uma notificação enviada por e-mail.
 * Extende a classe Notificacao para fornecer uma implementação específica
 * para o envio de e-mails.
 */
public class EmailNotificacao extends Notificacao {
    private String assunto;

    /**
     * Construtor para inicializar a notificação de e-mail.
     * @param mensagem A mensagem a ser enviada no corpo do e-mail.
     * @param destinatario O endereço de e-mail do destinatário.
     * @param assunto O assunto do e-mail.
     */
    public EmailNotificacao(String mensagem, String destinatario, String assunto) {
        super(mensagem, destinatario);
        this.assunto = assunto;
    }

    /**
     * Formata a mensagem do e-mail.
     * @return A string formatada que contém o assunto do e-mail.
     */
    @Override
    public String formatarMensagem() {
        return  "E-mail: [" + assunto + "] - ";
    }

    /**
     * Envia a notificação por e-mail.
     * Esta implementação imprime no console a mensagem formatada
     * junto com o destinatário.
     */
    @Override
    public void enviarNotificacao() {
        System.out.println("Para " + getDestinatario() + ": " + formatarMensagem() + getMensagem());
    }
}