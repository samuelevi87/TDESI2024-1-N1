package main.java.atividade08;

public class Servico extends Produto{
    private int duracaoEstimada;
    /**
     * Constrói um Produto
     *
     * @param nome      nome do produto
     * @param descricao descrição do produto
     * @param preco     preço do produto
     * @param estoque   quantidade de estoque do produto
     */
    public Servico(String nome, String descricao, double preco, int estoque, int duracaoEstimada) {
        super(nome, descricao, preco, estoque);
        this.duracaoEstimada = duracaoEstimada;
    }

    /**
     * Calcula o frete sendo uma taxa fixa de 15
     * @return frete
     */
    @Override
    public double calcularFrete() {
        return 15;
    }

    public int getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public void setDuracaoEstimada(int duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }
}
