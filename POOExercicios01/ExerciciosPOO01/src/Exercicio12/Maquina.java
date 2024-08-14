package Exercicio12;

public class Maquina {
    private String idMaquina;
    private String tipo;
    private String statusOperaçao;

    public Maquina(String idMaquina, String tipo, String statusOperaçao) {
        this.idMaquina = idMaquina;
        this.tipo = tipo;
        this.statusOperaçao = statusOperaçao;
    }

    public void setStatusOperaçao(String statusOperaçao) {
        this.statusOperaçao = statusOperaçao;
    }

    @Override
    public String toString() {
        return "ID da máquina: '" + idMaquina + '\'' +
                "\nTipo: '" + tipo + '\'' +
                "\nStatus da operação: '" + statusOperaçao + "\'\n";
    }
}
