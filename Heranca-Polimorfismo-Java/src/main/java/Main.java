package main.java;

import main.java.atividade01.*;
import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblio1 = new Biblioteca();

        biblio1.adicionarItens(new AudioLivro("Sapiens ","George",
                1949,true,3));
        biblio1.adicionarItens(new AudioLivro("Python para Todos", "Autor B",
                2019, true,6) );
        biblio1.adicionarItens(new LivroFisico("Java para Iniciantes", "Autor A",
                2020, true,7));
        biblio1.adicionarItens(new LivroFisico("Desenvolvimento Web", "Autor D",
                2022, true,10));
        biblio1.adicionarItens(new Ebook("Java: Como Programar", "Deitel & Deitel",
                2020, false,300.0));
        biblio1.adicionarItens(new Ebook("Clean Code", "Robert C. Martin",
                2019, false,434.0));

        biblio1.devolver("Python para Todos");
        biblio1.devolver("Sapiens ");

        biblio1.emprestar("Clean code");
        biblio1.emprestar("web");


        System.out.println("Multa de : R$ "+biblio1.calcularMulta("Clean Code",12)+ " por atraso.");
        System.out.println("Multa de : R$ "+ biblio1.calcularMulta("Java: Como Programar",22)+ " por atraso.");
    }
}