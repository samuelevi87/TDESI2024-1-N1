package main.java;

import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;
import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;
import main.java.atividade03.*;

public class Main {
    public static void main(String[] args) {


        Frota frota1 = new Frota();

        Caminhao caminhao1 = new Caminhao("MKT-2342", "ACTROSS", 2019,300000.00,44);
        Caminhao caminhao2 = new Caminhao("MKH-2454", "CONSTALLATION", 2009,900000.00,35);
        Carro carro1 = new Carro("KMT-3294", "CELTA", 2012, 132000.00,5);
        Carro carro2 = new Carro("KSR-3564", "GOL", 2002, 250000.00,3);
        Moto moto1= Moto()


        Biblioteca biblioteca1 = new Biblioteca();

        AudioLivro audioLivro1 = new AudioLivro("Diário de um banana", "Jeff Kinny", 2007, true, 200);
        AudioLivro audioLivro2 = new AudioLivro("Seja FODA", "Caio Carneiro", 2017, true, 220);
        Ebook ebook1 = new Ebook("Código Limpo", "Robert Cecil Martin", 2012, true, 200.00);
        Ebook ebook2 = new Ebook("A Linguagem de Programação Go", "Brian Kernighan", 2015, true, 20.00);
        LivroFisico livroFisico1 = new LivroFisico("Maluquinho pelo mundo", "Ziraldo", 2012, true,250);
        LivroFisico livroFisico2 = new LivroFisico("Turma da Mônica", "Mauricio de Sousa", 1959, true, 300);

        biblioteca1.adicionarItem(audioLivro1);
        biblioteca1.adicionarItem(audioLivro2);
        biblioteca1.adicionarItem(ebook1);
        biblioteca1.adicionarItem(ebook2);
        biblioteca1.adicionarItem(livroFisico1);
        biblioteca1.adicionarItem(livroFisico2);

        System.out.println("\n" + "EMPRÉSTIMO DE LIVRO");
        biblioteca1.listaItens();
        biblioteca1.emprestarItem(audioLivro1);
        biblioteca1.emprestarItem(livroFisico1);

        System.out.println("\n" + "DEVOLUÇÃO DE LIVRO");
        biblioteca1.listaItens();
        biblioteca1.devolverItem(audioLivro1);

        System.out.println("\n" + "CALCULO DE MULTA");
        biblioteca1.listaItens();
        System.out.println("\n" + "Multa de devolução livro físico: " + biblioteca1.calcularMultaAtraso(livroFisico1, 5));
        System.out.println("Multa de devolução AudioLivro: " + biblioteca1.calcularMultaAtraso(audioLivro1, 15));
        System.out.println("Multa de devolução Ebook: " + biblioteca1.calcularMultaAtraso(ebook1, 10));

    }
}
