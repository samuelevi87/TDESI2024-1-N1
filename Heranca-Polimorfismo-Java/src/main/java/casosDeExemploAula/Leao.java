package main.java.casosDeExemploAula;

public class Leao extends Animal{


    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Rugido do leão!");
    }

    public void rugir(){
        System.out.println(getNome() + " esta rugindo ferozmente!");
    }
}
