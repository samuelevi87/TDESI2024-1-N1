package main.java.atividade07;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RedeSocial {
    private List<Post> posts;

    public RedeSocial() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPost(Post post) {
        posts.add(post);
    }

    public List<Post> listarPosts() {
        return posts;
    }

    public List<Post> buscarPorAutor(String autor) {
        return posts.stream()
                .filter(post -> post.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    public void adicionarLike(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                post.adicionarLike();
                break;
            }
        }
    }

    public Post exibirPostMaisPopular() {
        return posts.stream()
                .max((p1, p2) -> Integer.compare(p1.getLikes(), p2.getLikes()))
                .orElse(null);
    }
}
