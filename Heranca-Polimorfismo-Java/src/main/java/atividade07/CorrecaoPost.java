package main.java.atividade07;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Classe abstrata base para representar um post na rede social.
 */
public abstract class CorrecaoPost {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();

    private final int id;
    private final String autor;
    private final String conteudo;
    private final LocalDateTime dataPublicacao;
    private int likes;

    /**
     * Construtor para a classe Post.
     *
     * @param autor    O autor do post.
     * @param conteudo O conteúdo do post.
     */
    public CorrecaoPost(String autor, String conteudo) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataPublicacao = LocalDateTime.now();
        this.likes = 0;
    }

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


    /**
     * Adiciona um like ao post.
     */
    public void adicionarLike() {
        this.likes++;
    }

    /**
     * Método abstrato para exibir o conteúdo do post.
     *
     * @return Uma String representando o conteúdo formatado do post.
     */
    public abstract String exibir();

    @Override
    public String toString() {
        return String.format("Post ID: %d, Autor: '%s', Conteúdo: '%s', Data da Publicação: %s, Likes: %d}",
                id, autor, conteudo, dataPublicacao, likes);
    }
}