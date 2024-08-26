package Exercicio04;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;

    public Livro(String titulo,String autor, int anoPublicado){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        if (anoPublicado >0){
            this.anoPublicado = anoPublicado;
        }
    }
}
