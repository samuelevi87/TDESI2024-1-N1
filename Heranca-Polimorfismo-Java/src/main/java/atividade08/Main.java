package main.java.atividade08;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Loja e Carrinho
        Loja loja = new Loja();
        Carrinho carrinho = new Carrinho();

        // Adicionando produtos à loja
        ProdutoFisico livro = new ProdutoFisico("Livro", "Livro de programação", 50.0, 10, 0.5, "20x15x3");
        ProdutoDigital eBook = new ProdutoDigital("eBook", "eBook de programação", 30.0, 100, 5, "PDF");
        Servico consultoria = new Servico("Consultoria", "Consultoria de TI", 200.0, 5, 2);

        loja.adicionarProduto(livro);
        loja.adicionarProduto(eBook);
        loja.adicionarProduto(consultoria);

        // Adicionando produtos ao carrinho
        carrinho.adicionarProduto(livro);
        carrinho.adicionarProduto(eBook);

        // Listando itens no carrinho
        System.out.println("Itens no carrinho:");
        carrinho.listarItens();

        // Exibindo total da compra
        System.out.println("Total da compra: R$ " + carrinho.calcularTotal());

        // Listando produtos por categoria na loja
        System.out.println("\nProdutos digitais na loja:");
        loja.listarProdutosPorCategoria(ProdutoDigital.class);

        System.out.println("\nServiços na loja:");
        loja.listarProdutosPorCategoria(Servico.class);
    }
}
