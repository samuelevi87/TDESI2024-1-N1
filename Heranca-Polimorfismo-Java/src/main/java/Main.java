package main.java;

import main.java.atividade08.*;

public class Main {
    public static void main(String[] args) {
        // Criar instância da loja
        Loja loja = new Loja();

        // Criar alguns produtos
        ProdutoFisico produto1 = new ProdutoFisico("Camiseta", "Camiseta de algodão", 49.90, 10, 0.2, "M");
        ProdutoFisico produto2 = new ProdutoFisico("Calça Jeans", "Calça jeans azul", 89.90, 5, 0.5, "M");
        ProdutoDigital produto3 = new ProdutoDigital("E-book Java", "E-book sobre Java", 29.90, 15, 1.5, "PDF");
        ProdutoDigital produto4 = new ProdutoDigital("E-book Python", "E-book sobre Python", 39.90, 10, 2.0, "PDF");
        Servico servico1 = new Servico("Consultoria", "Consultoria em TI", 199.90, 2, 3);

        // Adicionar produtos ao estoque da loja
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);
        loja.adicionarProduto(produto4);
        loja.adicionarProduto(servico1);

        // Listar todos os produtos na loja
        System.out.println("Produtos no estoque da loja:");
        loja.listarProdutos();

        // Criar instância do carrinho
        Carrinho carrinho = new Carrinho();

        // Adicionar produtos ao carrinho
        carrinho.adicionarProduto(produto1); // Camiseta
        carrinho.adicionarProduto(produto3); // E-book Java
        carrinho.adicionarProduto(servico1);  // Consultoria

        // Listar itens no carrinho
        System.out.println("\nItens no carrinho:");
        carrinho.listarItens();

        // Calcular o total da compra
        double total = carrinho.calcularTotal();
        System.out.println("Total da compra: R$ " + total);

        // Remover um produto do carrinho
        carrinho.removerProduto(produto3.getId()); // Removendo o E-book Java
        System.out.println("\nApós remover o E-book Java do carrinho:");
        carrinho.listarItens();

        // Calcular o novo total da compra
        double novoTotal = carrinho.calcularTotal();
        System.out.println("Novo total da compra: R$ " + novoTotal);
    }
}
