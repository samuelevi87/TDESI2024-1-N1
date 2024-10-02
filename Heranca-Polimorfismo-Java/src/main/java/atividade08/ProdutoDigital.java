package main.java.atividade08;

public class ProdutoDigital extends Produto{
    private double tamanhoArquivo; // em MB
    private String formatoArquivo;

    public ProdutoDigital(String nome, String descricao, double preco, int estoque, double tamanhoArquivo, String formatoArquivo) {
        super(nome, descricao, preco, estoque);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formatoArquivo = formatoArquivo;
    }

    @Override
    public double calcularFrete() {
        return 0;
    }

    // Getters e Setters
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
}
