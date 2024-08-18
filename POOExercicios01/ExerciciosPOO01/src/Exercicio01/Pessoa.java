package Exercicio01;

// 1. Criar uma instância da classe Pessoa

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // 2. Exibir o nome e a idade da pessoa
    // Método para exibir o nome e a idade
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    // 3. Alterar a idade da pessoa e exibir novamente
    // Método para alterar a idade
    public void setIdade(int novaIdade) {
        this.idade = idade;
    }
}









