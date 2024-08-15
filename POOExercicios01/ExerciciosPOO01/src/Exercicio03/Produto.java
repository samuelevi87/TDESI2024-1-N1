package Exercicio03;

import java.sql.SQLOutput;

public class Produto {

    String nome;
    double preco;
    int quantidadeEmEstoque;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarEstoque(int valor) {
        this.quantidadeEmEstoque = valor + this.quantidadeEmEstoque;
    }

    public void removerEstoque(int valor) {
        if (this.quantidadeEmEstoque < valor){
            System.out.println("Valor informado menor que valor em estoque");
        } else {
            this.quantidadeEmEstoque -= valor;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Nome =' " + nome + '\'' +
                ", Preco = " + preco +
                ", Estoque = " + quantidadeEmEstoque +
                '}';
    }
}
