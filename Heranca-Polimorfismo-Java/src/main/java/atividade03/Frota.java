package main.java.atividade03;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma frota de veículos gerenciada por uma lista de veículos.
 */
public class Frota {

    private List<Veiculo> veiculos;

    /**
     * Costroi uma frota, inicializando a lista de veículos vazia.
     */
    public Frota(){
        this.veiculos = new ArrayList<>();
    }

    /**
     * Adiciona um veículo à frota.
     * @param veiculo o veículo a ser adicionado à frota.
     */
    public void adicionarVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }

    /**
     * Remove um veículo da frota com base em sua placa.
     * @param placa a placa do veículo a ser removido.
     */
    public void removerVeiculo(String placa){
        veiculos.removeIf(veiculo -> veiculo.getPlaca().equalsIgnoreCase(placa));
    }

    /**
     * Calcula o custo total de uma viagem para todos os veículos da frota.
     * @param distancia a distância da viagem em quilômetros.
     * @return o custo total da viagem para todos os veículos da frota.
     */
    public double calcularCustoTotalViagem(double distancia){
        double custo = 0.0;
        for(Veiculo veiculo : veiculos){
            custo += veiculo.calcularCustoViagem(distancia);
        }
        return custo;
    }

    /**
     * Lista todos os veículos da frota, exibindo suas representações como string.
     */
    public void listarFrota(){
        veiculos.forEach(System.out::println);
    }
}
