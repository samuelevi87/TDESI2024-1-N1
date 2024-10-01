package main.java.atividade08;

public class ProdutoFisico extends Produto {

    private double peso; // em kg
    private String dimensoes;

    public ProdutoFisico(String nome, String descricao, double preco, int estoque, double peso, String dimensoes) {
        super(nome, descricao, preco, estoque);
        this.peso = peso;
        this.dimensoes = dimensoes;
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

    @Override
    public double calcularFrete() {
        return peso * 5 + 10; // Cálculo do frete
    }

}
