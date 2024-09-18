package main.java.AtividadeAnimal;

public class Leao extends Animal {
    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Leao: ROAAAAAAAAAR");
    }

    public void Rugir(){
        System.out.println(getNome() + " está rugindo vorazmente");
    }

}
