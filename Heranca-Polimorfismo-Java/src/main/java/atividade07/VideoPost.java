package main.java.atividade07;

public class VideoPost extends Post{
    private String urlVideo;
    private int duracao;

    /***
     * Construtor que inicializa os atributos do post.
     *
     * @param autor    O autor do post
     * @param conteudo O conteúdo do post
     * @param urlVideo A URL do vídeo
     * @param duracao  A duração do vídeo em segundos
     */
    public VideoPost(String autor, String conteudo, String urlVideo, int duracao) {
        super(autor, conteudo);
        this.urlVideo = urlVideo;
        this.duracao = duracao;
    }

    /***
     * Exibe o conteúdo do post formatado com a URL do vídeo e sua duração.
     *
     * @return A representação em String do post
     */
    @Override
    public String exibir() {
        return getConteudo() + "\nVídeo: " + urlVideo + "\nDuração: " + duracao + " segundos";
    }
}
