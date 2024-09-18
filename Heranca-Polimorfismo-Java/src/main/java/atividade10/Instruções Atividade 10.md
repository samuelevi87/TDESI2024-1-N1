## 10. Sistema de Gestão de Recursos Humanos

Desenvolva um sistema de gestão de recursos humanos para uma empresa.

1. Crie uma classe base abstrata `Funcionario` com os seguintes atributos:
    - `id` (int)
    - `nome` (String)
    - `cpf` (String)
    - `dataAdmissao` (LocalDate)
    - `salarioBase` (double)

2. Implemente os seguintes métodos na classe `Funcionario`:
    - Um construtor que aceite todos os atributos (exceto id, que deve ser gerado automaticamente)
    - Getters e setters para todos os atributos
    - Um método `calcularTempoServico()` que retorne o tempo de serviço em anos
    - Um método abstrato `calcularSalario()` que retorne um double

3. Crie as seguintes subclasses de `Funcionario`:
    - `Gerente`
    - `Analista`
    - `Vendedor`

4. Para cada subclasse, adicione atributos específicos:
    - `Gerente`: `departamento` (String), `bonus` (double)
    - `Analista`: `especialidade` (String), `nivelSenioridade` (enum: JUNIOR, PLENO, SENIOR)
    - `Vendedor`: `comissao` (double), `vendasMensais` (double)

5. Implemente o método `calcularSalario()` em cada subclasse:
    - `Gerente`: salario = salarioBase + bonus
    - `Analista`: salario = salarioBase * (1 + nivelSenioridade.valor), onde JUNIOR=0.1, PLENO=0.2, SENIOR=0.3
    - `Vendedor`: salario = salarioBase + (comissao * vendasMensais)

6. Crie uma classe `Departamento` com um ArrayList de `Funcionario` e métodos para:
    - Adicionar funcionários
    - Remover funcionários
    - Listar todos os funcionários
    - Calcular a folha de pagamento total do departamento

7. Crie uma classe `Empresa` com um ArrayList de `Departamento` e métodos para:
    - Adicionar departamentos
    - Buscar funcionários por nome em toda a empresa
    - Calcular a folha de pagamento total da empresa
    - Gerar relatório de funcionários por tempo de serviço

8. Na classe `Main`, crie uma instância de `Empresa`, adicione alguns departamentos com diversos funcionários, e demonstre o funcionamento dos métodos de busca, cálculo de salários e geração de relatórios.
