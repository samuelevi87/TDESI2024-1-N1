package main.java.atividade06;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> listaDeTarefa;
    public GerenciadorTarefas(){this.listaDeTarefa=new ArrayList<>();}
    public void AddTarefas(Tarefa tarefa){listaDeTarefa.add(tarefa);}
    public List<String> listaTarefas() {
        List<String> listaTarefas = new ArrayList<>();

        for (Tarefa tarefa : listaDeTarefa) {
            listaTarefas.add(tarefa.toString());
        }
        return listaTarefas;
    }
    public List<String> listaTarefaPorStatus(Tarefa.Status status){
        List<String> TarefaFiltrada = new ArrayList<>();
        for (Tarefa tarefa : listaDeTarefa){
            if (tarefa.getStatus()==status){
                TarefaFiltrada.add(tarefa.toString());
            }
        }
        return TarefaFiltrada;
    }
}
