package main.java.atividade07;

import java.util.ArrayList;

public class RedeSocial{
    private ArrayList<Post> posts;

    /***
     * Construtor que inicializa a lista de posts.
     */
    public RedeSocial() {
        this.posts = new ArrayList<>();
    }

    /***
     * Adiciona um post à rede social.
     *
     * @param post O post a ser adicionado
     */
    public void adicionarPost(Post post) {
        posts.add(post);
    }

    /***
     * Lista todos os posts na rede social.
     *
     * @return Uma lista de representações em String de todos os posts
     */
    public ArrayList<String> listarPosts() {
        ArrayList<String> representacoes = new ArrayList<>();
        for (Post post : posts) {
            representacoes.add(post.exibir());
        }
        return representacoes;
    }

    /***
     * Busca posts por autor.
     *
     * @param autor O autor dos posts a serem buscados
     * @return Uma lista de representações em String dos posts do autor
     */
    public ArrayList<String> buscarPostsPorAutor(String autor) {
        ArrayList<String> representacoes = new ArrayList<>();
        for (Post post : posts) {
            if (post.getAutor().equalsIgnoreCase(autor)) {
                representacoes.add(post.exibir());
            }
        }
        return representacoes;
    }

    /***
     * Adiciona um like a um post específico pelo ID.
     *
     * @param id O ID do post a ser atualizado
     */
    public void adicionarLikeAoPost(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                post.adicionarLike();
                break;
            }
        }
    }

    /***
     * Exibe o post mais popular (com mais likes).
     *
     * @return A representação em String do post mais popular
     */
    public String exibirPostMaisPopular() {
        Post postMaisPopular = null;
        for (Post post : posts) {
            if (postMaisPopular == null || post.getLikes() > postMaisPopular.getLikes()) {
                postMaisPopular = post;
            }
        }
        return postMaisPopular != null ? postMaisPopular.exibir() : "Nenhum post encontrado."; // Retorna a representação do post mais popular ou mensagem se não houver posts
    }
}
