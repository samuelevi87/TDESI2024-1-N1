package Exercicio01;

public class Pessoa {
    // Exercício 1:
    // 1. Criar uma instância da classe Pessoa.
    // 2. Exibir o nome e a idade da pessoa.
    // 3. Alterar a idade da pessoa e exibir novamente.

    int idade;
    String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        System.out.println(idade);
        return idade;
    }

    public String getNome() {
        System.out.println(nome);
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
