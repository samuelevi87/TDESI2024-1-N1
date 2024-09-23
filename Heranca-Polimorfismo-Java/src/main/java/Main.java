package main.java;

import main.java.atividade01.*;
import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;
import main.java.atividade03.Caminhao;
import main.java.atividade03.Carro;
import main.java.atividade03.Frota;
import main.java.atividade03.Moto;

public class Main {
    public static void main(String[] args) {
        Frota empresaDeVeiculo = new Frota();

        empresaDeVeiculo.adicionarVeiculo(new Caminhao("ABC1D23","Scania R450", 2020,150.000 ,18.0));
        empresaDeVeiculo.adicionarVeiculo(new Caminhao(" XYZ4E56","Volvo FH 540",2019,220000.0,25.0));
        empresaDeVeiculo.adicionarVeiculo(new Carro("ABC1234", "Toyota Corolla", 2018, 75000.0,4));
        empresaDeVeiculo.adicionarVeiculo(new Carro("XYZ5678", "Honda Civic", 2020, 50000.0,4));
        empresaDeVeiculo.adicionarVeiculo(new Moto("MOT1234", "Yamaha YZF-R3", 2021, 12000.0,321));
        empresaDeVeiculo.adicionarVeiculo(new Moto("MOT5678", "Honda CB 500F", 2019, 25000.0,471));

        empresaDeVeiculo.removerVeiculo("ABC1D23");
        empresaDeVeiculo.removerVeiculo("ABC1D25");

        empresaDeVeiculo.listaVeiculo();

        empresaDeVeiculo.calcularCustoDaViagem();

    }
}