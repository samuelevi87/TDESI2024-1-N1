package main.java.atividade04;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorNotificacoes {
    private List<Notificação> todasNotificacoes;

    public GerenciadorNotificacoes() {
        this.todasNotificacoes = new ArrayList<>();
    }

    public void adicionarNotificacao(Notificação notificacao) {
        todasNotificacoes.add(notificacao);
    }

    public void enviarTodasNotificacoes() {
        todasNotificacoes.forEach(Notificação::enviarNotificacão);
        }
    public void enviarTodasNotificacoesSimples() {
        for (Notificação notificacao : todasNotificacoes) {
            notificacao.enviarNotificacão();
        }
    }
    public List<String> listarNotificacoesEnviadas() {
        return todasNotificacoes.stream()
                .map(Notificação::toString)
                .collect(Collectors.toList());
    }

    public List<String> listarNotificacoesEnviadasSimples() {
        List<String> listaDeNotificacoesEnviadas = new ArrayList<>();
        for (Notificação notificacao : todasNotificacoes) {
            listaDeNotificacoesEnviadas.add(notificacao.toString());
        }
        return listaDeNotificacoesEnviadas;
    }

    public class EmailNotificacao {
        public EmailNotificacao(String s, String mail, String promoção) {
        }
    }
}
