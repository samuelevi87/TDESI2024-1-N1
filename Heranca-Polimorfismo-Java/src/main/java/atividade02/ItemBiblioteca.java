package main.java.atividade02;

import java.time.LocalDate;

/**
 * Representa um item genérico da biblioteca
 * Esta classe serve para todos os tipos de itens
 */
public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Boolean disponivel;
    private LocalDate dataEmprestimo;

    /**
     * Constrói um novo item
     * @param titulo titulo do item
     * @param autor autor do item
     * @param anoPublicacao ano de publicação do item
     */
    public ItemBiblioteca(String titulo, String autor, Integer anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
        this.dataEmprestimo = null;
    }

    /**
     * Empresta item, definindo seu estado de disponível para falso e setando a data do empréstimo como a data atual
     * @return true caso o empréstimo for realizado e false caso contrário
     */
    public boolean emprestar(){
        if(disponivel){
            disponivel = false;
            dataEmprestimo = LocalDate.now();
            return true;
        }
        return false;
    }

    /**
     * Devolve item, definindo seu estado de dispponível para verdadeiro
     */
    public void devolver(){
        disponivel = true;
        dataEmprestimo = null;
    }

    /**
     * Calcula multa pelos dias de atraso
     * Este método deve ser implementado por todas as subclasses
     * @param diasAtraso dias de atraso do item
     * @return a multa total calculada
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

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * Retorna a representação em String do item
     * @return uma string contendo titulo, autor, ano de publicação e disponivel
     */
    @Override
    public String toString() {
        return "titulo: " + titulo + '\'' +
                ", autor: " + autor + '\'' +
                ", anoPublicacao: " + anoPublicacao +
                ", disponivel: " + disponivel;
    }
}
