package main.java.atividade04;

import java.time.LocalDate;

public class SMSNotificacao extends Notificacao {
    private String numeroTelefone ;

    public SMSNotificacao(String message, String destinario, LocalDate dataenvio, String numeroTelefone) {
        super(message, destinario, dataenvio);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String formatarMensagem() {
        return "SMS para [numeroTelefone]: ";
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando SMS para +55 11 91234-5678: Lembrete: Sua consulta é amanhã às 10h.");
    }
}

