package main.java.casosDeExemploAula;

public class Guaxinim extends Animal{
    public Guaxinim(String name, int idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Guaxinim!");
    }

    public void cantar(){
        System.out.println(getNome() + " está cantando Pedro!");
    }
}
