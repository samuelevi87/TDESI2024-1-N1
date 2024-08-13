package Exercicio04;

public class Livro {
    // Exercício 4:
    // 1. Criar uma instância da classe Livro.
    // 2. Exibir o título, autor e ano de publicação.
    // 3. Alterar o ano de publicação e exibir novamente.
    String titulo;
    String autor;
    int anoPub;

    public Livro(String titulo, String autor, int anoPub) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }
}
