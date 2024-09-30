package main.java.atividade07;

/**
 * Subclasse que representa um post de imagem, estendendo a classe abstrata Post.
 */
public class ImagePost extends Post {

    private String urlImagem;

    private String filtro;

    /**
     * Construtor da classe Post que inicializa o autor, o conteudo, a url da imagem e o filtro.
     */
    public ImagePost( String autor, String conteudo, String urlImagem, String filtro) {
        super( autor, conteudo);
        this.urlImagem = urlImagem;
        this.filtro = filtro;
    }

    /**
     * Implementação do método abstrato exibir() definido na classe Post.
     * @return Retorna o conteúdo do post com o url da imagem e o filtro.
     */
    @Override
    public String exibir() {
        return getConteudo() + "\nImagem: " + urlImagem + "\nFiltro: " + filtro;
    }
}