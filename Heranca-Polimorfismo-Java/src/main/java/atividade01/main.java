package main.java.atividade01;
public class main {
    public static void main(String[] args){
        Empresa empresaDeTeste = new Empresa();
        empresaDeTeste.adicionarFuncionario(new Desenvolvedor(
                "William de Oliveira de Liz", 18489,
                2200.0, "Java"));
    }
}