package main.java.atividade10;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Departamento> departamentos;

    public Empresa(){
        this.departamentos = new ArrayList<>();
    }
    public void adicionarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

}
