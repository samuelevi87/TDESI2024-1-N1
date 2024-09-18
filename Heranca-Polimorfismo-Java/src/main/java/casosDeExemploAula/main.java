package main.java.casosDeExemploAula;


import main.java.casosDeExemploAula.*;

public class main {
    public static void main(String[] args) {

        Animal leao = new Leao("Bond", 5);
        Animal cachorro = new Animal("Caramelo", 8);
        Animal elefante = new Elefante("José", 2);
        Animal gato = new Gato("Zoe", 3);
        Animal guaxinim = new Guaxinim("Pedro", 5);

        System.out.println("*** Animais emitindo som ***");
        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        System.out.println("*** Animais comendo ***");
        leao.comer();
        cachorro.comer();
        elefante.comer();
        gato.comer();
        guaxinim.comer();
        System.out.println("*** Animais com métodos especificos ***");
        Animal[] listaDeAnimais = {
                new Leao("Leo", 12),
                new Elefante("Dumbo", 15),
                new Gato("Gus", 2),
                new Cachorro("Max", 6),
                new Guaxinim("Ted", 15)
        };

        for (Animal animal:listaDeAnimais){
            if(animal instanceof Leao){
                ((Leao) animal).rugir();
            }
            if(animal instanceof Elefante){
                ((Elefante) animal).usarTromba();
            }
            if(animal instanceof Gato){
                ((Gato) animal).brincar();
            }
            if(animal instanceof Cachorro){
                ((Cachorro) animal).marcarTerritorio();
            }
            if(animal instanceof Guaxinim){
                ((Guaxinim) animal).cantar();
            }

        }


    }
}