package main.java.atividade07;

import java.util.ArrayList;
import java.util.List;

class RedeSocial {
    private List<Post> posts;

    public RedeSocial() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPost(Post post) {
        posts.add(post);
    }

    public void listarPosts() {
        for (Post post : posts) {
            System.out.println(post.exibir());
        }
    }

    public void buscarPostsPorAutor(String autor) {
        for (Post post : posts) {
            if (post.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(post.exibir());
            }
        }
    }

    public void adicionarLikeAoPost(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                post.adicionarLike();
                break;
            }
        }
    }

    public void exibirPostMaisPopular() {
        if (posts.isEmpty()) {
            System.out.println("Nenhum post disponível.");
            return;
        }

        Post maisPopular = posts.get(0);
        for (int i = 1; i < posts.size(); i++) {
            if (posts.get(i).getLikes() > maisPopular.getLikes()) {
                maisPopular = posts.get(i);
            }
        }

        System.out.println("Post mais popular:\n" + maisPopular.exibir());
    }
}