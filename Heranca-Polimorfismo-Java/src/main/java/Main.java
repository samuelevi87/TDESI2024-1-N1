package main.java;

import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;
import main.java.atividade01.CorrecaoEmpresa;
import main.java.atividade01.CorrecaoGerente;
import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;

public class Main {
    public static void main(String[] args) {
        Atividade02();
    }

    private static void CorrecaoAtividade01() {
         //Código para testar a atividade 01
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
    private static void Atividade02(){
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new LivroFisico("pequeno prícipe", "joão alfredo", 1997, true, 150));
        biblioteca.adicionarLivro(new LivroFisico("era uma vez", "datena", 1850, false, 50));
        biblioteca.adicionarLivro(new AudioLivro("casos criminais", "nora", 2008, true, 79.6));
        biblioteca.adicionarLivro(new Ebook("livro4", "autor4", 1985,true, 45.5));

        biblioteca.listarItensDisponiveis();

        System.out.println(biblioteca.emprestarLivro("Livro2"));
        System.out.println(biblioteca.emprestarLivro("Livro2"));
        System.out.println(biblioteca.devolverItem("Livro2"));
    }
}
