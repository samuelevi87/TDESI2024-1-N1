package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm
    public static void main(String[] args) {
        Animal Leao = new Leao("Alex", 22);
        Animal cachorro=new Animal("Amora", 1);
        Animal Elefante =new Elefante("Bolota",3);
        Animal gato=new Animal("Nina",7);
        Animal guaxinim = new Animal("maicon",5);

        Leao.emitirSom();
        cachorro.emitirSom();
        Elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();

    }
    //TODO O conteúdo será desenvolvido durante a aula
}
