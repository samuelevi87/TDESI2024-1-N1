package main.java.atividade03;

public class Carro extends Veiculo{

    private int numeroPortas;

    public Carro(String placa, String modelo, int ano, double quilometragem, int numeroPortas) {
        super(placa, modelo, ano, quilometragem);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularViagem(double distancia) {
        return distancia * 0.20;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroPortas=" + numeroPortas +
                "Placa: "+getPlaca()+
                "Modelo: "+getModelo()+
                "Ano : "+getAno()+
                "Quilometragem: "+getQuilometragem();
    }
}
