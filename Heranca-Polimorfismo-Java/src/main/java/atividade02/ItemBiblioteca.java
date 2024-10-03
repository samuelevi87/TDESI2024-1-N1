package main.java.atividade02;

public abstract class  ItemBiblioteca {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;


    public ItemBiblioteca(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean emprestar(){
        disponivel = false;
        return true;
    }

    public boolean devolver(){
        disponivel = true;
        return true;
    }

    public abstract double calcularMulta(int diasAtraso);


}
