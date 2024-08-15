package Exercicio03;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String descricao, double precoPrecoUnitario, int quantidadeDoproduto){
        this.nome = descricao;
        this.preco = precoPrecoUnitario;
        this.quantidadeEmEstoque = quantidadeDoproduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void adicionaEstoque(int quantidadeParaAdiconar) {
        this.quantidadeEmEstoque += quantidadeParaAdiconar;
    }
    public void removerEstoque(int quantidadeParaRemover){
        if (quantidadeEmEstoque - quantidadeParaRemover >= 0) {
            this.quantidadeEmEstoque -= quantidadeParaRemover;
        }else{
            System.out.println("O estoque não pode ficar negativo!");
        }
    }
}
