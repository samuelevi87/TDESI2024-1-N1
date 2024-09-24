package main.java.atividade04;

public class SMSNotificacao implements Notificavel{
    private String numeroTelefone;

    public SMSNotificacao(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviarNotificacao() {

    }
}
