package main.java.atividade08;

public class Main {
    public static void main(String[] args) {
        /***
         * Criação da loja
         */
        Loja loja = new Loja();

        /***
         * Adicionando produtos ao estoque da loja
         */
        loja.adicionarProduto(new ProdutoFisico
                ("Cadeira", "Cadeira de madeira", 150.0, 10, 5.0, "90x60x40 cm"));
        loja.adicionarProduto(new ProdutoFisico
                ("Mesa", "Mesa de jantar", 300.0, 5, 10.0, "120x80x75 cm"));
        loja.adicionarProduto(new ProdutoDigital
                ("E-book", "Livro digital sobre Java", 30.0, 50, 2.0, "PDF"));
        loja.adicionarProduto(new Servico
                ("Consultoria", "Serviço de consultoria em TI", 200.0, 3, 2));

        /***
         * Criando um carrinho
         */
        Carrinho carrinho = new Carrinho();

        /***
         * Adicionando produtos ao carrinho
         */
        carrinho.adicionarProduto(loja.buscarProdutoPorNome("Cadeira"));
        carrinho.adicionarProduto(loja.buscarProdutoPorNome("E-book"));

        /***
         * Listar produtos no carrinho
         */
        carrinho.listarProdutos();

        /***
         * Calculando total da compra
         */
        double totalCompra = carrinho.calcularTotal();
        System.out.println("Total da compra: R$ " + totalCompra);

        /***
         * Remover um produto do carrinho
         */
        carrinho.removerProduto(1); // Removendo a Cadeira (ID 1)

        /***
         * Listar produtos no carrinho após remoção
         */
        carrinho.listarProdutos();

        /***
         * Adicionando um serviço ao carrinho
         */
        carrinho.adicionarProduto(loja.buscarProdutoPorNome("Consultoria"));

        /***
         * Calculando o novo total da compra
         */
        totalCompra = carrinho.calcularTotal();
        System.out.println("Total da compra após adicionar o serviço: R$ " + totalCompra);
    }
}
