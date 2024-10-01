package main.java.atividade08;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja(){
        this.produtos = new ArrayList<>();
    }
    public void adicionarProdutoAoEstoque(Produto produto){
        produtos.add(produto);
    }
    public void removerProdutoEstoque(Produto produto){
        produtos.remove(produto);
    }
    public Produto buscarProdutoPorNome(String nome){
        return produtos.stream().filter(produto -> produto.getNome().equalsIgnoreCase(nome)).findFirst().get();
    }

}
