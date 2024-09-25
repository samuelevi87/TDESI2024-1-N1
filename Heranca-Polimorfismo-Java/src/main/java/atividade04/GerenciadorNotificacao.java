package main.java.atividade04;

import java.util.ArrayList;

public class GerenciadorNotificacao {
    private ArrayList <Notificacao> NotificacoesPedentes;
    private ArrayList <Notificacao> NotificacoesEnviadas;

    public GerenciadorNotificacao(ArrayList<Notificacao> notificacoesPedentes, ArrayList<Notificacao> notificacoesEnviadas) {
        NotificacoesPedentes = notificacoesPedentes;
        NotificacoesEnviadas = notificacoesEnviadas;
    }
    
}
