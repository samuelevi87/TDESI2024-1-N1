package main.java;

public class Main {
    public static void main(String[] args) {

        Animal leao = new Animal("Leão", 2);
        Animal cachoro = new Animal("Tobi", 17);
        Animal gato = new Animal("Xinim", 5);

        leao.emitirSom();
        cachoro.emitirSom();
        gato.emitirSom();

    }
}
