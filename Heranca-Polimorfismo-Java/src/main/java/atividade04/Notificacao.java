package main.java.atividade04;

import java.time.LocalDateTime;

/**
 * Classe abstrata que representa uma notificação.
 * Esta classe implementa a interface Notificavel e serve como base
 * para diferentes tipos de notificações (por exemplo, e-mail, SMS, push).
 */
public abstract class Notificacao implements Notificavel {
    private String mensagem;
    private String destinatario;
    private LocalDateTime dataEnvio;

    /**
     * Construtor para inicializar uma notificação.
     * @param mensagem A mensagem a ser enviada.
     * @param destinatario O destinatário da notificação.
     */
    public Notificacao(String mensagem, String destinatario) {
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

    /**
     * Obtém a data e hora em que a notificação foi enviada.
     * @return A data e hora de envio da notificação.
     */
    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses
     * para formatar a mensagem da notificação de acordo com o tipo específico.
     * @return A mensagem formatada.
     */
    public abstract String formatarMensagem();

    /**
     * Retorna uma representação em string da notificação.
     * @return Uma string que contém a mensagem, o destinatário e a data de envio.
     */
    @Override
    public String toString() {
        return "Notificacao: " +
                "Mensagem: " + mensagem + '\'' +
                ", Destinatário: " + destinatario + '\'' +
                ", Data de Envio: " + dataEnvio;
    }
}