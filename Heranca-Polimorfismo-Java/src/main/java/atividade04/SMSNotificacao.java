package main.java.atividade04;

/**
 * Representa uma notificação por SMS.
 * Estende a classe Notificacao e adiciona funcionalidades específicas para notificações por SMS.
 */
public class SMSNotificacao extends Notificacao{
    private String numeroTelefone;

    /**
     * Constrói um SMS.
     * @param mensagem A mensagem do SMS.
     * @param destinatario O destinatário do SMS.
     * @param numeroTelefone O número de telefone ao qual será enviada a notificação.
     */
    public SMSNotificacao(String mensagem, String destinatario, String numeroTelefone) {
        super(mensagem, destinatario);
        this.numeroTelefone = numeroTelefone;
    }

    /**
     * Formata a mensagem da notificação por SMS.
     * @return A mensagem formatada.
     */
    @Override
    public String formatarMensagem() {
        return "SMS para " + numeroTelefone + ": ";
    }

    /**
     * Envia a notificação formatada.
     */
    @Override
    public void enviarNotificacao() {
        System.out.println(formatarMensagem() + this.getMensagem());
        this.setEnviada(true);
    }
}
