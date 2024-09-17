package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm
    public static void main(String[] args) {


        Animal leao = new Leao("Alex", 22);
        Animal cachorro=new Animal("Amora", 1);
        Animal elefante =new Elefante("Bolota",3);
        Animal gato=new Animal("Nina",7);
        Animal guaxinim = new Animal("maicon",5);

        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        cachorro.comer();

        Animal[] listaDeAnimais = {
                new Leao("leo", 12),
                new Elefante("jorge", 3),
                new Cachorro("fred", 6),
                new Gato("nina", 8),
                new Guaxinim("ladrão", 91)
        };

        for (Animal animal:listaDeAnimais){
            if ( animal instanceof Elefante){
                ((Elefante) animal).usartromba();
            }
            if ( animal instanceof Gato){
                ((Gato) animal).selambendo();
            }
            if ( animal instanceof Cachorro){
                ((Cachorro) animal).brincandoBolinha();
            }
            if ( animal instanceof Guaxinim){
                ((Guaxinim) animal).roubando();
            }
            if ( animal instanceof Leao){
                ((Leao) animal).rugir();
            }

        }
    }
    //TODO O conteúdo será desenvolvido durante a aula
}
