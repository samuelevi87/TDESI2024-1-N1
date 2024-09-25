package main.java.atividade04;

/**
 * Classe que representa uma notificação enviada por SMS.
 * Extende a classe Notificacao para fornecer uma implementação específica
 * para o envio de mensagens de texto.
 */
public class SMSNotificacao extends Notificacao {
    private String numeroTelefone;

    /**
     * Construtor para inicializar a notificação de SMS.
     * @param mensagem A mensagem a ser enviada no corpo do SMS.
     * @param destinatario O destinatário da notificação.
     * @param numeroTelefone O número de telefone do destinatário.
     */
    public SMSNotificacao(String mensagem, String destinatario, String numeroTelefone) {
        super(mensagem, destinatario);
        this.numeroTelefone = numeroTelefone;
    }

    /**
     * Formata a mensagem do SMS.
     * @return A string formatada que contém o número de telefone do destinatário.
     */
    @Override
    public String formatarMensagem() {
        return "SMS para [" + numeroTelefone + "]: ";
    }

    /**
     * Envia a notificação por SMS.
     * Esta implementação imprime no console a mensagem formatada
     * junto com o destinatário.
     */
    @Override
    public void enviarNotificacao() {
        System.out.println(formatarMensagem() + getDestinatario() + ": " + getMensagem());
    }
}