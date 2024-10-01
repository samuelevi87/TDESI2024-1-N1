package main.java.atividade08;

/**
 * Classe que representa um produto físico.
 */
public class CorrecaoProdutoFisico extends CorrecaoProduto {
    private double peso;
    private String dimensoes;

    /**
     * Construtor para a classe ProdutoFisico.
     *
     * @param nome      O nome do produto.
     * @param descricao A descrição do produto.
     * @param preco     O preço do produto.
     * @param estoque   A quantidade em estoque do produto.
     * @param peso      O peso do produto em kg.
     * @param dimensoes As dimensões do produto.
     */
    public CorrecaoProdutoFisico(String nome, String descricao, double preco, int estoque, double peso, String dimensoes) {
        super(nome, descricao, preco, estoque);
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    // Getters e setters específicos
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    @Override
    public double calcularFrete() {
        return peso * 5 + 10;
    }
}
