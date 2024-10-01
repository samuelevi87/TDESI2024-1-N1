package main.java.atividade08;

/**
 * Classe que representa um produto digital.
 */
public class CorrecaoProdutoDigital extends CorrecaoProduto {
    private double tamanhoArquivo;
    private String formatoArquivo;

    /**
     * Construtor para a classe ProdutoDigital.
     *
     * @param nome           O nome do produto.
     * @param descricao      A descrição do produto.
     * @param preco          O preço do produto.
     * @param estoque        A quantidade em estoque do produto.
     * @param tamanhoArquivo O tamanho do arquivo em MB.
     * @param formatoArquivo O formato do arquivo.
     */
    public CorrecaoProdutoDigital(String nome, String descricao, double preco, int estoque, double tamanhoArquivo, String formatoArquivo) {
        super(nome, descricao, preco, estoque);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formatoArquivo = formatoArquivo;
    }

    // Getters e setters específicos
    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    @Override
    public double calcularFrete() {
        return 0;
    }
}