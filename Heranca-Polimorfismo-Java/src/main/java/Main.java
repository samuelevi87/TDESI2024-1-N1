package main.java;

import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;
import main.java.atividade01.CorrecaoEmpresa;
import main.java.atividade01.CorrecaoGerente;
import main.java.atividade04.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
       CorrecaoAtividade01();
        atividade04();
    }

    private static void CorrecaoAtividade01() {
        // Código para testar a atividade 01
        CorrecaoEmpresa empresa = new CorrecaoEmpresa();

        empresa.adicionarFuncionario(new CorrecaoDesenvolvedor("Ana Silva", 1, 5000, "Java"));
        empresa.adicionarFuncionario(new CorrecaoDesenvolvedor("Carlos Santos", 2, 5500, "Python"));
        empresa.adicionarFuncionario(new CorrecaoGerente("Maria Oliveira", 3, 8000, 10000));
        empresa.adicionarFuncionario(new CorrecaoGerente("João Pereira", 4, 8500, 12000));
        empresa.adicionarFuncionario(new CorrecaoAnalistaQA("Pedro Costa", 5, 4500, 50));
        empresa.adicionarFuncionario(new CorrecaoAnalistaQA("Lúcia Ferreira", 6, 4800, 60));

        System.out.println("Lista de Funcionários:");
        empresa.listarFuncionarios();

        System.out.println("\nFolha de Pagamento Total: R$" +
                String.format("%.2f", empresa.calcularFolhaPagamentoTotal()));
    }



    public static void atividade04 () {

        GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();

        // Adicionando notificações
        gerenciador.adicionarNotificacao(new EmailNotificacao("Olá, você tem um novo e-mail!", "usuario@example.com", "Nova Mensagem"));
        gerenciador.adicionarNotificacao(new EmailNotificacao("Promoção!", "usuario@example.com", "Desconto Especial "));

        gerenciador.adicionarNotificacao(new SMSNotificacao(" Seu código de verificação é 123456.", "destino", "999999999"));
        gerenciador.adicionarNotificacao(new SMSNotificacao("Lembre-se da sua consulta amanhã!", "destino", "888888888 "));

        gerenciador.adicionarNotificacao(new PushNotificacao(" Você recebeu uma nova mensagem!", "usuario@example.com", "Dispositivo1"));
        gerenciador.adicionarNotificacao(new PushNotificacao("Atualização disponível!", "usuario@example.com", "Dispositivo2"));


        System.out.println("\n Lista de Notificacoes:");
        gerenciador.enviarNotificacoes();
        gerenciador.listarNotificacoes();
    }

}
