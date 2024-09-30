package main.java.atividade07;

import java.util.ArrayList;

/**
 * Subclasse que representa um post de texto, estendendo a classe abstrata Post.
 */
public class TextPost extends Post{

    private ArrayList <String> hashtags; // Lista de hashtags associadas ao post de texto

    /**
     * Construtor que inicializa o autor, conteúdo e hashtags do post.
     */

    public TextPost( String autor, String conteudo, ArrayList <String> hashtags) {
        super(autor, conteudo);
        this.hashtags = hashtags;
    }

    /**
     * Implementação do método abstrato exibir() definido na classe Post.
     * @return Retorna o conteúdo do post seguido pelas hashtags formatadas como uma string.
     */

    @Override
    public String exibir() {
        return getConteudo() + "\nHashtags: " + String.join(", ", hashtags);
    }
}
