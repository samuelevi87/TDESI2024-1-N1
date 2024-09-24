package main.java.atividade04;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Notificacao implements Notificavel{

    private String mensagem;
    private String destinatario;
    private LocalDateTime dataEnvio;

    public Notificacao(String mensagem, String destinatario, LocalDate dataEnvio) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        this.dataEnvio = LocalDateTime.now();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    /**
     * Formata a mensagem da notificação
     * @return A mensagem formatada
     */
    public abstract String formatarMensagem();

    @Override
    public String toString() {
        return  "Notificacao" +
                "mensagem: " + mensagem + '\'' +
                "destinatario: " + destinatario + '\'' +
                "dataEnvio: " + dataEnvio;
    }
}