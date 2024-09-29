package main.java.atividade06;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<GerenciadorTarefas> Tarefa;
    public GerenciadorTarefas(){this.Tarefa=new ArrayList<>();}
    public void AddTarefas(Tarefa tarefa){Tarefa.add((GerenciadorTarefas) Tarefa);
    }
    public List<String> listarTarefas(){
        List<String> lista=new ArrayList<>();
        for (GerenciadorTarefas tarefa: Tarefa){
            lista.add(String.valueOf(tarefa.getClass()));
        }
        return lista;
    }
}
