package Exercicio04;

import javax.management.StringValueExp;

public class Livro {

    private String livro;
    private String autor;
    private int anoPublicacao;

    public Livro() {

    }

    public Livro(String livro, String autor, int anoPublicacao) {
        this.livro = livro;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getLivro() {
        return livro;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
