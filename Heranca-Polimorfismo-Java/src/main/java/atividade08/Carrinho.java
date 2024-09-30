import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    // Adiciona produto ao carrinho
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Remove produto do carrinho
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    // Calcula o total da compra (preço + frete)
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco() + produto.calcularFrete();
        }
        return total;
    }

    // Lista todos os itens no carrinho
    public void listarItens() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
