package main.java.atividade08;

public class Servico extends Produto {

    private int duracaoEstimada;

    /**
     * Construtor da classe Produto que inicializa o nome, a descriação, o preço e o estoque.
     */
    public Servico(String nome, String descricao, double preco, int estoque, int duracaoEstimada) {
        super(nome, descricao, preco, estoque);
        this.duracaoEstimada = duracaoEstimada;
    }

    public int getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public void setDuracaoEstimada(int duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }
    @Override
    public double calcularFrete() {
        return 15;
    }
}
