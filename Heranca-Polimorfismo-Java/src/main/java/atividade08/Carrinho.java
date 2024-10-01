package main.java.atividade08;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;

    public Carrinho(){
        this.produtos = new ArrayList<>();
    }
    public void adicionarProdutoAoCarrinho(Produto produto){
        produtos.add(produto);
    }
    public void removerProdutoCarrinho(Produto produto){
        produtos.remove(produto);
    }
    public double calcularTotalCompra(){
        double total = 0;
        for(Produto produto : produtos){
            total += produto.getPreco() + produto.calcularFrete();
        }

        return total;
    }
    public List<String> listarProdutos(){
        List<String> listaProdutos = new ArrayList<>();
        for(Produto produto : produtos){
            listaProdutos.add(produto.toString());
        }
        return listaProdutos;
    }
}
