package Cachorro;

import main.java.Animal;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Woof");
    }

    public void lamber(){
        System.out.println(getNome() + " está se lambendo!🐶");
    }
}
