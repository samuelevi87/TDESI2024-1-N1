package main.java.atividade08;

/**
 * Subclasse que representa um produto digital, estendendo a classe abstrata Produto.
 */
public class ProdutoDigital extends Produto{
    private double tamanhoArquivo;

    private String formatoArquivo;

    /**
     * Construtor da classe Produto que inicializa o nome, a descriação, o preço, o estoque, o tamanho do arquivo e o formato do arquivo.
     */
    public ProdutoDigital(String nome, String descricao, double preco, int estoque) {
        super(nome, descricao, preco, estoque);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formatoArquivo = formatoArquivo;
    }

    /**
     * Método para calcular o frete.
     * @return 0, pois para produto digital não é necessário frete.
     */
    @Override
    public double calcularFrete() {
        return 0;
    }
}
