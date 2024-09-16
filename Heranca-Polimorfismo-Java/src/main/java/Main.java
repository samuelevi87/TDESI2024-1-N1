package main.java;

public class Main {

    public static void main(String[] args) {

        Animal leao = new Animal( "Alex" , 22);
        Animal elefante = new Animal("Moacir", 4);
        Animal gato = new Gato("Pedro", 3);
        Animal guaxinim = new Guaxinim("José", 8);
        Animal cachorro = new Cachorro("Fred" , 12);

        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        cachorro.emitirSom();
    }

    //TODO O conteúdo será desenvolvido durante a aula
}
