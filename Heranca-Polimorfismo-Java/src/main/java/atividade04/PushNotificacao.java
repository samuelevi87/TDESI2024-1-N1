package main.java.atividade04;

public class PushNotificacao extends Notificacao {
    private String dispositivo;

    public PushNotificacao(String mensagem, String destinatario, String dispositivo) {
        super(mensagem, destinatario);
        this.dispositivo = dispositivo;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    @Override
    public String formatarMensagem() {
        return "Aplicativo" + dispositivo + "\n" +
                "Para: " + getDestinatario() + "\n" +
                "Mensagem: " + getMensagem() + "\n" +
                "Data de Envio: " + getDataEnvio();
    }

    @Override
    public void enviarNotificacao() {
        /**
         * Enviar a Notificação push
         */
        System.out.println("Enviando Notificação push:\n" + formatarMensagem());

    }
}
