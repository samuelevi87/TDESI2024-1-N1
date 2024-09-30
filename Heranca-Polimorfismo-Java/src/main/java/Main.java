package main.java;

import main.java.atividade03.Caminhao;
import main.java.atividade03.Carro;
import main.java.atividade03.Frota;
import main.java.atividade03.Moto;

public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();
        frota.adicionarVeiculo(new Caminhao("abcd123", "teste 1", 2011, 53000.0, 20.0));
        frota.adicionarVeiculo(new Caminhao("efgh456", "teste 2", 2001, 42756.5, 15.0));
        frota.adicionarVeiculo(new Carro("ijkl789", "teste 3", 2004, 12000.7, 4));
        frota.adicionarVeiculo(new Carro("mnop123", "teste 4", 2014, 23987.5, 4));
        frota.adicionarVeiculo(new Moto("qrst456", "teste 5", 2016, 8763.5, 200));
        frota.adicionarVeiculo(new Moto("uvwx456", "teste 6", 2013, 4827.5, 250));

        System.out.println("***** LISTA DE VEÍCULOS *****");
        frota.listarVeiculos();
        System.out.println("Custo total de viagem: R$" + frota.calcularCustoDeViagemTotal(100.0));

        frota.removerVeiculo("efgh456");
        frota.removerVeiculo("mnop123");
        frota.removerVeiculo("uvwx456");

        System.out.println("***** LISTA DE VEÍCULOS *****");
        frota.listarVeiculos();
        System.out.println("Custo total de viagem: R$" + frota.calcularCustoDeViagemTotal(100.0));
    }
}
