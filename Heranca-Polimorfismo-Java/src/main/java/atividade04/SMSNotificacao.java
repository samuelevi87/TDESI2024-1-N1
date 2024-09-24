package main.java.atividade04;

public class SMSNotificacao extends Notificacao{
    private String numeroTelefone;

    public SMSNotificacao(String menssagem, String destinatario, String numeroTelefone) {
        super(menssagem, destinatario);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String formatarMensagem() {
        return "SMS para "+numeroTelefone;
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando "+formatarMensagem()+" para "+getDestinatario());
    }
}
