package Exercicio12;

public class Maquina {

    String idMaquina;
    String tipo;
    String statusOp;

    public Maquina(String idMaquina, String tipo, String statusOp) {
        this.idMaquina = idMaquina;
        this.tipo = tipo;
        this.statusOp = statusOp;
    }

    public String getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(String idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatusOp() {
        return statusOp;
    }

    public void setStatusOp(String statusOp) {
        this.statusOp = statusOp;
    }
}
