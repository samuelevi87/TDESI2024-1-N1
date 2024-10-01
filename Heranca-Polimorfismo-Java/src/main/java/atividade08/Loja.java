package main.java.atividade08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Loja {
    private List<Produto> estoque;

    public Loja(){
        this.estoque = new ArrayList<>();
    }
    public void adicionarProdutoAoEstoque(Produto produto){
        estoque.add(produto);
    }
    public void removerProdutoEstoque(Produto produto){
        estoque.remove(produto);
    }
    public List<Produto> buscarProdutoPorNome(String nome){
        return estoque.stream()
                .filter(p -> p.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }
    public List<Produto> listarPorCategoriaSimples(Class<? extends Produto> categoria) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto p : estoque) {
            if (categoria.isInstance(p)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

}
