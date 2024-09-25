package main.java.atividade04;

/**
 * Representa uma notificação por SMS.
 * Herda da classe abstrata Notificacao e implementa o método formatarMensagem().
 * Além dos atributos da classe base, possui o campo específico "numeroTelefone".
 */
public class SMSNotificacao extends Notificacao {

    private String numeroTelefone;

    /**
     * Constrói a notificação por SMS
     * @param mensagem A mensagem a ser enviada no SMS.
     * @param destinatario O destinatário da notificação por SMS.
     * @param numeroTelefone O número de telefone para o qual a notificação será enviada.
     */
    public SMSNotificacao(String mensagem, String destinatario, String numeroTelefone) {
        super(mensagem, destinatario);
        this.numeroTelefone = numeroTelefone;
    }

    /**
     * Formata a mensagem da notificação.
     * @return Uma string formatada com o prefixo "SMS", o número de telefone e a mensagem.
     */
    @Override
    public String formatarMensagem() {
        return "SMS para [" + numeroTelefone + "]: " + getMensagem();
    }

    /**
     * Envia a notificação por SMS imprimindo a mensagem formatada, o destinatário e a data de envio.
     */
    @Override
    public void enviarNotificacao() {
        System.out.println(formatarMensagem() + " para " + getDestinatario() + " em " + formatarDataEnvio());
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
