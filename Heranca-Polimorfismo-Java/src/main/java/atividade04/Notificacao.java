package main.java.atividade04;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Notificacao implements Notificavel {
    private String message ;
    private String destinario;
    private LocalDateTime dataenvio;

    public Notificacao(String message, String destinario, LocalDate dataenvio) {
        this.message = message;
        this.destinario = destinario;
        this.dataenvio = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDestinario() {
        return destinario;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    public LocalDateTime getDataenvio() {
        return dataenvio;
    }

    /**
     * Formata a mensagem da notificacao
     * @return a mensagem formatada
     */
    public abstract String formatarMensagem();
    @Override
    public String toString() {
        return "Notificacao{" +
                "message='" + message + '\'' +
                ", destinario='" + destinario + '\'' +
                ", dataenvio=" + dataenvio +
                '}';
    }
}
