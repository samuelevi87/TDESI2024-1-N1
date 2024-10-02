package main.java.atividade08;

/**
 * Classe que representa um serviço.
 */
public class Servico extends Produto {
    private int duracaoEstimada;

    /**
     * Construtor para a classe Servico.
     *
     * @param nome            O nome do serviço.
     * @param descricao       A descrição do serviço.
     * @param preco           O preço do serviço.
     * @param estoque         A quantidade disponível do serviço.
     * @param duracaoEstimada A duração estimada do serviço em horas.
     */
    public Servico(String nome, String descricao, double preco, int estoque, int duracaoEstimada) {
        super(nome, descricao, preco, estoque);
        this.duracaoEstimada = duracaoEstimada;
    }

    // Getter e setter específico
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