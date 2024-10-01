package main.java.atividade07;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TextoPost extends Post{

    private ArrayList<String> hashtags;

    public TextoPost(int id, String autor, String conteudo, LocalDateTime dataPublicacao, int likes, ArrayList hashtags) {
        super(id, autor, conteudo, dataPublicacao, likes);
        this.hashtags = hashtags;
    }

    @Override
    public String exibir() {
        return "Autor: "+getAutor()+"\n Conteudo: "+getConteudo()+"+"+hashtags;
    }
}


