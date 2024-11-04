import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> veiculos;

    public Frota() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo " + veiculo.getPlaca() + " adicionado à frota.");
    }

    public void removerVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculos.remove(veiculo);
                System.out.println("Veículo " + placa + " removido da frota.");
                return;
            }
        }
        System.out.println("Veículo com placa " + placa + " não encontrado.");
    }

    public double calcularCustoTotalViagem(double distancia) {
        double custoTotal = 0;
        for (Veiculo veiculo : veiculos) {
            custoTotal += veiculo.calcularCustoViagem(distancia);
        }
        return custoTotal;
    }

    public void listarVeiculos() {
        System.out.println("Veículos na frota:");
        for (Veiculo veiculo : veiculos) {
            System.out.println("- " + veiculo.getModelo() + " (Placa: " + veiculo.getPlaca() + ")");
        }
    }
}

