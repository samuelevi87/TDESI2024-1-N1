package Exercicio04;

import java.security.PrivateKey;

public class Livro {
    private String livro;
    private String autor;
    private int anoPublicado;
    public Livro(String livro, String autor, int anoPublicado){
        this.livro = livro;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }
}
