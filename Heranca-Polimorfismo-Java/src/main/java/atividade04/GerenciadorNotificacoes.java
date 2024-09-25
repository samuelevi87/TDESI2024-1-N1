package main.java.atividade04;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {
    private List<Notificacao> notificacoesPendentes;
    private List<Notificacao> notificacoesEnviadas;


    public GerenciadorNotificacoes() {
        this.notificacoesPendentes = new ArrayList<>();
        this.notificacoesEnviadas = new ArrayList<>();
    }
    public void adicionarNotificacao(Notificacao notificacao){
        notificacoesPendentes.add(notificacao);
    }
    public void enviarNotificacoesPendentes(){
        notificacoesPendentes.forEach(notificacao -> {
            notificacao.enviarNotificacao();
            notificacoesEnviadas.add(notificacao);
        });
        notificacoesPendentes.clear();
    }
    public void listarNotificacoesEnviadas(){
        notificacoesEnviadas.forEach(System.out::println);
    }
}
