package main.java;

import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;

public class Main {
    public static void main(String[] args) {
        Biblioteca bibliote = new Biblioteca();

        LivroFisico livroFisico1 = new LivroFisico("Piratas", "Caribe", 2000, true, 365);
        LivroFisico livroFisico2 = new LivroFisico("Eletricidade", "Tomas", 1783, true, 2000);
        Ebook ebook1 = new Ebook("Sapiens", "WOW", 2010, true, 60);
        Ebook ebook2 = new Ebook("Ondas", "Pedro", 555, true, 60);
        AudioLivro audioLivro1 = new AudioLivro("aaa", "autorFoda", 2001, true, 180);
        AudioLivro audioLivro2 = new AudioLivro("bbb", "autorFodinha", 1999, true, 530);

        livroFisico1.emprestar();
        livroFisico1.devolver();
        livroFisico1.devolver();
        ebook2.emprestar();

        livroFisico1.calcularMulta(8);
    }
}
