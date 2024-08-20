package Exercicio11;

public class Fornecedor {
    private String Nome;
    private String CNPJ;
    private String telefone;

    public Fornecedor(String nome, String CNPJ, String telefone) {
        Nome = nome;
        this.CNPJ = CNPJ;
        this.telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String toString(){
        return "Novo tel.: " + telefone;
    }
}
