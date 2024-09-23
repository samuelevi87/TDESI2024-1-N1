package main.java;

<<<<<<< HEAD
import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;
import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;
import main.java.atividade03.Caminhao;
import main.java.atividade03.Carro;
import main.java.atividade03.Frota;
import main.java.atividade03.Moto;

public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();
        frota.adicionarVeiculo(new Caminhao("abcd123", "teste 1", 2011, 53000.0, 20.0));
        frota.adicionarVeiculo(new Caminhao("efgh456", "teste 2", 2001, 42756.5, 15.0));
        frota.adicionarVeiculo(new Carro("ijkl789", "teste 3", 2004, 12000.7, 4));
        frota.adicionarVeiculo(new Carro("mnop123", "teste 4", 2014, 23987.5, 4));
        frota.adicionarVeiculo(new Moto("qrst456", "teste 5", 2016, 8763.5, 200));
        frota.adicionarVeiculo(new Moto("uvwx456", "teste 6", 2013, 4827.5, 250));

        System.out.println("***** LISTA DE VEÍCULOS *****");
        frota.listarVeiculos();
        System.out.println("Custo total de viagem: R$" + frota.calcularCustoDeViagemTotal(100.0));

        frota.removerVeiculo("efgh456");
        frota.removerVeiculo("mnop123");
        frota.removerVeiculo("uvwx456");

        System.out.println("***** LISTA DE VEÍCULOS *****");
        frota.listarVeiculos();
        System.out.println("Custo total de viagem: R$" + frota.calcularCustoDeViagemTotal(100.0));
=======
import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;
import main.java.atividade01.CorrecaoEmpresa;
import main.java.atividade01.CorrecaoGerente;

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
>>>>>>> 19fe72654a91fd792ff9c04e62fca9d2b855dec3
    }
}
