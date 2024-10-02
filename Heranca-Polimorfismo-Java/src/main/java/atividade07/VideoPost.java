package main.java.atividade07;

public class VideoPost extends Post{
    private String urlVideo;
    private int duracao;

    public VideoPost(String autor, String conteudo, String urlVideo, int duracao) {
        super(autor, conteudo);
        this.urlVideo = urlVideo;
        this.duracao = duracao;
    }

    @Override
    public String exibir() {
        return getConteudo() + "\nVídeo: " + urlVideo + "\nDuração: " + duracao + " segundos";
    }
}

