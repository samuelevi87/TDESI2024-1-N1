package main.java.atividade08;

/***
 * Classe que representa um produto digital.
 */
public class ProdutoDigital extends Produto {
    private double tamanhoArquivo;
    private String formatoArquivo;

    /***
     * Construtor que inicializa os atributos do produto digital.
     *
     * @param nome            Nome do produto
     * @param descricao       Descrição do produto
     * @param preco           Preço do produto
     * @param estoque         Estoque do produto
     * @param tamanhoArquivo  Tamanho do arquivo
     * @param formatoArquivo  Formato do arquivo
     */
    public ProdutoDigital(String nome, String descricao, double preco, int estoque, double tamanhoArquivo, String formatoArquivo) {
        super(nome, descricao, preco, estoque);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formatoArquivo = formatoArquivo;
    }

    @Override
    public double calcularFrete() {
        return 0;
    }
}
