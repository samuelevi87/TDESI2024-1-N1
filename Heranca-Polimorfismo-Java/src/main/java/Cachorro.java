package main.java;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("au au au au au au au au au au au au au au au au au au au au au au au au au au au au au au auuuuuu");
    }
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo ração");
    }
    public void dormir(){
        System.out.println(getNome() + " está dormindo zzz");
    }
}
