package main.java;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override

    public void emitirSom() {
        System.out.println("tótó");
    }
    public void Defecou(){
        System.out.println("Defecou da garagem");
    }
}
