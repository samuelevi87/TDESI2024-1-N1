import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;
import Exercicio04.Livro;
import Exercicio05.Carro;
import Exercicio06.Cliente;
import Exercicio07.Pedido;
import Exercicio08.Funcionario;
import Exercicio09.ProdutoIndustrial;
import Exercicio10.Contrato;
import Exercicio11.Fornecedor;
import Exercicio12.Maquina;
import Exercicio13.VeiculoEmpresa;
import Exercicio14.Projeto;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

        Pessoa pessoa1 = new Pessoa("Roberto", 21);
        System.out.println("---- Exercício 1 ----");
        System.out.println(pessoa1);
        pessoa1.setIdade(24);
        System.out.println(pessoa1);
        System.out.println();

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.

        ContaBancaria conta1 = new ContaBancaria(1, 1500);
        conta1.Depositar(1000);
        conta1.Sacar(700);
        System.out.println("---- Exercício 2 ----");
        System.out.println(conta1);
        System.out.println();

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.

        Produto produto1 = new Produto("Bala", 0.75, 50);
        System.out.println("---- Exercício 3 ----");
        System.out.println(produto1);
        produto1.adicionarEstoque(37);
        System.out.println(produto1);
        produto1.removerEstoque(46);
        System.out.println(produto1);
        System.out.println();

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.

        Livro livro1 = new Livro("O morro dos ventos uivantes", "Emily Brontë", 1849);
        System.out.println("---- Exercício 4 ----");
        System.out.println(livro1);
        livro1.setAnoPublicacao(1847);
        System.out.println(livro1);

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.

        Carro carro1 = new Carro("Volkswagen", "Gol", 2011, 10389);
        System.out.println("---- Exercício 5 ----");
        System.out.println(carro1);
        carro1.adicionarQuilometragem(1370);
        System.out.println(carro1);

        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        // 2. Exibir o nome, email e telefone do cliente.
        // 3. Alterar o telefone do cliente e exibir novamente.

        Cliente cliente1 = new Cliente("Robson", "robson@gmail.com", "4002-8922");
        System.out.println("---- Exercício 6 ----");
        System.out.println(cliente1);
        cliente1.setTelefone("8922-4002");
        System.out.println(cliente1);

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        // 2. Exibir o número do pedido, valor total e status.
        // 3. Alterar o status do pedido e exibir novamente.

        Pedido pedido1 = new Pedido(1, 50, "Vendido");
        System.out.println("---- Exercício 7 ----");
        System.out.println(pedido1);
        pedido1.setStatus("Estornado");
        System.out.println(pedido1);

        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        // 2. Exibir o nome, cargo e salário do funcionário.
        // 3. Alterar o salário do funcionário e exibir novamente.

        Funcionario funcionario1 = new Funcionario("Rosevaldo", "Supervisor", 3500);
        System.out.println("---- Exercício 8 ----");
        System.out.println(funcionario1);
        funcionario1.setSalario(4000);
        System.out.println(funcionario1);

        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
        // 3. Calcular e exibir a margem de lucro do produto.

        ProdutoIndustrial produtoIndustrial1 = new ProdutoIndustrial("01", "Peça", 50, 120);
        System.out.println("---- Exercício 9 ----");
        System.out.println(produtoIndustrial1);
        System.out.println("A margem de lucro ficou em: R$" + produtoIndustrial1.calcularMargemLucro());
        System.out.println();

        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
        // 2. Exibir o número do contrato, descrição, valor e vigência.
        // 3. Alterar a vigência do contrato e exibir novamente.

        Contrato contrato1 = new Contrato("001", "teste", 100, 11);
        System.out.println("---- Exercício 10 ----");
        System.out.println(contrato1);
        contrato1.setVigencia(15);
        System.out.println(contrato1);

        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
        // 3. Alterar o telefone do fornecedor e exibir novamente.

        Fornecedor fornecedor1 = new Fornecedor("Casca de bala produções", "01234567890", "479903827484");
        System.out.println("---- Exercício 11 ----");
        System.out.println(fornecedor1);
        fornecedor1.setTelefone("479192847493");
        System.out.println(fornecedor1);

        // Exercício 12:
        // 1. Criar uma instância da classe Maquina.
        // 2. Exibir o ID da máquina, tipo e status de operação.
        // 3. Alterar o status de operação da máquina e exibir novamente.

        Maquina maquina1 = new Maquina("0192", "Corte", "Operacional");
        System.out.println("---- Exercício 12 ----");
        System.out.println(maquina1);
        maquina1.setStatusOperaçao("Manutenção");
        System.out.println(maquina1);

        // Exercício 13:
        // 1. Criar uma instância da classe VeiculoEmpresa.
        // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.

        VeiculoEmpresa veiculoEmpresa1 = new VeiculoEmpresa("QJD8902", "Civic", 2015, 1920);
        System.out.println("---- Exercício 13 ----");
        System.out.println(veiculoEmpresa1);
        veiculoEmpresa1.adicionarQuilometragem(1920);
        System.out.println(veiculoEmpresa1);

        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
        // 2. Exibir o nome, duração e orçamento do projeto.
        // 3. Alterar o orçamento do projeto e exibir novamente.

        Projeto projeto1 = new Projeto("Projeto casca de bala", 23, 100000);
        System.out.println("---- Exercício 14 ----");
        System.out.println(projeto1);
        projeto1.setOrcamento(150000);
        System.out.println(projeto1);

        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        // 3. Alterar o valor do prêmio e exibir novamente.
    }
}
