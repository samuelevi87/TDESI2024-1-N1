package main.java.atividade02;

public abstract class ItemBiblioteca {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    /**
     * Constró os atributos do item
     * @param titulo titulo do item
     * @param disponivel disponibilidade do item
     * @param anoPublicacao ano de publicação do item
     * @param autor autor do item
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

    /**
     * Metodo para emprestar um item
     */

    public void emprestar(){
        this.disponivel = false;
    }

    /**
     * Metodo para devolver um item
     */

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
