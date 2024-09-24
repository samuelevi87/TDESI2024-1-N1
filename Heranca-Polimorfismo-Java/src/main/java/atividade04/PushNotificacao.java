package main.java.atividade04;

public class PushNotificacao extends Notificacao {
    private String dispositivo;

    public PushNotificacao(String menssagem, String destinatario, String dispositivo) {
        super(menssagem, destinatario);
        this.dispositivo = dispositivo;
    }

    @Override
    public String formatarMensagem() {
        return "Push para"+ dispositivo;
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando "+formatarMensagem()+" para "+getDestinatario());

    }
}
