package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm
    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 22);
        Animal elefante = new Elefante("Moacir", 4);
        Animal gato = new Gato("Pedro", 3);
        Animal guaxinim = new Guaxinim("José", 8);
        Animal cachorro = new Cachorro("Luke", 12);
        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        cachorro.emitirSom();
    }
    //TODO O conteúdo será desenvolvido durante a aula


}
