package main.java.atividade08;

/***
 * Classe que representa um serviço.
 */
public class Servico extends Produto {
    private int duracaoEstimada;

    /***
     * Construtor que inicializa os atributos do serviço.
     *
     * @param nome            Nome do produto
     * @param descricao       Descrição do produto
     * @param preco           Preço do serviço
     * @param estoque         Estoque do serviço
     * @param duracaoEstimada Duração estimada do serviço
     */
    public Servico(String nome, String descricao, double preco, int estoque, int duracaoEstimada) {
        super(nome, descricao, preco, estoque);
        this.duracaoEstimada = duracaoEstimada;
    }

    @Override
    public double calcularFrete() {
        return 15;
    }
}
