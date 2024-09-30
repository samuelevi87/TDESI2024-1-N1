package main.java.atividade07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe que representa um post de texto.
 */
public class CorrecaoTextPost extends CorrecaoPost {
    private List<String> hashtags;

    /**
     * Construtor para a classe TextPost.
     *
     * @param autor O autor do post.
     * @param conteudo O conteúdo do post.
     * @param hashtags A lista de hashtags do post.
     */
    public CorrecaoTextPost(String autor, String conteudo, List<String> hashtags) {
        super(autor, conteudo);
        this.hashtags = new ArrayList<>(hashtags);
    }

    @Override
    public String exibir() {
        return String.format("%s\nHashtags: %s", super.toString(),
                hashtags.stream().map(h -> "#" + h).collect(Collectors.joining(" ")));
    }

    /**
     * Versão simples do método exibir sem usar streams.
     *
     * @return Uma String representando o conteúdo formatado do post, incluindo hashtags.
     */
    public String exibirSimples() {
        StringBuilder result = new StringBuilder(super.toString());
        result.append("\nHashtags: ");

        if (!hashtags.isEmpty()) {
            for (int i = 0; i < hashtags.size(); i++) {
                result.append("#").append(hashtags.get(i));
                if (i < hashtags.size() - 1) {
                    result.append(" ");
                }
            }
        } else {
            result.append("Nenhuma hashtag");
        }

        return result.toString();
    }
}