package main.java;

public class Main {
    public static void main(String[] args) {

        Animal leao = new Leao("Leão", 2);
        Animal elefante = new Elefante("Xinim", 5);
        Animal gato = new Gato("Pedro", 3);
        Animal guaxinim = new Guaxinim("José" , 8);
        Animal cachorro = new Cachorro("Vacilao", 12);

        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        cachorro.emitirSom();
        cachorro.comer();
        guaxinim.comer();

        Animal [] listaDeAnimais = {
                new Leao("Pedro", 5),
                new Elefante("Santa", 10),
                new Gato ("XInim", 2),
                new Guaxinim("Pata", 23),
                new Cachorro("Tobi", 17)
        };

        for(Animal  animal : listaDeAnimais ) {

            if(animal instanceof  Leao) {
                ((Leao) animal).rugir();
            }
            if(animal instanceof  Elefante) {
                ((Elefante) animal).levantarTrompa();
            }
            if(animal instanceof  Gato) {
                ((Gato) animal).dormir();
            }
            if(animal instanceof  Guaxinim) {
                ((Guaxinim) animal).roubarComid();
            }
            if(animal instanceof  Cachorro) {
                ((Cachorro) animal).correr();
            }


        }

    }
}
