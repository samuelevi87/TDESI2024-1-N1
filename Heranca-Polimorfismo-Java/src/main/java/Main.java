package main.java;

public class Main {

    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 22);
        Animal elefante = new Elefante("Moacir", 4);
        Animal gato = new Gato("Pedro", 3);
        Animal guaxinim = new Guaxinim("José", 8);
        Animal cachorro = new Cachorro("Alemao", 4);

        System.out.println();
        System.out.println("**** Animais emitindo sons ***");
        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        cachorro.emitirSom();

        System.out.println();
        System.out.println("**** Animais comendo ****");
        leao.comer();
        elefante.comer();
        gato.comer();
        guaxinim.comer();
        cachorro.comer();

        System.out.println();
        System.out.println("**** Animais com métodos específicos ****");

        Animal[] listaDeAnimais = {
                new Leao("Léo", 12),
                new Elefante("Dumbo", 15),
                new Gato("Gus", 2),
                new Cachorro("Max", 6),
                new Guaxinim("Ted", 15)
        };

        for (Animal animal:listaDeAnimais) {
            if (animal instanceof Leao){
                ((Leao) animal).rugir();
            } else if (animal instanceof Elefante){
                ((Elefante) animal).usarTromba();
            } else if (animal instanceof Gato){
                ((Gato) animal).derrubarCopo();
            } else if (animal instanceof Cachorro){
                ((Cachorro) animal).roerOsso();
            } else if (animal instanceof Guaxinim){
                ((Guaxinim) animal).roubarComida();
            }
        }
    }
}