package Exercicio12;

public class Maquina {
    private String maquina;
    private String tipo;
    private String statusOperacao;

    public Maquina(String maquina, String tipo, String statusOperacao) {
        this.maquina = maquina;
        this.tipo = tipo;
        this.statusOperacao = statusOperacao;
    }

    public String getMaquina() {
        return maquina;
    }

    public String getTipo() {
        return tipo;
    }

    public String getStatusOperacao() {
        return statusOperacao;
    }

    public void setStatusOperacao(String statusOperacao) {
        this.statusOperacao = statusOperacao;
    }
}
