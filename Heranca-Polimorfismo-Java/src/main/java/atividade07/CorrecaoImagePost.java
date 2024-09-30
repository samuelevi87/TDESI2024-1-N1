package main.java.atividade07;

/**
 * Classe que representa um post de imagem.
 */
public class CorrecaoImagePost extends CorrecaoPost {
    private String urlImagem;
    private String filtro;

    /**
     * Construtor para a classe ImagePost.
     *
     * @param autor O autor do post.
     * @param conteudo O conteúdo do post.
     * @param urlImagem A URL da imagem.
     * @param filtro O filtro aplicado à imagem.
     */
    public CorrecaoImagePost(String autor, String conteudo, String urlImagem, String filtro) {
        super(autor, conteudo);
        this.urlImagem = urlImagem;
        this.filtro = filtro;
    }

    @Override
    public String exibir() {
        return String.format("%s\nImagem: %s, Filtro: %s", super.toString(), urlImagem, filtro);
    }
}