package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm

    public static void main(String[] args) {

        Animal leao = new Leao("alex", 22);
        Animal cachorro = new Cachorro("Totó", 5);
        Animal elefante = new Elefante("Moacir", 4);
        Animal gato = new Gato("Pedro", 3);
        Animal guaxinim = new Guaxinim("jose", 8);

        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        System.out.println("****Animais****");
        Animal[] ListaDeAnimais = {
                new Leao("Alex", 15),
                new Elefante("Trombudo", 25),
                new Gato("Miau", 4),
                new Cachorro("tótó", 8),
                new Guaxinim("xibiu", 8),

        };
        for (Animal animal : ListaDeAnimais) {
            if (animal instanceof Leao) {
                ((Leao) animal).rugir();
            }
            if (animal instanceof Gato) {
                ((Gato) animal).quebrouVaso();
            }
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).Defecou();
            }
            if (animal instanceof Elefante) {
                ((Elefante) animal).usarTromba();
            }
            if (animal instanceof Guaxinim) {
                ((Guaxinim) animal).rasgouLixo();
                //TODO O conteúdo será desenvolvido durante a aula
            }
        }
    }
}