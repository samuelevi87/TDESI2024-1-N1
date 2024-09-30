package main.java.atividade07;

import java.time.LocalDateTime;

public class ImagePost extends Post{

    private String urlImagem;
    private String filtro;

    public ImagePost(int id, String autor, String conteudo, LocalDateTime dataPublicacao, int likes, String urlImagem, String filtro) {
        super(id, autor, conteudo, dataPublicacao, likes);
        this.urlImagem = urlImagem;
        this.filtro = filtro;

    }

    @Override
    public String exibir() {
        return "Autor: "+getAutor()+"Conteudo: "+getConteudo()+"\nImagem: "+urlImagem+"\n Filtro: "+filtro;
    }
}
