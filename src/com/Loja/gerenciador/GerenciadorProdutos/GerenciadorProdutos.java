package com.Loja.gerenciador.GerenciadorProdutos;
import com.Loja.modelo.Produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos  {
    private List<Produto>produtos;
    private int proximoID ;


   public GerenciadorProdutos (){
       this.produtos = new ArrayList<>();
       this.proximoID = 1;
    }

    public void Criar(Produto produto){
       validarProduto(produto);
       produtos.add(produto);
       produto.setId(proximoID++);
    }

    private void validarProduto(Produto produto){
       if (produto.getNome()==null || produto.getNome().isEmpty()){
           throw new  IllegalArgumentException ("Nome do produto não pode ser vazio.");
       }
       if (produto.getPreco()<=0){
           throw new  IllegalArgumentException ("Preco do produto deve ser positivo.");
       }
       if (produto.getQuantidadeEstoque()<0){
           throw new IllegalArgumentException("Quantidade em estoque não pode ser negativa .");
       }
    }

    public Produto buscarPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                System.out.println("Produto encontrado:");
                System.out.println("ID: " + produto.getId() +
                        " | Nome: " + produto.getNome() +
                        " | Preço: R$ " + String.format("%.2f", produto.getPreco()) +
                        " | Estoque: " + produto.getQuantidadeEstoque() +
                        " | Categoria: " + produto.getCategoria());
                return produto;
            }
        }
        System.out.println("Produto com ID " + id + " não encontrado.");
        return null;
    }

    public List<Produto>produtos(){
       for (Produto produto : produtos){
           System.out.println("ID : "+produto.getId() +"\n" + "Nome : "+produto.getNome() +
                   "\n" + "Preço : "+produto.getPreco() + "\n" + "Qtd Etq. : "+produto.getQuantidadeEstoque() +
                   "\n" +"Categoria : "+produto.getCategoria());
           System.out.println();
       }
       return produtos;
    }

    public boolean atualizar (Produto produto){
       for (Produto novo : produtos ){
           if (novo.getId()== produto.getId()){
               novo.setNome(produto.getNome());
               novo.setPreco(produto.getPreco());
               novo.setQuantidadeEstoque(produto.getQuantidadeEstoque());
               novo.setCategoria(produto.getCategoria());

           }
           return true;
       }

       return false;
    }

public boolean deletar(int id){
       for (Produto p : produtos){
           if (p.getId()== id){
               produtos.remove(p);
               System.out.println("Produto ID : "+p.getId()+" removido com sucesso.✅");
               return true;
           }
       }

    return false;
}

public List<Produto>buscarPorNome (String nome){
       List<Produto> produtoEncontrado = new ArrayList<>();
      for (Produto produto : produtos){
          if (produto.getNome().toLowerCase().contains(nome.toLowerCase())){
              produtoEncontrado.add(produto);
              return produtoEncontrado;
          }
          System.out.println("Produto filtrado por nome : " );

       }
    System.out.println("Produto nome : "+nome + " não encontrado .");
     return null;
   }

   public List<Produto> buscarPorCategoria (String categoria){
       List<Produto>buscarPorCategoria = new ArrayList<>();
       for (Produto produto : produtos){
           if (produto.getCategoria().toLowerCase().contains(categoria.toLowerCase())){
               buscarPorCategoria.add(produto);
           }
       }
       System.out.println("Produto filtrado por Categoria: ");
          return buscarPorCategoria;
    }



}
