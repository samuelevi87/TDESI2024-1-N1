package main.java;

import main.java.atividade04.*;
import main.java.atividade05.CartaoCredito;
import main.java.atividade05.ProcessadorPagamento;
import main.java.atividade05.TransferenciaBancaria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CorrecaoAtividade01();
    }

    private static void CorrecaoAtividade01() {
     /*   // Código para testar a atividade 01
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

      */
        /*GerenciadorNotificacoes notificacoes = new GerenciadorNotificacoes();

        notificacoes.adicionarNotificacao(new EmailNotificacao("Estou com Saudade","Matheus","Saudades"));
        notificacoes.adicionarNotificacao(new EmailNotificacao("Atividade no anexo a baixo","Samuel","Atividade 04"));
        notificacoes.adicionarNotificacao(new SMSNotificacao("Tranca a porta","Matheus", "47988900600"));
        notificacoes.adicionarNotificacao(new SMSNotificacao("Me ligue","Juan", "47988998652"));
        notificacoes.adicionarNotificacao(new PushNotificacao("Sua Compra está te esperando","Robson","Motorola G30"));
        notificacoes.adicionarNotificacao(new PushNotificacao("bateria Fraca","Roberto","Iphone 15"));
        notificacoes.enviarNotificacao();

        notificacoes.ListarNotificacoes();

         */


/*
     ProcessadorPagamento pagamento = new ProcessadorPagamento();

     pagamento.FormasPagamento(new CartaoCredito("Matheus",5.0,"2585 25841 6985","Visa"));

     pagamento.FormasPagamento(new TransferenciaBancaria("Matheus",10.0,"Viacredi","1924","12345678-9"));

     pagamento.ProcessarPagamentos(200.0);
     pagamento.ListarTiposPagamentos();


 */
        String teste = JOptionPane.showInputDialog("Olá");
        System.out.println(teste);




    }
}
