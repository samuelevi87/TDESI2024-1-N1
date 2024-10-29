package com.loja.gerenciador;

import com.loja.modelo.Produto;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    private final List<Produto> produtos = new ArrayList<>();
    private int proximoId = 1;

    public void criar(Produto produto) {
        produto.setId(proximoId++);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso! ID gerado: " + produto.getId());
    }

    public Produto buscarPorId(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public List<Produto> listarTodos() {
        return new ArrayList<>(produtos);
    }

    public void atualizar(Produto produto) {
        Produto existente = buscarPorId(produto.getId());
        if (existente != null) {
            existente.setNome(produto.getNome());
            existente.setPreco(produto.getPreco());
            existente.setQuantidadeEstoque(produto.getQuantidadeEstoque());
            existente.setCategoria(produto.getCategoria());
        }
    }

    public boolean deletar(int id) {
        return produtos.removeIf(p -> p.getId() == id);
    }
}
