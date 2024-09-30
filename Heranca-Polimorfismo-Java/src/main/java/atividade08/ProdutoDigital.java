package main.java.atividade08;

public class ProdutoDigital extends Produto{
    private double tamanhoArquivo;
    private String formartoArquivo;

    /**
     * Constrói um Produto
     *
     * @param nome      nome do produto
     * @param descricao descrição do produto
     * @param preco     preço do produto
     * @param estoque   quantidade de estoque do produto
     */
    public ProdutoDigital(String nome, String descricao, double preco, int estoque, double tamanhoArquivo, String formatoArquivo) {
        super(nome, descricao, preco, estoque);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formartoArquivo = formatoArquivo;
    }

    /**
     * Calcula o frete, sendo 0
     * @return frete
     */
    @Override
    public double calcularFrete() {
        return 0;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getFormartoArquivo() {
        return formartoArquivo;
    }

    public void setFormartoArquivo(String formartoArquivo) {
        this.formartoArquivo = formartoArquivo;
    }
}
