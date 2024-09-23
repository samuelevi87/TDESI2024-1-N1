package main.java.atividade03;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo>listaDeVeiculo;

    public Frota(){
        this.listaDeVeiculo = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo novoVeiculo){
        listaDeVeiculo.add(novoVeiculo);
        System.out.println(novoVeiculo.getModelo() + " foi adicionado.");
    }

    public String removerVeiculo(String placa) {
        for (Veiculo veiculo : listaDeVeiculo) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                listaDeVeiculo.remove(veiculo);
                System.out.println(veiculo.getModelo() + " " + "com placa : " + veiculo.getPlaca() + " foi removido");
                return veiculo.getPlaca();
            }

        }
        System.out.println("Veiculo com placa " + placa + " nao foi encontrado");
        return null;
    }

    public Double calcularCustoDaViagem(){
        Double custo = 0.0;
        for (Veiculo veiculo : listaDeVeiculo){
             custo += veiculo.getQuilometragem() ;
        }
        System.out.println("O custo de viagem para toda a Frota : "+custo);
        return custo ;

    }

    public  void listaVeiculo(){
        for(Veiculo veiculo : listaDeVeiculo){
            System.out.println("Placa : "+ veiculo.getPlaca() + "Modelo : "+ veiculo.getModelo() + "Ano : "+veiculo.getAno() + "km : "+veiculo.getQuilometragem());
        }
    }
}
