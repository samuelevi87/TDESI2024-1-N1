package Exercicio01;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa 1: " +
                "seu nome é '" + nome + '\'' +
                " e sua idade é " + idade +
                " anos.";
    }
}
