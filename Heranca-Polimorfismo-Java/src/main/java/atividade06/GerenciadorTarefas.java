package main.java.atividade06;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorTarefas {

        private List<Tarefa> tarefas;

        public GerenciadorTarefas() {
            this.tarefas = new ArrayList<>();
        }

        public void adicionarTarefa(Tarefa tarefa) {
            tarefas.add(tarefa);
        }

        public List<Tarefa> listarTarefas() {
            return tarefas;
        }

        public List<Tarefa> listarPorStatus(Status status) {
            return tarefas.stream()
                    .filter(t -> t.getStatus() == status)
                    .collect(Collectors.toList());
        }

        public void atualizarStatus(Tarefa tarefa, Status novoStatus) {
            tarefa.atualizarStatus(novoStatus);
        }

        public List<Tarefa> listarPorPrioridade() {
            return tarefas.stream()
                    .sorted(Comparator.comparingInt(Tarefa::calcularPrioridade).reversed())
                    .collect(Collectors.toList());
        }
}
