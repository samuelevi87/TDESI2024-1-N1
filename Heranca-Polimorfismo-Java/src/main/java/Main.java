package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm

    public static void main(String[] args) {

        Animal leao = new Leao("alex", 22);
        Animal cachorro = new Cachorro("Totó", 5);
        Animal elefante = new Elefante("Moacir", 4);
        Animal gato = new Gato("Pedro", 3);
        Animal guaxinim = new Guaxinim("Pedro", 2);


        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        System.out.println("****Animais comendo****");
        Animal[] listaDeAnimals = {
                new Leao("Akon", 15),
                new Cachorro("Thor", 15),
                new Elefante("Bud", 15),
                new Gato("Alvin", 15),
                new Guaxinim("Men", 15)
        };

        for (Animal animal : listaDeAnimals) {
            if (animal instanceof Leao) {
                ((Leao) animal).rugir();
            }
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).marcarTerritorio();
            }
            if (animal instanceof Elefante) {
                ((Elefante) animal).usarTromba();
            }
            if (animal instanceof Gato) {
                ((Gato) animal).derrubarCopo();
            }
            if (animal instanceof Guaxinim) {
                ((Guaxinim) animal).roubarComida();
            }
        }
        //TODO O conteúdo será desenvolvido durante a aula
    }
}