package Exercicio03;

public class Produto {
    private String nome;
    private double preco;
    private int quntidadeEmEstoque;

    public Produto(String descricao, double precoUnico, int quntidadeProduto) {
        this.nome = descricao;
        this.preco = precoUnico;
        this.quntidadeEmEstoque = quntidadeProduto;
    }

    public static String getNome() {
        return nome;
    }

    public static double getPreco() {
        return preco;
    }

    public static int quantidadeEmEstoque() {
    }

    public int getQuntidadeEmEstoque() {
        return quntidadeEmEstoque;
    }
    public void addEstoque(int QuantToAdd){
        this.quntidadeEmEstoque+=QuantToAdd;
    }
    public void removeEstoque(int QuantToRemove){
        if (quntidadeEmEstoque-QuantToRemove>=0){
            this.quntidadeEmEstoque-=QuantToRemove;
        }
        else {
            System.out.println("O estoque não pode ficar negativo");
        }
    }
}
