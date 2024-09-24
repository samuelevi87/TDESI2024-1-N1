package main.java.atividade04;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Notificação
    implements Notificavel{

    private String mensagem;
    private String destinatario;
    private LocalDateTime dataEnvio;

    public Notificação(String
       mensagem, String destinatario, LocalDate dataEnvio) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        this.dataEnvio = LocalDateTime.now();
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    /**
     * Fromata a mensagem da Notificação
     * @return a mensagem formatada
     */
    public abstract String FromaTarMensagem();

    @Override
    public String toString() {
        return "Notificação{" +
                "mensagem='" + mensagem + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", dataEnvio=" + dataEnvio +
                '}';
    }
}
