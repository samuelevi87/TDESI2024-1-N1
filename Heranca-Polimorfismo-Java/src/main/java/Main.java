package main.java;

import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;
import main.java.atividade01.CorrecaoEmpresa;
import main.java.atividade01.CorrecaoGerente;
import main.java.atividade04.EmailNotificacao;
import main.java.atividade04.GerenciadorNotificacoes;
import main.java.atividade04.PushNotificacao;
import main.java.atividade04.SMSNotificacao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GerenciadorNotificacoes Gerenciador = new GerenciadorNotificacoes();

        Gerenciador.adicionarNotificacao(new EmailNotificacao("ola bom dia ","Claudyson", LocalDate.now(),"sobre pagamento do cartao"));
        Gerenciador.adicionarNotificacao(new EmailNotificacao("gostariamos de apresentar a nossa marca","Texneo",LocalDate.now(),"Marca esportiva"));

        Gerenciador.adicionarNotificacao(new SMSNotificacao("boa tarde ","Luiza",LocalDate.now(),"47997853831"));
        Gerenciador.adicionarNotificacao(new PushNotificacao("Novo alerta","LUCAS",LocalDate.now(),"Atualizacao de clima"));

        Gerenciador.enviarNotificacao();
        Gerenciador.listarNotificacao();
    }

}
