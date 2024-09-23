package main.java;

public class Animal {
    private String nome;
    private int idade;

    public Animal (String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void emitirSom(){
        System.out.println("som generico do animal");
    }
    public void comer(){
        System.out.println(getNome() + "esta comendo");
    }

    //TODO Atributos, construtor e métodos básicos serão adicionados durante a aula

}
