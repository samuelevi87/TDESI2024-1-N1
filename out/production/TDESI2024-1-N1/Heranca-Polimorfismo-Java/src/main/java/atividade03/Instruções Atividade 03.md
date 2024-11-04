## 3. Sistema de Veículos

Projete um sistema de gerenciamento de frota para uma empresa de logística.

1. Crie uma classe base `Veiculo` com os seguintes atributos:
    - `placa` (String)
    - `modelo` (String)
    - `ano` (int)
    - `quilometragem` (double)

2. Implemente os seguintes métodos na classe `Veiculo`:
    - Um construtor que aceite todos os atributos
    - Getters e setters para todos os atributos
    - Um método abstrato `calcularCustoViagem(double distancia)` que retorne um double

3. Crie as seguintes subclasses de `Veiculo`:
    - `Carro`
    - `Caminhao`
    - `Moto`

4. Para cada subclasse, adicione atributos específicos:
    - `Carro`: `numeroPortas` (int)
    - `Caminhao`: `capacidadeCarga` (double, em toneladas)
    - `Moto`: `cilindrada` (int)

5. Implemente o método `calcularCustoViagem(double distancia)` em cada subclasse:
    - `Carro`: 0.20 reais por km
    - `Caminhao`: 0.50 reais por km + 10 reais por tonelada de capacidade
    - `Moto`: 0.15 reais por km

6. Crie uma classe `Frota` com um ArrayList de `Veiculo` e métodos para:
    - Adicionar veículos à frota
    - Remover veículos da frota (por placa)
    - Calcular o custo total de uma viagem para toda a frota
    - Listar todos os veículos da frota

7. Na classe `Main`, crie uma instância de `Frota` e adicione pelo menos 2 veículos de cada tipo. Demonstre o funcionamento dos métodos de adição, remoção e cálculo de custo de viagem para toda a frota.
