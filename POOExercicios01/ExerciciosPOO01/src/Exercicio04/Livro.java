package Exercicio04;

public class Livro {
    private String titulo;
    private String autor;
    private int AnoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        AnoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return AnoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        AnoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return ""+ AnoPublicacao;
    }
}
