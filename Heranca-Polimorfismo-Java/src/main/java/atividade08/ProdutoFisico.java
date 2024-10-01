package main.java.atividade08;

/**
 * Subclasse que representa um produto físico, estendendo a classe abstrata Produto.
 */
public class ProdutoFisico extends Produto {

    private double peso;

    private String dimensoes;


    /**
     * Construtor da classe Produto que inicializa o nome, a descriação, o preço, estoque, peso e dimensoes.
     */
    public ProdutoFisico(String nome, String descricao, double preco, int estoque) {
        super(nome, descricao, preco, estoque);
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    /**
     * Método para calcular o frete.
     * Calcula o frete multiplicando o peso do produto por 5 e adicionando 10.
     * @return O valor do frete.
     */
    @Override
    public double calcularFrete() {
        return peso * 5 + 10;
    }
}
