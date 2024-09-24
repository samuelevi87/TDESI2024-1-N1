package main.java.atividade04;

import java.time.LocalDate;

public class PushNotificacao extends Notificacao{
    private String dispositivo;

    public PushNotificacao(String message, String destinario, LocalDate dataenvio, String dispositivo) {
        super(message, destinario, dataenvio);
        this.dispositivo = dispositivo;
    }

    @Override
    public String formatarMensagem() {
        return   "Push para [dispositivo]: ";
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando notificação push: Novo Alerta! - Você recebeu um novo comentário em sua postagem.");

    }
}
