## 8. Sistema de Comércio Eletrônico

Desenvolva um sistema básico para uma plataforma de comércio eletrônico.

1. Crie uma classe base abstrata `Produto` com os seguintes atributos:
    - `id` (int)
    - `nome` (String)
    - `descricao` (String)
    - `preco` (double)
    - `estoque` (int)

2. Implemente os seguintes métodos na classe `Produto`:
    - Um construtor que aceite todos os atributos (exceto id, que deve ser gerado automaticamente)
    - Getters e setters para todos os atributos
    - Um método `atualizarEstoque(int quantidade)`
    - Um método abstrato `calcularFrete()` que retorne um double

3. Crie as seguintes subclasses de `Produto`:
    - `ProdutoFisico`
    - `ProdutoDigital`
    - `Servico`

4. Para cada subclasse, adicione atributos específicos:
    - `ProdutoFisico`: `peso` (double, em kg), `dimensoes` (String)
    - `ProdutoDigital`: `tamanhoArquivo` (double, em MB), `formatoArquivo` (String)
    - `Servico`: `duracaoEstimada` (int, em horas)

5. Implemente o método `calcularFrete()` em cada subclasse:
    - `ProdutoFisico`: frete = peso * 5 + 10
    - `ProdutoDigital`: frete = 0
    - `Servico`: frete = 15 (taxa fixa)

6. Crie uma classe `Carrinho` com um ArrayList de `Produto` e métodos para:
    - Adicionar produtos ao carrinho
    - Remover produtos do carrinho
    - Calcular o total da compra (soma dos preços + fretes)
    - Listar todos os itens no carrinho

7. Crie uma classe `Loja` com um ArrayList de `Produto` (estoque da loja) e métodos para:
    - Adicionar produtos ao estoque
    - Remover produtos do estoque
    - Buscar produtos por nome
    - Listar produtos por categoria (tipo de subclasse)

8. Na classe `Main`, crie instâncias de `Loja` e `Carrinho`. Adicione diversos produtos à loja, realize algumas compras adicionando itens ao carrinho, e demonstre o funcionamento dos métodos de ambas as classes.

