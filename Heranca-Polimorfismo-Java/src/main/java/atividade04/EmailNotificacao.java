package main.java.atividade04;

import java.time.LocalDate;

public class EmailNotificacao extends Notificacao{
    private String assunto ;

    public EmailNotificacao(String message, String destinario, LocalDate dataenvio, String assunto) {
        super(message, destinario, dataenvio);
        this.assunto = assunto;
    }

    @Override
    public String formatarMensagem() {
        return  " E-mail: [assunto]  ";
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando email para joão@email.com: Olá, João! Você tem uma nova mensagem.");

    }
}
