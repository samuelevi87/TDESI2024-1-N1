## 9. Sistema de Reservas de Hotel

Projete um sistema de reservas para uma rede de hotéis.

1. Crie uma classe base abstrata `Acomodacao` com os seguintes atributos:
    - `numero` (int)
    - `capacidade` (int)
    - `precoPorNoite` (double)
    - `disponivel` (boolean)

2. Implemente os seguintes métodos na classe `Acomodacao`:
    - Um construtor que aceite todos os atributos
    - Getters e setters para todos os atributos
    - Um método `reservar()` que mude `disponivel` para false
    - Um método `liberar()` que mude `disponivel` para true
    - Um método abstrato `calcularPrecoTotal(int numeroNoites)` que retorne um double

3. Crie as seguintes subclasses de `Acomodacao`:
    - `QuartoStandard`
    - `QuartoLuxo`
    - `Suite`

4. Para cada subclasse, adicione atributos específicos:
    - `QuartoStandard`: `tipoToCama` (enum: SOLTEIRO, CASAL)
    - `QuartoLuxo`: `temVistaMar` (boolean), `temHidromassagem` (boolean)
    - `Suite`: `numeroQuartos` (int), `temSalaEstar` (boolean)

5. Implemente o método `calcularPrecoTotal(int numeroNoites)` em cada subclasse:
    - `QuartoStandard`: precoTotal = precoPorNoite * numeroNoites
    - `QuartoLuxo`: precoTotal = precoPorNoite * numeroNoites + (temVistaMar ? 50 : 0) + (temHidromassagem ? 100 : 0)
    - `Suite`: precoTotal = precoPorNoite * numeroNoites * 1.5

6. Crie uma classe `Hotel` com um ArrayList de `Acomodacao` e métodos para:
    - Adicionar acomodações
    - Listar todas as acomodações disponíveis
    - Reservar uma acomodação específica
    - Liberar uma acomodação específica
    - Calcular a receita total das reservas atuais

7. Crie uma classe `RedeHoteis` com um ArrayList de `Hotel` e métodos para:
    - Adicionar hotéis à rede
    - Buscar acomodações disponíveis em todos os hotéis
    - Fazer uma reserva em qualquer hotel da rede

8. Na classe `Main`, crie uma instância de `RedeHoteis`, adicione alguns hotéis com diversas acomodações, e demonstre o funcionamento dos métodos de busca e reserva.

