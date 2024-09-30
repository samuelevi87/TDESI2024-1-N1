import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> estoque;

    public Loja() {
        this.estoque = new ArrayList<>();
    }

    // Adiciona produtos ao estoque
    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    // Remove produtos do estoque
    public void removerProduto(Produto produto) {
        estoque.remove(produto);
    }

    // Busca produtos por nome
    public Produto buscarProduto(String nome) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    // Lista produtos por categoria
    public void listarProdutosPorCategoria(Class<?> categoria) {
        for (Produto produto : estoque) {
            if (categoria.isInstance(produto)) {
                System.out.println(produto);
            }
        }
    }
}
