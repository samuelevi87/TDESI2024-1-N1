package main.java;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Animal("Alex", 22);
        Animal cachorro = new Animal("Naruto", 5);
        Animal gato = new Animal("Yoon", 4);

        leao.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
    }
}
