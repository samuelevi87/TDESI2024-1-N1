package Exercicio03;

public class Produto {
   private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome=nome;
        this.preco=preco;
        this.quantidadeEmEstoque=quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque += quantidadeEmEstoque;
    }
    public void removerEstoque(int quantidadeEmEstoque) {
       if(this.quantidadeEmEstoque>quantidadeEmEstoque) {
           this.quantidadeEmEstoque -=quantidadeEmEstoque;
        }else{
            System.out.println("n pode ser negativo");
        }
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
}
