package main.java.atividade06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas(){
        this.tarefas = new ArrayList<>();
    }
    public void adicionarTarefas(Tarefa tarefa){
        tarefas.add(tarefa);
    }
    public void listarTodasTarefas(){
        tarefas.forEach(System.out::println);
    }
    public void listarPorStatus(Status status){
        tarefas.stream().filter(tarefa -> tarefa.getStatus().equals(status)).forEach(System.out::println);
    }
    public void atualizarStatusTarefa(String tituloTarefa, Status novoStatus){
        tarefas.stream().filter(tarefa -> tarefa.getTitulo().equalsIgnoreCase(tituloTarefa)).findFirst()
                .ifPresent(tarefa -> tarefa.atualizarStatus(novoStatus));
    }
    public void tarefasOrdenadasPorPrioridade(){
        tarefas.stream().sorted(Comparator.comparingInt(Tarefa::calcularPrioridade)).forEach(System.out::println);
    }


}
