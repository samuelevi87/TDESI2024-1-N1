## 1. Sistema de Gerenciamento de Funcionários

Crie um sistema de gerenciamento de funcionários para uma empresa de tecnologia.

1. Crie uma classe base `Funcionario` com os seguintes atributos:
    - `nome` (String)
    - `id` (int)
    - `salarioBase` (double)

2. Implemente os seguintes métodos na classe `Funcionario`:
    - Um construtor que aceite todos os atributos
    - Getters e setters para todos os atributos
    - Um método `calcularSalario()` que retorne o `salarioBase`

3. Crie as seguintes subclasses de `Funcionario`:
    - `Desenvolvedor`
    - `Gerente`
    - `AnalistaQA`

4. Para cada subclasse, adicione atributos específicos:
    - `Desenvolvedor`: `linguagemProgramacao` (String)
    - `Gerente`: `bonusAnual` (double)
    - `AnalistaQA`: `projetosTestados` (int)

5. Sobrescreva o método `calcularSalario()` em cada subclasse:
    - `Desenvolvedor`: Acrescente 10% ao salário base
    - `Gerente`: Adicione a parcela do bônus anual ao salário base
    - `AnalistaQA`: Acrescente 5% ao salário base, mais 100 reais por projeto testado

6. Crie uma classe `Empresa` com um array de `Funcionario` e métodos para:
    - Adicionar funcionários
    - Calcular a folha de pagamento total
    - Listar todos os funcionários e seus salários

7. Na classe `Main`, crie uma instância de `Empresa` e adicione pelo menos 2 funcionários de cada tipo. Em seguida, chame os métodos para listar funcionários e calcular a folha de pagamento total.
