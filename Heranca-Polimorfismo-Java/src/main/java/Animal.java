package main.java;

public abstract class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade){
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

    public void emitirSom(){
        System.out.println("Som do animal");
    }
    //TODO Atributos, construtor e métodos básicos serão adicionados durante a aula

}