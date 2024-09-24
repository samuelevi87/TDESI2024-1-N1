package main.java.atividade04;

public abstract class EmailNotificacao  extends Notificacao{

  private String assunto;

    public EmailNotificacao(String mensagem, String destinatario, String assunto) {
        super(mensagem, destinatario);
        this.assunto = assunto;
    }

    @Override
    public void enviarNotificacao() {
        System.out.println(formatarMensagem()+
                "\nDestino: "+ getDestinatario()+
                "\n Data de envio: "+ getDataEnvio());
    }
    @Override
    public String formatarMensagem(){

        return "E-Mail: "+ assunto +" - "+ getMensagem();
    }
}
