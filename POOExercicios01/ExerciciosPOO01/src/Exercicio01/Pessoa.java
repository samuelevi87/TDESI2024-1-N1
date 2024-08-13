package Exercicio01;

public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String _nome, int _idade) {
        this.nome = _nome;
        this.idade = _idade;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

