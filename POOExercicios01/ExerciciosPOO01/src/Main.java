import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

       // Pessoa pessoa1 = new Pessoa("Jão",25);
      //   System.out.println(pessoa1);

      //  pessoa1.setIdade(30);
      //  System.out.println(pessoa1);

      //  System.out.println();

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        ContaBancaria conta1 = new ContaBancaria(5, 200);
        System.out.println("saldo inicial : "+conta1.getSaldo());

        // 2. Depositar um valor na conta.
         conta1.depositar(200);

        // 3. Sacar um valor da conta.
        conta1.sacar(20);
        // 4. Exibir o saldo final.
        System.out.println("saldo atualizada : "+conta1.getSaldo());


        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.

        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        // 2. Exibir o nome, email e telefone do cliente.
        // 3. Alterar o telefone do cliente e exibir novamente.

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        // 2. Exibir o número do pedido, valor total e status.
        // 3. Alterar o status do pedido e exibir novamente.

        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        // 2. Exibir o nome, cargo e salário do funcionário.
        // 3. Alterar o salário do funcionário e exibir novamente.

        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
        // 3. Calcular e exibir a margem de lucro do produto.

        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
        // 2. Exibir o número do contrato, descrição, valor e vigência.
        // 3. Alterar a vigência do contrato e exibir novamente.

        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
        // 3. Alterar o telefone do fornecedor e exibir novamente.

        // Exercício 12:
        // 1. Criar uma instância da classe Maquina.
        // 2. Exibir o ID da máquina, tipo e status de operação.
        // 3. Alterar o status de operação da máquina e exibir novamente.

        // Exercício 13:
        // 1. Criar uma instância da classe VeiculoEmpresa.
        // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.

        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
        // 2. Exibir o nome, duração e orçamento do projeto.
        // 3. Alterar o orçamento do projeto e exibir novamente.

        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        // 3. Alterar o valor do prêmio e exibir novamente.
    }
}
