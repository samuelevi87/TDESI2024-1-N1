package main.java.atividade04;

public abstract class SMSNotificacao extends Notificacao{
    private String numeroTelefone;

    public SMSNotificacao(String mensagem, String destinatario, String numeroTelefone) {
        super(mensagem, destinatario);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String formatarMensagem() {
        return null;
    }

    @Override
    public void enviarNotificacao() {

    }
}
