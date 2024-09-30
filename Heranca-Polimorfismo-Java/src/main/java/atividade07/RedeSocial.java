package main.java.atividade07;

import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
    private List<Post> posts;

    public RedeSocial(){
        this.posts = new ArrayList<>();
    }
    public void adicionarPost(Post post){
        this.posts.add(post);
    }
    public List<String> listarTodosPosts(){
        return posts.stream().map(Post::exibir).toList();
    }
    public List<String> buscarPostsPorAutor(String autor){
        return posts.stream().filter((post -> post.getAutor().equalsIgnoreCase(autor))).map(Post::exibir).toList();
    }
    public void adicionarLike(int id){
        posts.stream().filter(post -> post.getId() == id).findFirst().ifPresent(Post::adicionarLike);
    }
}
