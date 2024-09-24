package main.java.atividade03;

import main.java.atividade02.ItemBiblioteca;

import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> frota;

    public Frota() {
        frota = new ArrayList<>();
    }

    public void adicionarVeiculos(Veiculo veiculo){
        frota.add(veiculo);
    }
}
