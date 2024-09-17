package main.java;

import Cachorro.Cachorro;
import Gato.Gato;
import Guaxinim.Guaxinim;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 22);
        Animal cachorro = new Cachorro("Naruto", 5);
        Animal elefante = new Elefante("Harriet", 69);
        Animal gato = new Gato("Namu", 1);
        Animal guaxinim = new Guaxinim("Rocket", 10);

        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        cachorro.comer();
        System.out.println("****Animais comendo****");

        Animal[] ListaDeAnimais = {
                new Leao("Léo", 12),
                new Cachorro("Dumbo", 15),
                new Elefante("Gus", 2),
                new Gato("Max", 12),
                new Guaxinim("Leonard", 11),
        };
        for (Animal animal : ListaDeAnimais) {
            if(animal instanceof Leao){
                ((Leao) animal).rugir();
            }if(animal instanceof Cachorro){
                ((Cachorro) animal).lamber();
            }if(animal instanceof Elefante){
                ((Elefante) animal).usarTromba();
            }if(animal instanceof Gato){
                ((Gato) animal).cantar();
            }if(animal instanceof Guaxinim){
                ((Guaxinim) animal).revirarLixo();
            }

        }
    }
}
