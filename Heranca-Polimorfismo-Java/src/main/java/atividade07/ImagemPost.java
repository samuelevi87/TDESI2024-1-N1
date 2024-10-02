package main.java.atividade07;

public class ImagemPost extends Post{
    private String urlImagem;
    private String filtro;

    public ImagemPost(String autor, String conteudo, String urlImagem, String filtro) {
        super(autor, conteudo);
        this.urlImagem = urlImagem;
        this.filtro = filtro;
    }

    @Override
    public String exibir() {
        return getConteudo() + "\nImagem: " + urlImagem + "\nFiltro: " + filtro;
    }
}
}
