package main.java.atividade04;

public class SMSNotificacao extends Notificação {
    private String numeroTelefone;

    public SMSNotificacao(String mensagem, String destinatario, String numeroTelefone) {
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
    public void enviarNotificacão() {
        System.out.println("Enviando SMS para " + getDestinatario() + " (" + numeroTelefone + "): " + formatarMensagem());
    }
}