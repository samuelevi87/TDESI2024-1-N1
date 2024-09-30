package main.java.atividade07;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Classe abstrata que representa um Post em uma plataforma de mídia social.
 */
public abstract class Post {
    private static final AtomicInteger idGenerator = new AtomicInteger(0); // Gerador de IDs único para todos os posts

    private int id;

    private String autor;

    private String conteudo;

    private LocalDateTime dataPublicacao;

    private int likes;

    /**
     * Construtor da classe Post que inicializa o autor e o conteúdo do post.
     */
    public Post( String autor, String conteudo) {
        this.id = id;
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataPublicacao = LocalDateTime.now();
        this.likes = 0; // Inicia o contador de likes com 0.
    }

    /**
     * Métodos getters e setters para todos os atributos.
     */
    public int getId() {
        return id;
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

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    /**
     * Método para escrever as informações de um post.
     * @return Atributos de Post.
     */
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                ", likes=" + likes +
                '}';
    }

    /**
     * Método para adicionar um like ao post.
     */
    public void adicionarLike(){
        this.likes++;
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses para exibir o conteúdo do post.
     * @return Uma string contendo
     */
    public abstract String exibir();
}

