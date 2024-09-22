## 2. Biblioteca Digital

Desenvolva um sistema para gerenciar uma biblioteca digital.

1. Crie uma classe base `ItemBiblioteca` com os seguintes atributos:
    - `titulo` (String)
    - `autor` (String)
    - `anoPublicacao` (int)
    - `disponivel` (boolean)

2. Implemente os seguintes métodos na classe `ItemBiblioteca`:
    - Um construtor que aceite todos os atributos
    - Getters e setters para todos os atributos
    - Um método `emprestar()` que mude `disponivel` para false
    - Um método `devolver()` que mude `disponivel` para true
    - Um método abstrato `calcularMulta(int diasAtraso)` que retorne um double

3. Crie as seguintes subclasses de `ItemBiblioteca`:
    - `LivroFisico`
    - `Ebook`
    - `AudioLivro`

4. Para cada subclasse, adicione atributos específicos:
    - `LivroFisico`: `numeroPaginas` (int)
    - `Ebook`: `tamanhoArquivo` (double, em MB)
    - `AudioLivro`: `duracaoMinutos` (int)

5. Implemente o método `calcularMulta(int diasAtraso)` em cada subclasse:
    - `LivroFisico`: 0.50 reais por dia de atraso
    - `Ebook`: 0.25 reais por dia de atraso
    - `AudioLivro`: 0.35 reais por dia de atraso

6. Crie uma classe `Biblioteca` com um ArrayList de `ItemBiblioteca` e métodos para:
    - Adicionar itens à biblioteca
    - Emprestar um item (por título)
    - Devolver um item (por título)
    - Calcular multa para um item atrasado (por título e número de dias de atraso)
    - Listar todos os itens disponíveis

7. Na classe `Main`, crie uma instância de `Biblioteca` e adicione pelo menos 2 itens de cada tipo. Demonstre o funcionamento dos métodos de empréstimo, devolução e cálculo de multa.