package main.java.atividade04;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Notificacao implements Notificavel{
    private String menssagem;
    private String destinatario;
    private LocalDateTime dataEnvio;

    public Notificacao(String menssagem, String destinatario) {
        this.menssagem = menssagem;
        this.destinatario = destinatario;
        this.dataEnvio = LocalDateTime.now();
    }

    public String getMenssagem() {
        return menssagem;
    }

    public void setMenssagem(String menssagem) {
        this.menssagem = menssagem;
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
     * Formata mengsam da notificação
     * @return  a mensagem formatada
     */
    public abstract String formatarMensagem();

    @Override
    public String toString() {
        return "Notificacao{" +
                "menssagem='" + menssagem + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", dataEnvio=" + dataEnvio +
                '}';
    }


}
