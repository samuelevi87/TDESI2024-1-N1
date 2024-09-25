package main.java.atividade04;

public class SMSNotificacao extends Notificacao{
    private String numeroTelefone;

    public SMSNotificacao(String mensagem, String destinatorio, String numeroTelefone) {
        super(mensagem, destinatorio);
        this.numeroTelefone = numeroTelefone;
    }
    public String getNumeroTelefone() {
        return numeroTelefone;
    }
    @Override
    public String formatarMensagem() {
        return "Para: " + getDestinatario() + "\n" +
                "Mensagem: " + getMensagem() + "\n" +
                "Data de Envio: " + getDataEnvio();
    }
    @Override
    public void enviarNotificacao() {
        // Lógica para enviar a notificação por SMS
        System.out.println("Enviando SMS:\n" + formatarMensagem());
    }
}
