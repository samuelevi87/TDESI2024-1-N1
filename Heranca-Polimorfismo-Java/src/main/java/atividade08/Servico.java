package main.java.atividade08;

public class Servico extends Produto{
    private int duracaoEstimada; // em horas

    public Servico(String nome, String descricao, double preco, int estoque, int duracaoEstimada) {
        super(nome, descricao, preco, estoque);
        this.duracaoEstimada = duracaoEstimada;
    }

    @Override
    public double calcularFrete() {
        return 15; // taxa fixa
    }

    // Getters e Setters
    public int getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public void setDuracaoEstimada(int duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }
}
