package Exercicio01;

public class Pessoa {

    private String nome;
    private  int idade;
    public Pessoa(){

    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Ruan", 20);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.setIdade(60);
        System.out.println("Idade após alteração: " + pessoa.getIdade());

    }
}
