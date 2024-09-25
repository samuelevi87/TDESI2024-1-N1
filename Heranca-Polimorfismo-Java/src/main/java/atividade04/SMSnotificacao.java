package main.java.atividade04;

public class SMSnotificacao extends Notificacao {
    private String numeroTelefone;

    public SMSnotificacao(String mensagem, String destinatario, String numeroTelefone) {
        super(mensagem, destinatario);
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }
    @Override
    public String formatarMensagem() {
        return "Para" + getDestinatario() + "\n" +
                "Mensagem" + getMensagem() + "\n" +
                "Data de Envio" + getDataEnvio();
    }
    @Override
    public void enviarNotificacao() {
        /**
         * Enviar a notificação por SMS
         */
        System.out.println("Enviando SMS:\n" + formatarMensagem());
    }
}
