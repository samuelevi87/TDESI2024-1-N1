package main.java.atividade08;

/***
 * Classe base abstrata que representa um produto.
 */
public abstract class Produto {
    private static int contador = 1;
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;

    /***
     * Construtor que inicializa os atributos do produto.
     *
     * @param nome      Nome do produto
     * @param descricao Descrição do produto
     * @param preco     Preço do produto
     * @param estoque   Estoque do produto
     */
    public Produto(String nome, String descricao, double preco, int estoque) {
        this.id = contador++;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getters e Setters
    public int getId() {
        return id;
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

    /***
     * Atualiza o estoque do produto.
     *
     * @param quantidade Quantidade a ser adicionada ou removida
     */
    public void atualizarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    /***
     * Método abstrato para calcular o frete.
     *
     * @return O valor do frete
     */
    public abstract double calcularFrete();
}
