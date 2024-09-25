import main.java.atividade04.Notificacao;

import java.util.ArrayList;

public abstract class GerenciadorNotificacoes extends Notificacao {
    private ArrayList<Notificacao> notificacoesPendentes;
    private ArrayList<Notificacao> notificacoesEnviadas;

    public GerenciadorNotificacoes(ArrayList<Notificacao> notificacoesPendentes, ArrayList<Notificacao> notificacoesEnviadas) {
        this.notificacoesPendentes = notificacoesPendentes;
        this.notificacoesEnviadas = notificacoesEnviadas;
    }
}
