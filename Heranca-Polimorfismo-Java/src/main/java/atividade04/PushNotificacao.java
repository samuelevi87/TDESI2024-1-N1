package main.java.atividade04;

/**
 * Representa uma notificação por push.
 * Estende a classe Notificacao e adiciona funcionalidades específicas para notificações por push.
 */
public class PushNotificacao extends Notificacao{
    private String dispositivo;

    /**
     * Constrói um push.
     * @param mensagem A mensagem do push.
     * @param destinatario O destinatário do push.
     * @param dispositivo O tipo de dispositivo ao qual será enviada a notificação.
     */
    public PushNotificacao(String mensagem, String destinatario, String dispositivo) {
        super(mensagem, destinatario);
        this.dispositivo = dispositivo;
    }

    /**
     * Formata a mensagem da notificação por push.
     * @return A mensagem formatada.
     */
    @Override
    public String formatarMensagem() {
        return "Push para " + dispositivo + ": ";
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
