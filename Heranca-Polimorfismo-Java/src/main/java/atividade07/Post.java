package main.java.atividade07;

import java.time.LocalDateTime;

public abstract class Post {

    private int id;
    private String autor;
    private String conteudo;
    private LocalDateTime dataPublicacao;
    private int likes;


    public Post(int id, String autor, String conteudo, LocalDateTime dataPublicacao, int likes) {
        this.id = id;
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataPublicacao = dataPublicacao;
        this.likes = likes;
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

    public void adicionarLike() {

    }

    public abstract String exibir();

}


