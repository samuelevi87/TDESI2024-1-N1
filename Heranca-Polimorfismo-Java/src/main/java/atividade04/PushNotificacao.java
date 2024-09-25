package main.java.atividade04;

/**
 * Classe que representa uma notificação enviada via Push.
 * Extende a classe Notificacao para fornecer uma implementação específica
 * para o envio de notificações a dispositivos móveis ou aplicativos.
 */
public class PushNotificacao extends Notificacao {
    private String dispositivo;

    /**
     * Construtor para inicializar a notificação Push.
     * @param mensagem A mensagem a ser enviada na notificação Push.
     * @param destinatario O destinatário da notificação.
     * @param dispositivo O dispositivo que receberá a notificação.
     */
    public PushNotificacao(String mensagem, String destinatario, String dispositivo) {
        super(mensagem, destinatario);
        this.dispositivo = dispositivo;
    }

    /**
     * Formata a mensagem da notificação Push.
     * @return A string formatada que contém o dispositivo destinatário.
     */
    @Override
    public String formatarMensagem() {
        return "Push para [" + dispositivo + "]: ";
    }

    /**
     * Envia a notificação via Push.
     * Esta implementação imprime no console a mensagem formatada
     * junto com o destinatário.
     */
    @Override
    public void enviarNotificacao() {
        System.out.println("Para " + getDestinatario() + ": " + formatarMensagem() + getMensagem());
    }
}
