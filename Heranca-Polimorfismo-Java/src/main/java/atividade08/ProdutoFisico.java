package main.java.atividade08;

/***
 * Classe que representa um produto físico.
 */
public class ProdutoFisico extends Produto {
    private double peso;
    private String dimensoes;

    /***
     * Construtor que inicializa os atributos do produto físico.
     *
     * @param nome        Nome do produto
     * @param descricao   Descrição do produto
     * @param preco       Preço do produto
     * @param estoque     Estoque do produto
     * @param peso       Peso do produto
     * @param dimensoes  Dimensões do produto
     */
    public ProdutoFisico(String nome, String descricao, double preco, int estoque, double peso, String dimensoes) {
        super(nome, descricao, preco, estoque);
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    @Override
    public double calcularFrete() {
        return peso * 5 + 10;
    }
}
