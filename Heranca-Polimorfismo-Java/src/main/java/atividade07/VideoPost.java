package main.java.atividade07;

import java.time.LocalDateTime;

public class VideoPost extends Post{
    private String urlVideo;
    private int duracao;

    public VideoPost(int id, String autor, String conteudo, LocalDateTime dataPublicacao, int likes, String urlVideo, int duracao) {
        super(id, autor, conteudo, dataPublicacao, likes);
        this.urlVideo = urlVideo;
        this.duracao = duracao;
    }

    @Override
    public String exibir() {
        return "Autor: "+getAutor()+"\nVideo: "+urlVideo+"\nDuração: "+duracao;
    }
}
