package main.java.atividade03;

import java.util.ArrayList;
import java.util.List;

public class Frota {

    private List<Veiculo> listaDeVeiculos;

    public Frota() {
        this.listaDeVeiculos = new ArrayList<>();
    }
    public void adicionarVeiculos(Veiculo veiculosParaAdicionar){
        this.listaDeVeiculos.add(veiculosParaAdicionar);
    }
    public void removerVeiculos(String placa){
        listaDeVeiculos.removeIf(veiculo -> Boolean.parseBoolean(veiculo.getPlaca(placa)));
    }
    public double custoViagemTotal(){
        double custoTotalViagem = 0;

        for(Veiculo veiculo : listaDeVeiculos){
            custoTotalViagem += veiculo.calcularCustoViagem(listaDeVeiculos.size());
        }
        return custoTotalViagem;
    }
    public void listaDeVeiculos() {
        for (Veiculo veiculo : listaDeVeiculos) {
            System.out.println(veiculo);

        }
    }
}
