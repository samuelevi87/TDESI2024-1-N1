package Exercicio06;

public class Cliente {

    private String nome;
    private String email;
    private String telefone;

    // Construtor para inicializar os atributos
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos para acessar os atributos
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    // Método para alterar o número de telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
