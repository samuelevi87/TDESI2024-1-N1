## 6. Sistema de Gerenciamento de Tarefas

Desenvolva um sistema de gerenciamento de tarefas (to-do list) para uma equipe de desenvolvimento de software.

1. Crie uma classe base abstrata `Tarefa` com os seguintes atributos:
   - `titulo` (String)
   - `descricao` (String)
   - `dataCriacao` (LocalDate)
   - `dataLimite` (LocalDate)
   - `status` (enum: PENDENTE, EM_ANDAMENTO, CONCLUIDA)

2. Implemente os seguintes métodos na classe `Tarefa`:
   - Um construtor que aceite titulo, descricao e dataLimite (dataCriacao deve ser inicializada com a data atual)
   - Getters e setters para todos os atributos
   - Um método `atualizarStatus(Status novoStatus)`
   - Um método abstrato `calcularPrioridade()` que retorne um int

3. Crie as seguintes subclasses de `Tarefa`:
   - `TarefaDesenvolvimento`
   - `TarefaRevisao`
   - `TarefaBug`

4. Para cada subclasse, adicione atributos específicos:
   - `TarefaDesenvolvimento`: `linguagemProgramacao` (String), `complexidade` (int: 1-5)
   - `TarefaRevisao`: `autorOriginal` (String), `numeroLinhas` (int)
   - `TarefaBug`: `severidade` (enum: BAIXA, MEDIA, ALTA, CRITICA), `plataforma` (String)

5. Implemente o método `calcularPrioridade()` em cada subclasse:
   - `TarefaDesenvolvimento`: prioridade = complexidade * 2
   - `TarefaRevisao`: prioridade = numeroLinhas / 100
   - `TarefaBug`: prioridade baseada na severidade (BAIXA=1, MEDIA=2, ALTA=3, CRITICA=4)

6. Crie uma classe `GerenciadorTarefas` com um ArrayList de `Tarefa` e métodos para:
   - Adicionar tarefas
   - Listar todas as tarefas
   - Listar tarefas por status
   - Atualizar o status de uma tarefa
   - Listar tarefas ordenadas por prioridade

7. Na classe `Main`, crie uma instância de `GerenciadorTarefas` e adicione pelo menos 2 tarefas de cada tipo. Demonstre o funcionamento dos métodos de adição, listagem e atualização de status.

