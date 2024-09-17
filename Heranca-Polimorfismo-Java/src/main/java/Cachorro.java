package main.java;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("auauauauaua (latindo)");
    }
    @Override
    public void comer(){
        System.out.println(getNome()+" esta comedo ração");
    }
    public void latindo(){
        System.out.println(getNome()+" esta latindo para a vizinhança toda");
    }
}
