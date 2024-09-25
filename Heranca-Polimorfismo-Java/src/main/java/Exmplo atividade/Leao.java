package main.java;

public class Leao extends Animal {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("Roarr");
    }

    public void rugir(){
        System.out.println(getNome()+" está rugindo ferozmente");
    }

}
