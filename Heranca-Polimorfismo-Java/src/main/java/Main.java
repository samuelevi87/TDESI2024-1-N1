package main.java;

import main.java.atividade03.Caminhao;
import main.java.atividade03.Carro;
import main.java.atividade03.Frota;
import main.java.atividade03.Moto;

public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();
        frota.adicionarVeiculo(new Caminhao("ABC1234", "Volvo FH", 2015, 78000.0, 25.0));
        frota.adicionarVeiculo(new Caminhao("DEF5678", "Scania R450", 2012, 120000.0, 18.5));
        frota.adicionarVeiculo(new Carro("GHI9012", "Honda Civic", 2018, 34000.3, 4));
        frota.adicionarVeiculo(new Carro("JKL3456", "Toyota Corolla", 2020, 15000.2, 4));
        frota.adicionarVeiculo(new Moto("MNO7890", "Yamaha XJ6", 2019, 12000.7, 600));
        frota.adicionarVeiculo(new Moto("PQR2345", "Honda CB500", 2017, 9500.4, 500));

        System.out.println("******* LISTA DE VEÍCULOS *******");
        frota.listarVeiculos();
        System.out.println("- Custo total de viagem: R$" + frota.calcularCustoViagem(100.0));

        frota.removerVeiculo("efgh456");
        frota.removerVeiculo("mnop123");
        frota.removerVeiculo("uvwx456");

        System.out.println("\n******* LISTA DE VEÍCULOS *******");

        frota.listarVeiculos();
        System.out.println("- Custo total de viagem: R$" + frota.calcularCustoViagem(100.0));
    }
}
