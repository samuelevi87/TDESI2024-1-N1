package main.java.casosDeExemploAula;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " Está latindo furiosamente!");
    }

    public void marcarTerritorio(){
        System.out.println(getNome() + " esta marcando territorio!");
    }
}
