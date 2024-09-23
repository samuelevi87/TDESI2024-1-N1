package main.java.atividade02;

public abstract class ItemBiblioteca {

    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, String autor, Integer anoPublicacao, boolean disponivel) {
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

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }

    public abstract double calcularMulta(int diasAtraso);

    @Override
    public String toString() {
        return "\nItem da Biblioteca:\n" +
                "Titulo: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Ano de Publicação: " + anoPublicacao + "\n" +
                "Disponivel: " + disponivel;
    }

}
