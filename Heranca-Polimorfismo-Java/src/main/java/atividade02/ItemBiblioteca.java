package main.java.atividade02;
import java.time.LocalDate;

/**
 * Representa um item genérico da biblioteca digital.
 * Esta classe serve como base para todos os tipos de itens da biblioteca.
 */
public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;
    private LocalDate dataEmprestimo;

    /**
     * Constrói um novo ItemBiblioteca.
     *
     * @param titulo O título do item.
     * @param autor O autor do item.
     * @param anoPublicacao O ano de publicação do item.
     */
    public ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
        this.dataEmprestimo = null;
    }

    /**
     * Empresta o item da biblioteca.
     *
     * @return true se o empréstimo foi bem-sucedido, false caso contrário.
     */
    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            dataEmprestimo = LocalDate.now();
            return true;
        }
        return false;
    }

    /**
     * Devolve o item à biblioteca.
     */
    public void devolver() {
        disponivel = true;
        dataEmprestimo = null;
    }

    /**
     * Calcula a multa para o item, caso esteja atrasado.
     *
     * @param diasAtraso O número de dias de atraso.
     * @return O valor da multa calculada.
     */
    public abstract double calcularMulta(int diasAtraso);

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

    public LocalDate getDataEmprestimo() {

        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {

        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString() {
        return "ItemBiblioteca{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", disponivel=" + disponivel +
                '}';
    }
}