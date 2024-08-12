### Exercício 3: Classe `Produto`

- **Objetivo:** Criar uma classe `Produto` que representa um item em uma loja.

**Especificações:**

- **Atributos:**
  - `nome` (String)
  - `preco` (double)
  - `quantidadeEmEstoque` (int)
- **Métodos:**
  - Construtor que inicializa os atributos `nome`, `preco` e `quantidadeEmEstoque`.
  - Método `getNome` para retornar o nome do produto.
  - Método `getPreco` para retornar o preço do produto.
  - Método `getQuantidadeEmEstoque` para retornar a quantidade em estoque.
  - Método `adicionarEstoque(int quantidade)` para adicionar mais itens ao estoque.
  - Método `removerEstoque(int quantidade)` para remover itens do estoque, garantindo que a quantidade não fique negativa.
