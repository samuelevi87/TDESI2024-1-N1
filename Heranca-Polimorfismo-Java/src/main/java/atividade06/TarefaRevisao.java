package main.java.atividade06;

import java.time.LocalDate;

public class TarefaRevisao extends Tarefa{
        private String autorOriginal;
        private int numeroLinhas;

        public TarefaRevisao(String titulo, String descricao, LocalDate dataLimite) {
                super(titulo, descricao, dataLimite);
        }

        public String getAutorOriginal() {
                return autorOriginal;
        }

        public void setAutorOriginal(String autorOriginal) {
                this.autorOriginal = autorOriginal;
        }

        public int getNumeroLinhas() {
                return numeroLinhas;
        }

        public void setNumeroLinhas(int numeroLinhas) {
                this.numeroLinhas = numeroLinhas;
        }

        @Override
        public int calculaPrioridade() {
                return numeroLinhas/100;
        }
}

