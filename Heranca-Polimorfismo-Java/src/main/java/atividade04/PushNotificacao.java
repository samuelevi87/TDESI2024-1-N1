package main.java.atividade04;

public class PushNotificacao extends Notificacao{
    private String dispositivo;

    public PushNotificacao(String mensagem, String destinatario, String dispositivo) {
        super(mensagem, destinatario);
        this.dispositivo = dispositivo;
    }

    @Override
    public String formatarMensagem() {
        return "Push para " + dispositivo + ": ";
    }

    @Override
    public void enviarNotificacao() {
        System.out.println(formatarMensagem() + this.getMensagem());
    }
}
