package main.java.casosDeExemploAula;

public class Gato extends Animal{
    public Gato(String name, int idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("MIAU!");
    }

    public void brincar(){
        System.out.println(getNome() + " está brincando com uma bola de meia!");
    }
}
