package main.java.atividade07;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um Post de texto
 */
public class TextPost extends Post{
    private List<String> hashtags;

    /**
     * Constrói um TextPost
     *
     * @param autor autor do post
     * @param conteudo conteúdo do post
     */
    public TextPost(String autor, String conteudo) {
        super(autor, conteudo);
        this.hashtags = new ArrayList<>();
    }

    /**
     * Formata as hashtags colocando # caso não tenha
     */
    public void formatarHashtags(){
        hashtags.forEach((hashtag) -> {
            if(!hashtag.startsWith("#")){
                hashtag = "#" + hashtag;
            }
            hashtags.add(hashtag);
        });
    }

    /**
     * Exibe o post com o autor, data de publicação, conteúdo, hashtags e quantidade de likes
     * @return string com as informações a serem exibidas
     */
    @Override
    public String exibir() {
        formatarHashtags();
        String hashtagsExibicao = String.join(" ", hashtags);
        return getAutor() + " " + getDataPublicacao() + "\n" +
                getConteudo() + " " + hashtagsExibicao +
                "\nlikes:" + getLikes();
    }
}