package main.java;

import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;
import main.java.atividade01.CorrecaoEmpresa;
import main.java.atividade01.CorrecaoGerente;

public class Main {
    public static void main(String[] args) {
        CorrecaoAtividade01();
    }

    private static void CorrecaoAtividade01() {
        // Código para testar a atividade 01
        CorrecaoEmpresa empresa = new CorrecaoEmpresa();


        Animal leao = new Leao("Alex", 22);
        Animal elefante = new Elefante("Moacir", 4);
        Animal gato = new Gato("Pedro", 3);
        Animal guaxinim = new Guaxinim("José", 8);
        Animal cachorro = new Cachorro("Angel", 2);

        System.out.println("********Animais emitindo sons********");
        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        cachorro.emitirSom();
        guaxinim.emitirSom();
        System.out.println("********Animais comendo********");
        leao.comer();
        elefante.comer();
        gato.comer();
        cachorro.comer();
        guaxinim.comer();
        System.out.println("********Animais executando ações********");

        //array para todos os animais
        Animal[] listaAnimais = {
                new Leao("Mango", 7),
                new Elefante("Dumbo", 9),
                new Gato("Marrie", 3),
                new Cachorro("Alemão", 3),
                new Guaxinim("Pedro P.", 4)
        };

        //
        for (Animal animal:listaAnimais){
            if (animal instanceof Leao){
                ((Leao) animal).rugir();
            } else if (animal instanceof Elefante) {
                ((Elefante) animal).usarAtromba();
            }else if (animal instanceof Gato) {
                ((Gato) animal).ronronar();
            }else if (animal instanceof Cachorro) {
                ((Cachorro) animal).dormir();
            }else if (animal instanceof Guaxinim) {
                ((Guaxinim) animal).dancar();
            }
        }
    }
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
