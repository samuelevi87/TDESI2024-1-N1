package main.java.atividade03;

import java.util.ArrayList;
import java.util.List;

public class Frota {

    private List<Veiculo> Listafrota;


    public Frota() {
        Listafrota = new ArrayList<>();
    }

    public void AdcionarFrota(Veiculo veiculo) {
        Listafrota.add(veiculo);
    }

    /**
     * Verifica a placa da lista e encontrar remover o veiculo d frota
     * @param placa Placa informada pelo Usuario
     * @return True se Removido
     */

    public Boolean RemoverVeiculoPorPlaca(String placa){
        for(Veiculo veiculo : Listafrota){
            if (veiculo.getPlaca() == placa){
                Listafrota.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    /**
     * Listando todos os veiculos da frota e calculando o valor
     * @param distancia valor informado pelo usuario
     * @return Valor total de todas as frotas
     */

    public double CustoTotalFrota(double distancia){
        Double total = 0.0;
        for (Veiculo veiculo : Listafrota){
            total += veiculo.calcularViagem(distancia);
        }
        return total;
    }

    public void ListarTodosVeiculos(){
        for (Veiculo veiculo : Listafrota){
            veiculo.toString();
        }
    }


}
