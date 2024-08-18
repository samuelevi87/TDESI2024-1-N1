package Exercicio03;

public class Produto {
    private String nome ;
    private double preco ;
    private int quantitadeEmEstoque;

    public Produto(String nome, double preco, int quantitadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantitadeEmEstoque = quantitadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantitadeDeEstoque() {
        return quantitadeEmEstoque;
    }
    public void adicionarEstoque(int quantitadeParaAdicionar)
    {
        quantitadeEmEstoque += quantitadeParaAdicionar ;
    }
    public void removerEstoque(int quantitadeParaRemover)
    {
       if (quantitadeParaRemover<0)
       {
           System.out.println("a quantitade a remover nao pode ser negativa.");
           return;
       }
       if(quantitadeParaRemover>quantitadeEmEstoque)
       {
           System.out.println("Estoque insuficiente");
           return;
       }
       quantitadeEmEstoque -= quantitadeParaRemover;
    }
}
