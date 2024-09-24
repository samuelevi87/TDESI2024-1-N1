package main.java;

<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {

        Animal leao = new Leao("Alex", 22);
        Animal cachorro = new Cachorro("Yuke", 5);
        Animal elefante = new Elefante("Sebastian", 3);
        Animal gato = new Gato("Robson", 12);
        Animal guaxinim = new Guaxinim("Roberto", 21);

        leao.emitirSom();
        elefante.emitirSom();
        cachorro.emitirSom();
        guaxinim.emitirSom();
        gato.emitirSom();
        //---
        cachorro.comer();
        //-----
        Animal[] listaDeAnimais = {
                new Leao("Alex", 22),
                new Cachorro("Yuke", 5),
                new Elefante("Sebastian", 3),
                new Gato("Robson", 12),
                new Guaxinim("Roberto", 21)
        };

        for (Animal animal:listaDeAnimais){
             if(animal instanceof Elefante){
                ((Elefante) animal).usarTromba();
             }
            if(animal instanceof Cachorro){
                ((Cachorro) animal).brincando();
            }
            if(animal instanceof Gato){
                ((Gato) animal).cacando();
            }
            if(animal instanceof Leao){
                ((Leao) animal).rugir();
            }
            if(animal instanceof Guaxinim){
                ((Guaxinim) animal).comendoLixo();
            }
        }
    }
=======
import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;
import main.java.atividade01.CorrecaoEmpresa;
import main.java.atividade01.CorrecaoGerente;
>>>>>>> 19fe72654a91fd792ff9c04e62fca9d2b855dec3

public class Main {
    public static void main(String[] args) {
        CorrecaoAtividade01();
    }

    private static void CorrecaoAtividade01() {
        // Código para testar a atividade 01
        CorrecaoEmpresa empresa = new CorrecaoEmpresa();

        empresa.adicionarFuncionario(new CorrecaoDesenvolvedor("Ana Silva", 1, 5000, "Java"));
        empresa.adicionarFuncionario(new CorrecaoDesenvolvedor("Carlos Santos", 2, 5500, "Python"));
        empresa.adicionarFuncionario(new CorrecaoGerente("Maria Oliveira", 3, 8000, 10000));
        empresa.adicionarFuncionario(new CorrecaoGerente("João Pereira", 4, 8500, 12000));
        empresa.adicionarFuncionario(new CorrecaoAnalistaQA("Pedro Costa", 5, 4500, 50));
        empresa.adicionarFuncionario(new CorrecaoAnalistaQA("Lúcia Ferreira", 6, 4800, 60));

        System.out.println("Lista de Funcionários:");
        empresa.listarFuncionarios();

        System.out.println("\nFolha de Pagamento Total: R$" +
                String.format("%.2f", empresa.calcularFolhaPagamentoTotal()));
    }
}
