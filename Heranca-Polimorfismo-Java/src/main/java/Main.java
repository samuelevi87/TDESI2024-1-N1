package main.java;

import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarItem(new AudioLivro("Alice no País das Maravilhas", "Lewis Carroll", 2024, true, 205));
        biblioteca.adicionarItem(new AudioLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 2020, true, 137));
        biblioteca.adicionarItem(new Ebook("O Sítio do Picapau Amarelo", "Monteiro Lobato", 2018, true, 15.00));
        biblioteca.adicionarItem(new Ebook("Tratado da Pintura", "Leonardo Da Vinci", 2023, true, 9.00));
        biblioteca.adicionarItem(new LivroFisico("Os Cadernos de Leonardo Da Vinci", "Leonardo Da Vinci", 2010, true, 347));
        biblioteca.adicionarItem(new LivroFisico("Fédon", "Sócrates", 2004, true, 409));

        biblioteca.getItemBiblioteca().get(1).emprestar();
        biblioteca.getItemBiblioteca().get(3).emprestar();
        biblioteca.getItemBiblioteca().get(5).emprestar();

        System.out.println("******* LISTA DE ITENS *******");
        biblioteca.listarItens();

        biblioteca.getItemBiblioteca().get(1).devolver();
        biblioteca.getItemBiblioteca().get(3).devolver();
        biblioteca.getItemBiblioteca().get(5).devolver();

        System.out.println("\n******* LISTA DE ITENS *******");
        biblioteca.listarItens();
        System.out.println();
        System.out.println("Multa do audiolivro: R$" + biblioteca.getItemBiblioteca().get(1).calcularMulta(10));
        System.out.println("Multa do ebook: R$" + biblioteca.getItemBiblioteca().get(3).calcularMulta(10));
        System.out.println("Multa do livro físico: R$" + biblioteca.getItemBiblioteca().get(5).calcularMulta(10));
    }
}