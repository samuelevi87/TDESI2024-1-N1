package main.java;

import main.java.atividade03.Caminhao;
import main.java.atividade03.Carro;
import main.java.atividade03.Frota;
import main.java.atividade03.Moto;

public class Main {
    public static void main(String[] args) {
        Frota frota1 = new Frota();

        Carro carro1 = new Carro("123abc", "uno", 2011, 180000, 4);
        Carro carro2 = new Carro("435avc", "palio", 2020, 25000, 4);
        Caminhao caminhao1 = new Caminhao("asdasd", "Scania", 550, 11111, 2);
        Caminhao caminhao2 = new Caminhao("aaaa", "11Triste", 1000, 80000000, 2);
        Moto moto1 = new Moto("Man1903", "cg99", 1999, 50000, 150);
        Moto moto2 = new Moto("socorro", "hornet", 2015, 70000, 3000);

        moto1.calcularCustoViagem(400);
        moto2.calcularCustoViagem(100);

        frota1.addFrotaVeiculos(moto1);
        frota1.addFrotaVeiculos(caminhao1);
        frota1.addFrotaVeiculos(carro1);

        frota1.remFrotaVeiculos(carro1);

        frota1.calcularCustoTotalViagem(100000);

    }

}
