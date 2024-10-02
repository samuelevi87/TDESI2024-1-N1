package main.java.atividade09;

public class Acomoacao {
    public abstract class Acomodacao {
        private int numero;
        private int capacidade;
        private double precoPorNoite;
        private boolean disponivel;

        public Acomodacao(int numero, int capacidade, double precoPorNoite) {
            this.numero = numero;
            this.capacidade = capacidade;
            this.precoPorNoite = precoPorNoite;
            this.disponivel = true;
        }

        public int getNumero() {
            return numero;
        }

        public int getCapacidade() {
            return capacidade;
        }

        public double getPrecoPorNoite() {
            return precoPorNoite;
        }

        public boolean isDisponivel() {
            return disponivel;
        }

        public void reservar() {
            this.disponivel = false;
        }

        public void liberar() {
            this.disponivel = true;
        }

        public abstract double calcularPrecoTotal(int numeroNoites);
    }
}
