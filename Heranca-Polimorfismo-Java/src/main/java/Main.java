package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm

    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 22);
        Animal cachorro = new Cachorro("Totó", 5);
        Animal elefante = new Elefante("Moacir", 4);
        Animal gato = new Gato("Garfield", 3);
        Animal guaxinim = new Guaxinim("José", 8);

        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
    }

    //TODO O conteúdo será desenvolvido durante a aula
}
