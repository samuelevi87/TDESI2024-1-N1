package main.java.atividade07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Representa uma rede social para gerenciar os posts
 */
public class RedeSocial {
    private List<Post> posts;

    /**
     * Inicializa a lista de posts como um ArrayList
     */
    public RedeSocial(){
        this.posts = new ArrayList<>();
    }

    /**
     * Adiciona um post à lista de posts
     * @param post
     */
    public void adicionarPost(Post post){
        this.posts.add(post);
    }

    /**
     * Exibe todos os posts
     * @return String dos posts
     */
    public String listarTodosPosts(){
        return posts.stream().map(Post::exibir).collect(Collectors.joining("\n\n"));
    }

    /**
     * Busca os posts de determinado autor
     * @param autor autor a ser buscado
     * @return lista de string contendo os posts do autor
     */
    public List<String> buscarPostsPorAutor(String autor){
        return posts.stream().filter((post -> post.getAutor().equalsIgnoreCase(autor))).map(Post::exibir).toList();
    }

    /**
     * Adiciona like a um post com base no seu id
     * @param id
     */
    public void adicionarLike(int id){
        posts.stream().filter(post -> post.getId() == id).findFirst().ifPresent(Post::adicionarLike);
    }

    /**
     * Exibe o post com mais curtidas
     * @return string do post com mais curtidas
     */
    public String exibirPostMaisPopular(){
       return posts.stream().max(Comparator.comparingInt(Post::getLikes)).get().exibir();
    }
}
