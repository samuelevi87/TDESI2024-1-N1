package com.redesocial.gerenciador;

import com.redesocial.modelo.Usuario;
import java.util.ArrayList;

public class GerenciadorUsuario {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public boolean cadastrarUsuario(String username, String email, String senha) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username) || u.getEmail().equals(email)) {
                return false;
            }
        }
        usuarios.add(new Usuario(username, email, senha));
        return true;
    }

    public Usuario buscarUsuario(String username) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }

    public boolean excluirUsuario(String username) {
        Usuario usuario = buscarUsuario(username);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }

    public ArrayList<Usuario> listarUsuarios() {
        return new ArrayList<>(usuarios);
    }
}
