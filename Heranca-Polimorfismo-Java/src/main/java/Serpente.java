package main.java;

public class Serpente extends Animal {
    public Serpente(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": sssssss");
    }

    public void estrangula(){
        System.out.println(getNome() + " está estrangulando");
    }
}
