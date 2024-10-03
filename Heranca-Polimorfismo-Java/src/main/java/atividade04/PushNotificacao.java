package main.java.atividade04;

/**
 * Representa uma notificação push.
 * Estende a classe Notificacao e implementa funcionalidades específicas para notificações push.
 */
public class PushNotificacao extends Notificacao {
    private String dispositivo;

    /**
     * Constrói uma nova PushNotificacao.
     *
     * @param mensagem A mensagem da notificação.
     * @param destinatario O nome do destinatário.
     * @param dispositivo O identificador do dispositivo do destinatário.
     */
    public PushNotificacao(String mensagem, String destinatario, String dispositivo) {
        super(mensagem, destinatario);
        this.dispositivo = dispositivo;

    }
    @Override
    public String formatarMensagem() {
        return "Push " + dispositivo + "\n" +
                "Para: " + getDestinatario() + "\n" +
                "Mensagem: " + getMensagem();
    }

    @Override
    public void enviarNotificacao() {

        System.out.println("Enviando Notificação push:\n" + getDestinatario() + " (dispositivo: " + dispositivo + "): " + formatarMensagem());

    }
}
