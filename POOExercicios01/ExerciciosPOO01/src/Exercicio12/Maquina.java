package Exercicio12;

public class Maquina {
    String idMaquina;
    String tipo;// "Corte", "Solda", "Montagem"
    String statusOperacao; // "Operacional", "Manutenção", "Parada"

    public Maquina(String idMaquina, String tipo, String statusOperacao) {
        this.idMaquina = idMaquina;
        this.tipo = tipo;
        this.statusOperacao = statusOperacao;
    }

    public String getIdMaquina() {
        return idMaquina;
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
