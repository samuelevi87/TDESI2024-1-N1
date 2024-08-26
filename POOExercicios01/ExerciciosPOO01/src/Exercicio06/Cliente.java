package Exercicio06;

public class Cliente {
    private String Nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone) {
        this.Nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
