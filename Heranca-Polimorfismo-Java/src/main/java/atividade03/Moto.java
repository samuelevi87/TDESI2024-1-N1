package main.java.atividade03;

public class Moto extends Veiculo{

    private int cilindrada;

    public Moto(String placa, String modelo, int ano, double quilometragem, int cilindrada) {
        super(placa, modelo, ano, quilometragem);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularViagem(double distancia) {
        return distancia * 0.15;
    }

    @Override
    public String toString() {
        return "Moto" +
                "cilindrada: " + cilindrada +
                "Placa: "+getPlaca()+
                "Modelo: "+getModelo()+
                "Ano: "+getAno()+
                "Quilometragem: "+getQuilometragem();
    }
}
