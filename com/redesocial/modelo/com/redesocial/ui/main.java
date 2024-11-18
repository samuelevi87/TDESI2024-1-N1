package com.redesocial.ui;

import com.redesocial.gerenciador.GerenciadorUsuario;
import com.redesocial.gerenciador.GerenciadorPost;
import com.redesocial.modelo.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
        GerenciadorPost gerenciadorPost = new GerenciadorPost();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==== Sistema de Rede Social ====");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Criar Post");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    if (gerenciadorUsuario.cadastrarUsuario(username, email, senha)) {
                        System.out.println("Usuário cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Usuário já existe ou email inválido.");
                    }
                    break;
                case 2:
                    for (Usuario u : gerenciadorUsuario.listarUsuarios()) {
                        System.out.println(u);
                    }
                    break;
                case 3:
                    System.out.print("Username do autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Conteúdo do post: ");
                    String conteudo = scanner.nextLine();
                    gerenciadorPost.criarPost(autor, conteudo);
                    System.out.println("Post criado com sucesso!");
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
