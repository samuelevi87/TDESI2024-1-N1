package Exercicio12;

public class Maquina {
    private String ID;
    private String Tipo;
    private String status;

    public Maquina(String ID, String tipo, String status) {
        this.ID = ID;
        Tipo = tipo;
        this.status = status;
    }

    public String getID() {
        return ID;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String toString(){
        return "new status : "+ status;
    }
}
