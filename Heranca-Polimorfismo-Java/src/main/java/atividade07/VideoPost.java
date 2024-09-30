package main.java.atividade07;

/**
 * Representa um post de vídeo
 */
public class VideoPost extends Post{
    private String urlVideo;
    private int duracao;

    /**
     * Constrói um VideoPost
     * @param autor     autor do post
     * @param conteudo  conteúdo do post
     * @param urlVideo  url do vídeo
     * @param duracao   duração do vídeo
     */
    public VideoPost(String autor, String conteudo, String urlVideo, int duracao) {
        super(autor, conteudo);
        this.urlVideo = urlVideo;
        this.duracao = duracao;
    }
    /**
     * Exibe o post com o autor, data de publicação, conteúdo, url do video, duracao e quantidade de likes
     * @return string com as informações a serem exibidas
     */
    @Override
    public String exibir() {
        return getAutor() + " " + getDataFormatada() + "\n" +
                urlVideo + " " + duracao + "\nlikes: " + getLikes();
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
