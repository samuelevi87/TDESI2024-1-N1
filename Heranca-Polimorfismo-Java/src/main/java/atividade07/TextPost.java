package main.java.atividade07;
import java.util.ArrayList;

public class TextPost extends Post{
    private ArrayList<String> hashtags;

    public TextPost(String autor, String conteudo) {
        super(autor, conteudo);
        this.hashtags = new ArrayList<>();
    }

    public void adicionarHashtag(String hashtag) {
        hashtags.add(hashtag);
    }

    @Override
    public String exibir() {
        return getConteudo() + " " + String.join(" ", hashtags);
    }

    public ArrayList<String> getHashtags() {
        return hashtags;
    }
}
}
