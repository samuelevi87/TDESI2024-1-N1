package main.java.atividade04;

public class PushNotificacao extends Notificacao{
    private String dispositivo;

    public PushNotificacao(String mensagem, String destinatorio, String dispositivo) {
        super(mensagem, destinatorio);
        this.dispositivo = dispositivo;
    }
    public String getDispositivo() {
        return dispositivo;
    }

    @Override
    public String formatarMensagem() {
        return "Aplicativo: " + dispositivo + "\n" +
                "Para: " + getDestinatario() + "\n" +
                "Mensagem: " + getMensagem() + "\n" +
                "Data de Envio: " + getDataEnvio();
    }
    @Override
    public void enviarNotificacao() {
        // Lógica para enviar a notificação push
        System.out.println("Enviando notificação push:\n" + formatarMensagem());
    }

}
