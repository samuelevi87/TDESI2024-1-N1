package main.java.atividade08;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * Classe abstrata que representa um Produto em uma plataforma de comércio eletrônico.
 */
public abstract class Produto {
    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    private int id;

    private String nome;

    private String descricao;

    private double preco;

    private int estoque;
    /**
     * Construtor da classe Produto que inicializa o nome, a descriação, o preço e o estoque.
     */
    public Produto(String nome, String descricao, double preco, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    /**
     * Cria métodos getters e setters para todos os atributos;
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    /**
     * Retorna uma representação em string do Produto.
     * @return Uma string contendo o id, nome, descricao, preco e estoque.
     */
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }

    /**
     * Método para atualizar o estoque.
     * @param quantidade
     * @return A quantidade do estoque.
     */
    public int atualizarEstoque(int quantidade) {
        return 0;
    }

    /**
     * Método para calcular o frete.
     * @return O valor do frete.
     */
    public double calcularFrete(){
        return 0.0;
    }
}
