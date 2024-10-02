package main.java.atividade08;
import java.util.concurrent.atomic.AtomicInteger;

public class Produto {
    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    private final int id;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;

    public Produto(String nome, String descricao, double preco, int estoque) {
        this.id = idGenerator.incrementAndGet();
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

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

    public void atualizarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    public double calcularFrete() {
        return 0;
    }
}

