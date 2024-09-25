package main.java;

import main.java.atividade03.*;

public class Main {
    public static void main(String[] args) {

        Frota frota1 = new Frota();

        Caminhao caminhao1 = new Caminhao("MKT-2342", "ACTROSS", 2019, 300000.00, 44);
        Caminhao caminhao2 = new Caminhao("MKH-2454", "CONSTALLATION", 2009, 900000.00, 35);
        Carro carro1 = new Carro("KMT-3294", "CELTA", 2012, 132000.00, 5);
        Carro carro2 = new Carro("KSR-3564", "GOL", 2002, 250000.00, 3);
        Moto moto1 = new Moto("MKT-4444", "Titan", 2024, 15000.00);
        Moto moto2 = new Moto("MKT-3053", "Xj6", 2018, 30000.00);

        frota1.adicionarVeiculo(caminhao1);
        frota1.adicionarVeiculo(caminhao2);
        frota1.adicionarVeiculo(carro1);
        frota1.adicionarVeiculo(carro2);
        frota1.adicionarVeiculo(moto1);
        frota1.adicionarVeiculo(moto2);

        frota1.removerVeiculo(caminhao1);

        System.out.println("O CUSTO DE VIAGEM DA FROTA INTEIRA: " + frota1.custoTotalViagemFrota(1000));
    }
}
