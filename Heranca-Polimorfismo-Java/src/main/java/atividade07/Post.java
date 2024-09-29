package main.java.atividade07;

import java.time.LocalDateTime;

/***
 * Classe base abstrata que representa um post.
 */
public abstract class Post {
    /***
     * @param ID do post
     * @param Autor do post
     * @param Conteúdo do post
     * @param ata e hora de publicação
     * @param Número de likes
     */
    private int id;
    private String autor;
    private String conteudo;
    private LocalDateTime dataPublicacao;
    private int likes;

    /***
     * Construtor que inicializa os atributos do post.
     *
     * @param autor    O autor do post
     * @param conteudo O conteúdo do post
     */
    public Post(String autor, String conteudo) {
        this.id = ++id;
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataPublicacao = LocalDateTime.now();
        this.likes = 0;
    }

    /***
     * Getters para os atributos
     */
    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    public int getLikes() {
        return likes;
    }

    /***
     * Adiciona um like ao post.
     */
    public void adicionarLike() {
        likes++;
    }

    /***
     * Método abstrato que deve ser implementado pelas subclasses.
     *
     * @return A representação em String do post
     */
    public abstract String exibir();
}