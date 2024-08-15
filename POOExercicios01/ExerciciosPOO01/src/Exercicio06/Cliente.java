package Exercicio06;

public class Cliente {

    private String nome;
    private  String email;
    private  String telefone;

    public  Cliente(){

    }
    public  Cliente (String nome, String email, String telefone){
        this.nome=nome;
        this.email=email;
        this.telefone=telefone;
    }
    public String getNome() {
        return nome;
    }

    public String getemail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
