package main.java.atividade04;
import java.util.ArrayList;
import java.util.List;
public class GerenciadorNotificacoes {
    private List<Notificação> notificacoes;

    public GerenciadorNotificacoes() {
        this.notificacoes = new ArrayList<>();
    }

    public void adicionarNotificacao(Notificação notificacao) {
        notificacoes.add(notificacao);
    }

    public void enviarTodasNotificacoes() {
        for (Notificação notificacao : notificacoes) {
            notificacao.enviarNotificacão();
        }
        notificacoes.clear(); // Opcional: limpar a lista após envio
    }

    public void listarNotificacoesEnviadas() {
        for (Notificação notificacao : notificacoes) {
            System.out.println("Notificação enviada: " + notificacao.formatarMensagem() + " para " + notificacao.getDestinatario());
        }
    }
}
