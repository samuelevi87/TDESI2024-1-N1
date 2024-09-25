package main.java.atividade04;

public class SMSNotificacao extends Notificacao{
    private String numeroTelefone;

    public SMSNotificacao(String mensagem, String destinatario, String numeroTelefone) {
        super(mensagem, destinatario);
        this.numeroTelefone = numeroTelefone;
    }


    @Override
    public String formatarMensagem() {
        return "SMS para " + numeroTelefone + ": " + getMensagem();
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando Notificação por SMS para " + getDestinatario() + ": " + formatarMensagem());
    }
}
