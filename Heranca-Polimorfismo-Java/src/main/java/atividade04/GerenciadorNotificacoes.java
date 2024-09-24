package main.java.atividade04;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {
    private List<Notificacao> notificacoes;

    public GerenciadorNotificacoes() {
        notificacoes = new ArrayList<>();
    }
    public void adicionarNotificacao(Notificacao notificacao){
        notificacoes.add(notificacao);
    }
    public void enviarNotificacoesPendentes(){
        notificacoes.stream().filter(notificacao -> notificacao.getDataEnvio().isBefore(LocalDateTime.now()) ||
                        notificacao.getDataEnvio().isEqual(LocalDateTime.now()))
                .forEach(Notificacao::enviarNotificacao);
    }
    public void listarNotificacoesEnviadas(){
        notificacoes.stream().filter((notificacao -> notificacao.getDataEnvio().isBefore(LocalDateTime.now())))
                .forEach(System.out::println);
    }
}
