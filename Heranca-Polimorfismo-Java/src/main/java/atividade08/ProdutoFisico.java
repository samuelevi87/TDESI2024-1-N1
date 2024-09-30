package main.java.atividade08;

/**
 * Representa um produto físico
 */
public class ProdutoFisico extends  Produto{
    private double peso;
    private String dimensoes;

    /**
     * Constrói um ProdutoFisico
     *
     * @param nome      nome do produto
     * @param descricao descrição do produto
     * @param preco     preço do produto
     * @param estoque   quantidade de estoque do produto
     * @param peso      peso do produto em kg
     * @param dimensoes dimensões do produto
     */
    public ProdutoFisico(String nome, String descricao, double preco, int estoque, double peso, String dimensoes) {
        super(nome, descricao, preco, estoque);
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    /**
     * Calcula o frete sendo 5 vezes o peso mais 10 reais
     * @return
     */
    @Override
    public double calcularFrete() {
        return peso * 5 + 10;
    }

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
}
