package main.java.atividade07;

/**
 * Classe que representa um post de vídeo.
 */
public class CorrecaoVideoPost extends CorrecaoPost {
    private String urlVideo;
    private int duracao;

    /**
     * Construtor para a classe VideoPost.
     *
     * @param autor    O autor do post.
     * @param conteudo O conteúdo do post.
     * @param urlVideo A URL do vídeo.
     * @param duracao  A duração do vídeo em segundos.
     */
    public CorrecaoVideoPost(String autor, String conteudo, String urlVideo, int duracao) {
        super(autor, conteudo);
        this.urlVideo = urlVideo;
        this.duracao = duracao;
    }

    @Override
    public String exibir() {
        return String.format("%s\nVídeo: %s, Duração: %d segundos", super.toString(), urlVideo, duracao);
    }
}