package main.java.atividade07;

import java.util.ArrayList;
import java.util.List;

/***
 * Classe que representa um post de texto.
 */
public class TextPost extends Post {
    /***
     * Lista de hashtags associadas ao post
     */
    private List<String> hashtags;

    /***
     * Construtor que inicializa os atributos do post.
     *
     * @param autor    O autor do post
     * @param conteudo O conteúdo do post
     */
    public TextPost(String autor, String conteudo) {
        super(autor, conteudo);
        this.hashtags = new ArrayList<>();
    }

    /***
     * Adiciona uma hashtag ao post.
     *Adiciona a hashtag à lista
     * @param hashtag A hashtag a ser adicionada
     */
    public void adicionarHashtag(String hashtag) {
        hashtags.add(hashtag);
    }

    /***
     * Exibe o conteúdo do post formatado com hashtags.
     *Exibe conteúdo e hashtags
     * @return A representação em String do post
     */
    @Override
    public String exibir() {
        return getConteudo() + " " + String.join(" ", hashtags);
    }
}