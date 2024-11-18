package com.redesocial.modelo;

import java.util.ArrayList;

public class Post {
    private String autor;
    private String conteudo;
    private int curtidas;
    private ArrayList<String> comentarios;

    public Post(String autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.curtidas = 0;
        this.comentarios = new ArrayList<>();
    }

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        curtidas++;
    }

    public void descurtir() {
        if (curtidas > 0) curtidas--;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void comentar(String comentario) {
        comentarios.add(comentario);
    }

    @Override
    public String toString() {
        return "Post de " + autor + ": " + conteudo + " | Curtidas: " + curtidas + " | Comentários: " + comentarios.size();
    }
}
