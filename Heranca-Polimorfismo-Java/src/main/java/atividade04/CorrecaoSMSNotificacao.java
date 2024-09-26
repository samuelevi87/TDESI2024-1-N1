package main.java.atividade04;

/**
 * Representa uma notificação por SMS.
 * Estende a classe Notificacao e implementa funcionalidades específicas para SMS.
 */
public class CorrecaoSMSNotificacao extends CorrecaoNotificacao {
    private String numeroTelefone;

    /**
     * Constrói uma nova SMSNotificacao.
     *
     * @param mensagem A mensagem da notificação.
     * @param destinatario O nome do destinatário.
     * @param numeroTelefone O número de telefone do destinatário.
     */
    public CorrecaoSMSNotificacao(String mensagem, String destinatario, String numeroTelefone) {
        super(mensagem, destinatario);
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String formatarMensagem() {
        return "SMS para " + numeroTelefone + ": " + getMensagem();
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando SMS para " + getDestinatario() + " (" + numeroTelefone + "): " + formatarMensagem());
    }
}