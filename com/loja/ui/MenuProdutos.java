package com.loja.ui;

import com.loja.modelo.Produto;
import com.loja.gerenciador.GerenciadorProdutos;
import java.util.Scanner;

public class MenuProdutos {
    private final Scanner scanner = new Scanner(System.in);
    private final GerenciadorProdutos gerenciador = new GerenciadorProdutos();

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Buscar Produto por ID");
            System.out.println("3. Listar Todos os Produtos");
            System.out.println("4. Atualizar Produto");
            System.out.println("5. Deletar Produto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1 -> cadastrarProduto();
                case 2 -> buscarProduto();
                case 3 -> listarProdutos();
                case 4 -> atualizarProduto();
                case 5 -> deletarProduto();
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private void cadastrarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a categoria: ");
        String categoria = scanner.nextLine();

        Produto produto = new Produto(nome, preco, quantidade, categoria);
        gerenciador.criar(produto);
    }

    private void buscarProduto() {
        System.out.print("Digite o ID do produto: ");
        int id = scanner.nextInt();
        Produto produto = gerenciador.buscarPorId(id);
        if (produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private void listarProdutos() {
        var produtos = gerenciador.listarTodos();
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            produtos.forEach(System.out::println);
        }
    }

    private void atualizarProduto() {
        System.out.print("Digite o ID do produto: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto produto = gerenciador.buscarPorId(id);
        if (produto != null) {
            System.out.print("Novo nome: ");
            produto.setNome(scanner.nextLine());
            System.out.print("Novo preço: ");
            produto.setPreco(scanner.nextDouble());
            System.out.print("Nova quantidade em estoque: ");
            produto.setQuantidadeEstoque(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Nova categoria: ");
            produto.setCategoria(scanner.nextLine());
            gerenciador.atualizar(produto);
            System.out.println("Produto atualizado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private void deletarProduto() {
        System.out.print("Digite o ID do produto: ");
        int id = scanner.nextInt();
        if (gerenciador.deletar(id)) {
            System.out.println("Produto deletado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
