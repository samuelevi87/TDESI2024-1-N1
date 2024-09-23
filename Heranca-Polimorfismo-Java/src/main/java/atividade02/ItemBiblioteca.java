package main.java.atividade02;

public abstract class ItemBiblioteca {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    /**
     *
     * @param titulo
     * @param disponivel
     * @param anoPublicacao
     * @param autor
     */

    public ItemBiblioteca(String titulo, boolean disponivel, int anoPublicacao, String autor) {
        this.titulo = titulo;
        this.disponivel = disponivel;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
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

    public boolean isDisponivel
            () {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        this.disponivel = false;
    }
    public void devolver(){
        this.disponivel = true;
    }

    public abstract double calcularMulta(int diasAtraso);

    @Override
    public String toString() {
        return  "Livro:\n" +
                "Titulo: " + titulo +
                "Autor: " + autor +
                "Ano de Publicacao: " + anoPublicacao +
                "Disponibilidade: " + disponivel;
    }
}
