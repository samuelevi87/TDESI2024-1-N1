package main.java.atividade02;

/**
 * Representa um item da biblioteca.
 * Esta classe serve como base para todos os tipos de itens, como livros físicos, ebooks
 * e audiolivros, e contém informações comuns como título, autor, ano de publicação
 * e disponibilidade.
 */
public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Boolean disponivel;

    /**
     * Cria um novo item de biblioteca com as informações fornecidas.
     *
     * @param titulo o título do item a ser adicionado.
     * @param autor o autor do item a ser adicionado.
     * @param anoPublicacao o ano de publicação do item.
     * @param disponivel indica se o item está disponível para empréstimo (true) ou não (false).
     */

    public ItemBiblioteca(String titulo, String autor, Integer anoPublicacao, Boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * Método que empresta o livro, que muda `disponivel` para false, tornando-o indisponível.
     */
    public void emprestar() {
        disponivel = false;
    }

    /**
     * Método que devolve o livro, que muda `disponivel` para true, tornando-o disponível.
     */
    public void devolver() {
        disponivel = true;
    }

    /**
     * Método abstrato para calcular a multa por atraso.
     * Cada tipo de livro pode ter uma política diferente para a multa.
     * @param diasAtraso O número de dias de atraso na devolução.
     * @return O valor da multa a ser cobrado.
     */
    public abstract double calcularMulta(int diasAtraso);

    @Override
    public String toString() {
        return "\nItem da Biblioteca:\n" +
                "Titulo: " + titulo +
                ", Autor: " + autor +
                ", Ano de Publicação: " + anoPublicacao +
                ", Disponivel: " + disponivel;
    }
}