package main.java.atividade08;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Classe abstrata base para representar um produto no sistema de comércio eletrônico.
 */
public abstract class Produto {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();

    private final int id;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;

    /**
     * Construtor para a classe Produto.
     *
     * @param nome O nome do produto.
     * @param descricao A descrição do produto.
     * @param preco O preço do produto.
     * @param estoque A quantidade em estoque do produto.
     */
    public Produto(String nome, String descricao, double preco, int estoque) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getters e setters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public int getEstoque() { return estoque; }
    public void setEstoque(int estoque) { this.estoque = estoque; }

    /**
     * Atualiza o estoque do produto.
     *
     * @param quantidade A quantidade a ser adicionada (ou subtraída, se negativa) do estoque.
     */
    public void atualizarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    /**
     * Método abstrato para calcular o frete do produto.
     *
     * @return O valor do frete.
     */
    public abstract double calcularFrete();

    @Override
    public String toString() {
        return String.format("Produto{id=%d, nome='%s', descricao='%s', preco=%.2f, estoque=%d}",
                id, nome, descricao, preco, estoque);
    }
}