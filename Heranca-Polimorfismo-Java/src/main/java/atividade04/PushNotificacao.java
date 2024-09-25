package main.java.atividade04;

/**
 * Representa uma notificação push.
 * Herda da classe abstrata Notificacao e implementa o método formatarMensagem().
 * Além dos atributos da classe base, possui o campo específico "dispositivo".
 */
public class PushNotificacao extends Notificacao {

    private String dispositivo;

    /**
     * Constrói a notificação push com a mensagem, destinatário e dispositivo fornecidos.
     * @param mensagem A mensagem a ser enviada no push.
     * @param destinatario O destinatário da notificação push.
     * @param dispositivo O dispositivo para o qual a notificação será enviada.
     */
    public PushNotificacao(String mensagem, String destinatario, String dispositivo) {
        super(mensagem, destinatario);
        this.dispositivo = dispositivo;
    }

    /**
     * Formata a mensagem da notificação push
     * @return Uma string formatada com o tipo de notificação, o dispositivo e a mensagem
     */
    @Override
    public String formatarMensagem() {
        return "Push para [" + dispositivo + "]: " + getMensagem();
    }

    /**
     * Envia a notificação push imprimindo a mensagem formatada, o destinatário e a data de envio.
     */
    @Override
    public void enviarNotificacao() {
        System.out.println(formatarMensagem() + "\nPara " + getDestinatario() + " em " + formatarDataEnvio());
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }
}
