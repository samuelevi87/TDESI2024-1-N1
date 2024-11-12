package com.Loja.modelo.Produto ;
import java.util.Objects;

public class Produto {
    private static int contadorId = 1 ;
    private  int id ;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String categoria ;

    public  Produto(String nome , double preco , int quantidadeEstoque ,String categoria ){
        this.id = contadorId++;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }

    public int getId () {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome (){
        return  nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public double getPreco (){
        return  preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCategoria (){
        return  categoria;
    }

    public void setCategoria (String categoria){
        this.categoria = categoria ;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + " | Nome: " + getNome() + " | Preço: R$ " + getPreco() +
                " | Estoque: " + getQuantidadeEstoque() + " | Categoria: " + getCategoria();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
