package main.java.atividade04;

/**
 * Representa uma notificação push.
 * Estende a classe Notificacao e implementa funcionalidades específicas para notificações push.
 */
public class CorrecaoPushNotificacao extends CorrecaoNotificacao {
    private String dispositivo;

    /**
     * Constrói uma nova PushNotificacao.
     *
     * @param mensagem A mensagem da notificação.
     * @param destinatario O nome do destinatário.
     * @param dispositivo O identificador do dispositivo do destinatário.
     */
    public CorrecaoPushNotificacao(String mensagem, String destinatario, String dispositivo) {
        super(mensagem, destinatario);
        this.dispositivo = dispositivo;
    }

    @Override
    public String formatarMensagem() {
        return "Push para " + dispositivo + ": " + getMensagem();
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando notificação push para " + getDestinatario() + " (dispositivo: " + dispositivo + "): " + formatarMensagem());
    }
}