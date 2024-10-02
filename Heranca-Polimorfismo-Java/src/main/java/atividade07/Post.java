package main.java.atividade07;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Post {
    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    private final int id;
    private String autor;
    private String conteudo;
    private LocalDateTime dataPublicacao;
    private int likes;

    public Post(String autor, String conteudo) {
        this.id = idGenerator.incrementAndGet();
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

    public void adicionarLike() {
        likes++;
    }

    public String exibir() {
        return null;
    }
}

