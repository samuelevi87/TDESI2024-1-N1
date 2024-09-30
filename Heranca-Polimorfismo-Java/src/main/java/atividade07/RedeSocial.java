package main.java.atividade07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

/**
 * Classe que representa a rede social e gerencia os posts.
 */
public class RedeSocial {
    /**
     * Lista que armazena os posts da rede social.
     */
    private ArrayList<Post> posts;

    /**
     * Construtor que inicializa a lista de posts.
     */
    public RedeSocial() {
        this.posts = new ArrayList<>();
    }

    /**
     * Método para adicionar um post à rede social.
     * @param post
     */
    public void adicionarPost(Post post) {
        posts.add(post);
    }

    /**
     * Método para listar todos os posts da rede social.
     */
    public void listarPosts() {
        for (Post post : posts) {
            System.out.println(toString());
        }
    }

    /**
     * Método para buscar e listar posts por autor.
     * @param autor
     */
    public void buscarPostPorAutor(String autor) {
        for (Post post : posts) {
            if (post.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(post.exibir() + "\nLikes: " + post.getLikes() + "\n");
            }
            System.out.println("Autor não encontrado");
        }
    }

    /**
     * Método para adicionar um "like" a um post específico com base no ID.
     * @param postId
     */
    public void adicionarLike(int postId) {
        for (Post post : posts) {
            if (post.getId() == postId) {
                post.adicionarLike();
                System.out.println("Like adicionado ao post com ID: " + postId);
                return;
            }
            System.out.println("Post com ID " + postId + " não encontrado.");
        }
    }

    /**
     * Método para exibir o post mais popular (com mais likes).
     */
    public void exibirPostMaisPopular() {
        Optional<Post> postMaisPopular = posts.stream().max(Comparator.comparingInt(Post::getLikes));
        if (postMaisPopular.isPresent()) {
            Post popular = postMaisPopular.get();
            System.out.println("Post mais popular:\n" + popular.exibir() + "\nLikes: " + popular.getLikes());
        } else {
            System.out.println("Nenhum post encontrado.");
        }
    }
}
