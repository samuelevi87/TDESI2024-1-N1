package com.redesocial.gerenciador;

import com.redesocial.modelo.Post;
import java.util.ArrayList;

public class GerenciadorPost {
    private ArrayList<Post> posts = new ArrayList<>();

    public void criarPost(String autor, String conteudo) {
        posts.add(new Post(autor, conteudo));
    }

    public ArrayList<Post> listarPosts(String autor) {
        ArrayList<Post> resultado = new ArrayList<>();
        for (Post post : posts) {
            if (post.getAutor().equals(autor)) {
                resultado.add(post);
            }
        }
        return resultado;
    }

    public void excluirPost(Post post) {
        posts.remove(post);
    }
}
