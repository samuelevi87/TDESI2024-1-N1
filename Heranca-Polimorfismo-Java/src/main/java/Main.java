package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm

    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 22);
        Animal cachorro = new Cachorro("Totó", 5);
        Animal elefante = new Elefante("Moacir", 4);
        Animal gato = new Gato("Garfield", 3);
        Animal guaxinim = new Guaxinim("José", 8);

        System.out.println("****Animais emitindo sons****");
        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();

        System.out.println("****Animais comendo****");
        leao.comer();
        cachorro.comer();
        elefante.comer();
        gato.comer();
        guaxinim.comer();

        Animal[] animais = {
                leao,
                elefante,
                cachorro,
                gato,
                guaxinim
        };

        for(Animal animal:animais) {
            if (animal instanceof Leao) {
                ((Leao) animal).rugir();
            } else if (animal instanceof Elefante) {
                ((Elefante) animal).usarTromba();
            } else if(animal instanceof Gato) {
                ((Gato) animal).miar();
            } else if(animal instanceof Guaxinim) {
                ((Guaxinim) animal).grasnar();
            } else if(animal instanceof Cachorro) {
                ((Cachorro) animal).latir();
            }
        }
    }

    //TODO O conteúdo será desenvolvido durante a aula
}
