package main.java.atividade02;

import java.time.LocalDate;

/**
 * Representa um item genérico na biblioteca.
 * Esta classe serve como base para todos os tipos de itens da biblioteca.
 */
public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Boolean disponivel;

    /**
     * Constrói um novo item.
     * @param titulo O título do item.
     * @param autor O autor do item.
     * @param anoPublicacao O ano de publicação do item.
     * @param disponivel A disponibilidade do item.
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

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * Altera o status de disponibilidade do item para falso.
     */
    public void emprestar() {
        this.disponivel = false;
    }

    /**
     * Altera o status de disponibilidade do item para verdadeiro.
     */
    public void devolver() {
        this.disponivel = true;
    }

    /**
     * Calcula a multa por atraso com base no tanto de dias que está atrasado.
     * @param diasAtraso O número de dias de atraso.
     * @return O valor total da multa.
     */
    public abstract Double calcularMulta(Integer diasAtraso);

    /**
     * Retorna a representação em string do item.
     * @return Uma string contendo o título, o autor, o ano de publicação e a disponibilidade do item.
     */
    @Override
    public String toString() {
        return "\nTítulo: \"" + titulo + '\"' +
                "\nAutor: \"" + autor + '\"' +
                "\nAno de publicação: " + anoPublicacao +
                "\nDisponível: " + (disponivel ? "Sim" : "Não");
    }
}
