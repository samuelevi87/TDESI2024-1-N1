package main.java.atividade09;

public abstract class Acomodacao {
    private Integer numero;
    private Integer capacidade;
    private Double precoPorNoite;
    private Boolean disponivel;

    public Acomodacao(Integer numero, Integer capacidade, Double precoPorNoite) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.precoPorNoite = precoPorNoite;
        this.disponivel = true;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(Double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void reservar() {
        setDisponivel(false);
    }

    public void liberar() {
        setDisponivel(true);
    }

    public abstract Double calcularPrecoTotal(Integer numeroNoites);

    @Override
    public String toString() {
        return "Acomodacao{ Número: " + numero +
                ", Capacidade: " + capacidade +
                ", Preço por noite: R$" + precoPorNoite +
                ", Dísponivel: " + (disponivel ? "Sim" : "Não") +
                '}';
    }
}
