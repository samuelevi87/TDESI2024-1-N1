package main.java.atividade07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe que representa a rede social.
 */
public class CorrecaoRedeSocial {
    private List<CorrecaoPost> listaDePostagens;

    public CorrecaoRedeSocial() {
        this.listaDePostagens = new ArrayList<>();
    }

    /**
     * Adiciona um novo post à rede social.
     *
     * @param post O post a ser adicionado.
     */
    public void adicionarPost(CorrecaoPost post) {
        listaDePostagens.add(post);
    }

    /**
     * Lista todos os posts da rede social.
     */
    public void listarPosts() {
        listaDePostagens.forEach(post -> System.out.println(post.exibir()));
    }

    /**
     * Versão simples do método listarPosts.
     */
    public void listarPostsSimples() {
        for (CorrecaoPost post : listaDePostagens) {
            System.out.println(post.exibir());
        }
    }

    /**
     * Busca posts por autor.
     *
     * @param autor O autor dos posts a serem buscados.
     * @return Uma lista de posts do autor especificado.
     */
    public List<CorrecaoPost> buscarPorAutor(String autor) {
        return listaDePostagens.stream()
                .filter(post -> post.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    /**
     * Versão simples do método buscarPorAutor.
     *
     * @param autor O autor dos posts a serem buscados.
     * @return Uma lista de posts do autor especificado.
     */
    public List<CorrecaoPost> buscarPorAutorSimples(String autor) {
        List<CorrecaoPost> postsDoAutor = new ArrayList<>();
        for (CorrecaoPost post : listaDePostagens) {
            if (post.getAutor().equalsIgnoreCase(autor)) {
                postsDoAutor.add(post);
            }
        }
        return postsDoAutor;
    }

    /**
     * Adiciona um like a um post específico.
     *
     * @param id O ID do post que receberá o like.
     */
    public void adicionarLike(int id) {
        listaDePostagens.stream()
                .filter(post -> post.getId() == id)
                .findFirst()
                .ifPresent(CorrecaoPost::adicionarLike);
    }

    /**
     * Versão simples do método adicionarLike.
     *
     * @param id O ID do post que receberá o like.
     */
    public void adicionarLikeSimples(int id) {
        for (CorrecaoPost post : listaDePostagens) {
            if (post.getId() == id) {
                post.adicionarLike();
                break;
            }
        }
    }

    /**
     * Exibe o post mais popular (com mais likes).
     */
    public void exibirPostMaisPopular() {
        listaDePostagens.stream()
                .max(Comparator.comparingInt(CorrecaoPost::getLikes))
                .ifPresent(post -> System.out.println("Post mais popular: " + post.exibir()));
    }

    /**
     * Versão simples do método exibirPostMaisPopular.
     */
    public void exibirPostMaisPopularSimples() {
        CorrecaoPost maisPopular = null;
        int maxLikes = -1;
        for (CorrecaoPost post : listaDePostagens) {
            if (post.getLikes() > maxLikes) {
                maxLikes = post.getLikes();
                maisPopular = post;
            }
        }
        if (maisPopular != null) {
            System.out.println("Post mais popular: " + maisPopular.exibir());
        } else {
            System.out.println("Não há posts na rede social.");
        }
    }
}