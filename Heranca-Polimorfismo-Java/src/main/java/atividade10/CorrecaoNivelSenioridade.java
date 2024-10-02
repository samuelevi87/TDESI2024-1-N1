package main.java.atividade10;

/**
 * Enum para representar os níveis de senioridade de um Analista.
 */
public enum CorrecaoNivelSenioridade {
    JUNIOR(0.1), PLENO(0.2), SENIOR(0.3);

    private final double valor;

    CorrecaoNivelSenioridade(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}