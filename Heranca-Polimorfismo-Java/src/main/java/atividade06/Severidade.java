package main.java.atividade06;

public enum Severidade {
    BAIXA(1), MEDIA(2), ALTA(3), CRITICA(4);

    private final int valor;

    Severidade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
