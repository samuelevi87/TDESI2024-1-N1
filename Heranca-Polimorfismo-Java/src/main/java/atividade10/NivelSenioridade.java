package main.java.atividade10;

public enum NivelSenioridade {
    JUNIOR(0.1), PLENO(0.2), SENIOR(0.3);

    public final double valor;

    NivelSenioridade(double valor) {
        this.valor = valor;
    }
}
