import java.time.LocalDate;
import java.time.LocalDate;
public abstract class Notificacao implements Notificavel{
        private String mensagem;
        private String destinatario;
        private LocalDate dataEnvio;
    }
    public Notificacao(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        this.dataEnvio = dataEnvio.now();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinavel() {
        return destinatario;
    }

    public void setDestinavel(String destinavel) {
        this.destinatario = destinavel;
    }

    public LocalDate getDataEnviar() {
        return dataEnvio;
    }

    public void setDataEnviar(LocalDate dataEnviar) {
        this.dataEnvio = dataEnviar;
    }
    public String formatarMensagem() {
        return formatarMensagem();
    }

    @Override
    public String toString() {
        return "Notificacao{" +
                "mensagem='" + mensagem + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", dataEnvio=" + dataEnvio +
                '}';
    }
}

