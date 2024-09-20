package main.java;

import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;
import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivros(new AudioLivro("teste 1", "eu", 2024, true, 205));
        biblioteca.adicionarLivros(new AudioLivro("teste 2", "eu mesmo", 2020, true, 137));
        biblioteca.adicionarLivros(new Ebook("teste 3", "Monteiro Lobato", 2018, true, 15.00));
        biblioteca.adicionarLivros(new Ebook("teste 4", "Leonardo DaVinci", 2023, true, 9.00));
        biblioteca.adicionarLivros(new LivroFisico("teste 5", "Leonardo DaVinci", 2010, true, 347));
        biblioteca.adicionarLivros(new LivroFisico("teste 6", "Sócrates", 2004, true, 409));

        biblioteca.getItensDaBiblioteca().get(1).emprestar();
        biblioteca.getItensDaBiblioteca().get(3).emprestar();
        biblioteca.getItensDaBiblioteca().get(5).emprestar();

        System.out.println("***** LISTA DE ITENS *****");
        biblioteca.listarItens();

        biblioteca.getItensDaBiblioteca().get(1).devolver();
        biblioteca.getItensDaBiblioteca().get(3).devolver();
        biblioteca.getItensDaBiblioteca().get(5).devolver();

        System.out.println("***** LISTA DE ITENS *****");
        biblioteca.listarItens();

        System.out.println();
        System.out.println("Multa do audiolivro: R$" + biblioteca.getItensDaBiblioteca().get(1).calcularMulta(10));
        System.out.println("Multa do ebook: R$" + biblioteca.getItensDaBiblioteca().get(3).calcularMulta(10));
        System.out.println("Multa do livro físico: R$" + biblioteca.getItensDaBiblioteca().get(5).calcularMulta(10));
    }
}
