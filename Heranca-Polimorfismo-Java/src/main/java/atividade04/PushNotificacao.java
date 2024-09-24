package main.java.atividade04;

public abstract class PushNotificacao extends Notificacao {
    private String dispositivo;

    public PushNotificacao(String menssagem, String destinatario, String dispositivo) {
        super(menssagem, destinatario);
        this.dispositivo = dispositivo;
    }
}
