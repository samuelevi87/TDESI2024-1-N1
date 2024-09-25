package main.java.atividade04;

public class EmailNotificacao extends Notificacao {
    private String assunto;

    public EmailNotificacao(String mensagem, String destinatorio, String assunto) {
        super(mensagem, destinatorio);
        this.assunto = assunto;
    }
    public String getAssunto() {
        return assunto;
    }

    @Override
    public String formatarMensagem() {
        return "Assunto: " + assunto + "\n" +
                "Para: " + getDestinatario() + "\n" +
                "Mensagem: " + getMensagem() + "\n" +
                "Data de Envio: " + getDataEnvio();
    }
    public void enviarNotificacao() {
        /**
         *  Enviar a notificação por email
         */
        System.out.println("Enviando email:\n" + formatarMensagem());
    }

    }

