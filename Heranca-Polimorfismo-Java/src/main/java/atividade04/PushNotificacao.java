package main.java.atividade04;

public class PushNotificacao extends Notificação{
    private String dispositivo;

    public PushNotificacao(String mensagem, String destinatario, String dispositivo) {
        super(mensagem, destinatario);
        this.dispositivo = dispositivo;
    }
    @Override
    public String formatarMensagem() {
        return "Push para " + dispositivo + ": " + getMensagem();
    }

    @Override
    public void enviarNotificacão() {
        System.out.println("Enviando notificação push para " + getDestinatario() + " (dispositivo: " + dispositivo + "): " + formatarMensagem());

    }
}
