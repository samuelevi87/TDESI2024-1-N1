package main.java.atividade07;

/**
 * Representa um post de imagem
 */
public class ImagePost extends Post{
    private String urlImagem;
    private String filtro;

    /**
     * Constrói um ImagePost
     *
     * @param autor     autor do post
     * @param conteudo  conteúdo do post
     * @param urlImagem url da imagem
     * @param filtro    filtro da imagem
     */
    public ImagePost(String autor, String conteudo, String urlImagem, String filtro) {
        super(autor, conteudo);
        this.urlImagem = urlImagem;
        this.filtro = filtro;
    }

    /**
     * Exibe o post com o autor, data de publicação, conteúdo, url da imagem, filtro e quantidade de likes
     * @return string com as informações a serem exibidas
     */
    @Override
    public String exibir() {
        return getAutor() + " " + getDataPublicacao() + "\n" +
                urlImagem + " " + filtro + "\nlikes: " + getLikes();
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }
}
