package main.java.atividade07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe abstrata que representa um Post
 */
public abstract class Post {
    private int id;
    private static int contadorId = 0;
    private String autor;
    private String conteudo;
    private LocalDateTime dataPublicacao;
    private int likes;

    /**
     * Constrói um Post
     * @param autor autor do post
     * @param conteudo conteúdo do post
     */
    public Post(String autor, String conteudo) {
        this.id = contadorId++;
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataPublicacao = LocalDateTime.now();
        this.likes = 0;
    }

    /**
     * Adiciona um like ao post
     */
    public void adicionarLike(){
        this.likes++;
    }

    /**
     * Método abstrato para exibir o post
     * @return uma string com o post dependendo da subclasse que implementar
     */
    public abstract String exibir();

    /**
     * Formata a data de publicação
     * @return string da data de publicação formatada
     */
    public String getDataFormatada(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = this.dataPublicacao.format(formatter);
        return dataFormatada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Post.contadorId = contadorId;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDateTime dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
