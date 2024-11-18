package com.redesocial.modelo;

import java.util.ArrayList;

public class Usuario {
    private String username;
    private String email;
    private String senha;
    private ArrayList<String> amigos;

    public Usuario(String username, String email, String senha) {
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.amigos = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<String> getAmigos() {
        return amigos;
    }

    public void adicionarAmigo(String amigo) {
        amigos.add(amigo);
    }

    @Override
    public String toString() {
        return "Usuário: " + username + " | Email: " + email;
    }
}
