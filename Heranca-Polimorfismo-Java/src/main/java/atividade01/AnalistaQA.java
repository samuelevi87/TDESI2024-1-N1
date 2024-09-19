package main.java.atividade01;

public class AnalistaQA extends Funcionario{

    private int projetoTestatos;

    public AnalistaQA(String nome, int id, double salarioBase, int projetoTestatos) {
        super(nome, id, salarioBase);
        this.projetoTestatos = projetoTestatos;
    }

    public int getProjetoTestatos() {
        return projetoTestatos;
    }

    public void setProjetoTestatos(int projetoTestatos) {
        this.projetoTestatos = projetoTestatos;
    }


    @Override
    public double calcularSalario() {
        return 0;
    }
}
