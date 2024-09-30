package main.java;

import main.java.atividade03.Frota;

public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        // Adicionando veículos
        frota.adicionarVeiculo(new Carro("ABC1234", "Fusca", 1975, 50000, 2));
        frota.adicionarVeiculo(new Carro("XYZ5678", "Civic", 2020, 10000, 4));
        frota.adicionarVeiculo(new Caminhao("LMN2345", "Volvo", 2018, 150000, 10));
        frota.adicionarVeiculo(new Caminhao("OPQ6789", "Mercedes", 2019, 80000, 15));
        frota.adicionarVeiculo(new Moto("RST1357", "CB500", 2021, 5000, 500));
        frota.adicionarVeiculo(new Moto("UVW2468", "XRE300", 2022, 2000, 300));
        frota.listarVeiculos();

        // Cálculo de custo de viagem
        double custoViagem = frota.calcularCustoTotalViagem(100);
        System.out.println("Custo total da viagem: R$ " + custoViagem);

        // Removendo um veículo
        frota.removerVeiculo("ABC1234");
        System.out.println("Veículo removido. Lista atual:");
        frota.listarVeiculos();
    }
}
