
package com.Loja ;

import com.Loja.gerenciador.GerenciadorProdutos.GerenciadorProdutos;
import com.Loja.modelo.Produto.Produto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();
        Scanner entrada = new Scanner(System.in);

        for (int i =1 ; i<= 3 ; i++) {
            System.out.println("==== Criar produto =====");

            System.out.println("Digite o nome do produto : ");
            String nome = entrada.nextLine();

            System.out.println("Digite o preço : ");
            double preco = entrada.nextDouble();

            System.out.println("Digite a quantitade : ");
            int quantidadeEstoque = entrada.nextInt();

            entrada.nextLine();

            System.out.println("Digite a categoria : ");
            String categoria = entrada.nextLine();


            Produto produto1 = new Produto(nome, preco, quantidadeEstoque, categoria);

            System.out.println(" ~~~~ PRODUTO " + i +  " CADASTRADO  COM SUCESSO ~~~~");

            System.out.println("ID gerado : " + produto1.getId());

            gerenciador.Criar(produto1);
            System.out.println();
        }
        System.out.println();

        System.out.println("==== Lista de Produtos Cadastrados ====");
        gerenciador.produtos();
        System.out.println("-------------------------------------");

        System.out.println();

        System.out.println("==== Busca com ID ===");
        System.out.print("Digite o ID : ");
        int id = entrada.nextInt();

        Produto produtoEncontrado = gerenciador.buscarPorId(id);

        if (produtoEncontrado != null) {
            System.out.println("Produto exibido com sucesso.");
        } else {
            System.out.println("Nenhum produto foi encontrado com o ID informado.");
        }


        gerenciador.buscarPorId(id);
        System.out.println("---------------------");



        System.out.println();
        System.out.println();


        System.out.println("=== Buscar Produto pro Nome === ");
        entrada.nextLine();
        System.out.println("Digite o nome : ");
       String nome = entrada.nextLine();
       List<Produto> encontrado = gerenciador.buscarPorNome(nome);
       if (encontrado.isEmpty()){
           System.out.println("Produtos não encontrado.");
       }
       else {
           for (Produto produto : encontrado){
               System.out.println(produto);
           }
       }
        System.out.println();

        System.out.println("=== Buscar Por Categoria ");
        System.out.println("Digite a categoria : ");
        String Categoria = entrada.nextLine();
       List<Produto>ProdutosEncontrados= gerenciador.buscarPorCategoria(Categoria);
       if (ProdutosEncontrados.isEmpty()){
           System.out.println("Categoria não encontrada.‼️‼️‼️");
       }
       else {
           for (Produto produto : ProdutosEncontrados){
               System.out.println(produto);
           }
       }

        System.out.println();

        System.out.println("==== Atualizar produto ==== ");
        System.out.println(" Digite o ID : ");
        id  = entrada.nextInt();
        String newnome;
        System.out.println("Digite o nome : ");
        newnome = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Digite o preco : ");
        double preco = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite quantitade Estoque : ");
        int quantidadeEstoque = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Digite a categoria : ");
        String categoria = entrada.nextLine();

        Produto produtoatualizado = new Produto(newnome,preco,quantidadeEstoque,categoria);


        produtoatualizado.setId(id);



        boolean atualizado = gerenciador.atualizar(produtoatualizado);

        if (atualizado){
            System.out.println("Produto ID: "+produtoatualizado.getId() + " atualizado com sucesso" );
        }else {
            System.out.println("Produto não encontrado para atualizar ");
        }

        System.out.println(produtoatualizado);

        System.out.println();

        System.out.println("=== Deletar Produto === ");
        System.out.println("Digite o ID : ");
        int ID= entrada.nextInt();
        gerenciador.deletar(ID);
    }

}