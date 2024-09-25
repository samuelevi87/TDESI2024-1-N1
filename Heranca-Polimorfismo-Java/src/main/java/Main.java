package main.java;

import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;
import main.java.atividade01.CorrecaoEmpresa;
import main.java.atividade01.CorrecaoGerente;
import main.java.atividade04.EmailNotificacao;
import main.java.atividade04.PushNotificacao;
import main.java.atividade04.SMSNotificacao;

public class Main {
    public static void main(String[] args) {
        CorrecaoAtividade01();
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
}
public class Main {
    public static void main(String[] args) {
        // Criar uma instância do Gerenciador de Notificações
        GerenciadorNotificacoes gerenciador;
        gerenciador = new GerenciadorNotificacoes();

        // Adicionando notificações do tip EmailNotificacao
        gerenciador.notifyAll(new EmailNotificacao("Seu relatório está pronto.", "usuario1@example.com", "Relatório Mensal"));
        gerenciador.notifyAll(new EmailNotificacao("Lembrete: Reunião às 10h.", "usuario2@example.com", "Reunião Importante"));

        // Adicionando notificações do tipo SMSNotificacao
        gerenciador.notifyAll(new SMSNotificacao("Seu código de verificação é 123456.", "usuario1@example.com", "999999999"));
        gerenciador.notifyAll(new SMSNotificacao("Seu pedido foi enviado!", "usuario3@example.com", "888888888"));

        // Adicionando notificações do tipo PushNotificacao
        gerenciador.notifyAll(new PushNotificacao("Você tem uma nova mensagem.", "usuario2@example.com", "dispositivo1"));
        gerenciador.notifyAll(new PushNotificacao("Atualização disponível.", "usuario1@example.com", "dispositivo2"));

        // Enviar todas as notificações pendentes
        gerenciador.notifyAll();

        // Listar todas as notificações enviadas
        gerenciador.notifyAll();
    }
}

