package main.java.atividade08;

/**
 * Classe abstrata que representa um produto genérico
 */
public abstract class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;

    private static int contadorId = 0;

    /**
     * Constrói um Produto
     * @param nome nome do produto
     * @param descricao descrição do produto
     * @param preco preço do produto
     * @param estoque quantidade de estoque do produto
     */
    public Produto(String nome, String descricao, double preco, int estoque) {
        this.id = contadorId++;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    /**
     * Atualiza a quantidade do estoque
     * @param quantidade nova quantidade
     */
    public void atualizarEstoque(int quantidade){
        this.estoque = quantidade;
    }

    /**
     * Método abstrato para calcular frete
     * @return
     */
    public abstract double calcularFrete();

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

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Produto.contadorId = contadorId;
    }

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
}
