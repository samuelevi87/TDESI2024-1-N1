package main.java;

public class Gato extends Animal{
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("minhauu");
    } public void selambendo(){
        System.out.println(getNome() + "está se lambendo");
    }
}
