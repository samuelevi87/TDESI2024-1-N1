package main.java;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Leao("Alex",22 );
        Animal elefante = new Elefante("dumbo",4);
        Animal gato = new Gato("Garfild",3);
        Animal Guaxinim = new Gaxinim("Roket", 8);
        Animal cachorro = new Cachorro("minguado", 6);

        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        Guaxinim.emitirSom();
        cachorro.emitirSom();
        System.out.println("****Animais comendo****");
        leao.comer();
        elefante.comer();
        gato.comer();
        Guaxinim.comer();
        cachorro.comer();
        System.out.println("****Animais com metodos especificos****");
        Animal[] listaDeAnimais={
                new Leao("Alex", 12),
                new Elefante("Dumbo", 15),
                new Gato("Garfild",3),
                new Gaxinim("Roket",8),
                new Cachorro("Minguado",6)
        };
        for (Animal animal:listaDeAnimais){
            if(animal instanceof Leao){
                ((Leao)animal).rugir();
            }
            if(animal instanceof  Elefante){
                ((Elefante)animal).usandoSuaTromba();
            }
            if(animal instanceof Gato){
                ((Gato)animal).miando();
            }
            if(animal instanceof  Gaxinim){
                ((Gaxinim) animal).comendoLixo();
            }
            if(animal instanceof Cachorro){
                ((Cachorro)animal).latindo();
            }

        }

    }
    //FIXME Adicione o método main usando o atalho psvm

    //TODO O conteúdo será desenvolvido durante a aula
}
