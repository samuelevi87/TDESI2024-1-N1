package main.java.atividade07;

/**
 * Subclasse que representa um post de video, estendendo a classe abstrata Post.
 */
public class VideoPost extends Post{

    private String urlVideo;

    private int duracao; // Em segundos

    /**
     * Construtor da classe Post que inicializa o autor, o conteudo, a url do video  e a duracao.
     */

    public VideoPost( String autor, String conteudo, String urlVideo, int duracao) {
        super(autor, conteudo);
        this.urlVideo = urlVideo;
        this.duracao = duracao;
    }

    /**
     * Implementação do método abstrato exibir() definido na classe Post.
     * @return Retorna o conteúdo do post com o url do video e a duracao.
     */
    @Override
    public String exibir() {
        return getConteudo() + "\nVídeo: " + urlVideo + "\nDuração: " + duracao + " segundos";
    }
}
