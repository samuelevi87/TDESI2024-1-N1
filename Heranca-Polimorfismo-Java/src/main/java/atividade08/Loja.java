package main.java.atividade08;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Loja {
    private List<Produto> estoque;

    public Loja() {
        this.estoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    public void removerProduto(Produto produto) {
        estoque.remove(produto);
    }

    public List<Produto> buscarPorNome(String nome) {
        return estoque.stream()
                .filter(produto -> produto.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toList());
    }

    public List<Produto> listarPorCategoria(Class<? extends Produto> tipo) {
        return estoque.stream()
                .filter(tipo::isInstance)
                .collect(Collectors.toList());
    }

    public List<Produto> getEstoque() {
        return estoque;
    }
}
