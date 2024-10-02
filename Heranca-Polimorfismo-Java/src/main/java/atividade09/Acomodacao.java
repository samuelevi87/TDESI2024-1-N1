package main.java.atividade09;

public abstract class Acomodacao {
    private Integer numero;
    private Integer capacidade;
    public Double precoPorNoite;
    private Boolean disponivel;
    private TipoToCama tipoToCama;

    public Acomodacao(Integer numero, Integer capacidade, Double precoPorNoite, Boolean disponivel, TipoToCama tipoToCama) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.precoPorNoite = precoPorNoite;
        this.disponivel = disponivel;
        this.tipoToCama = tipoToCama;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public Double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public void setPrecoPorNoite(Double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void reservar() {
        disponivel = false;
    }

    public void liberar() {
        disponivel = true;
    }

    public abstract double calcularPrecoTotal(int numeroNoites);
}
