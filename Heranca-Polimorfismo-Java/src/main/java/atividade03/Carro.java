package main.java.atividade03;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String placa, String modelo, int ano, double quilometragem, int numeroPortas){
        super(placa, modelo, ano, quilometragem);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }


    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.20;
    }
}
