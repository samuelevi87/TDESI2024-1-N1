import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;
import Exercicio04.Livro;
import Exercicio05.Carro;
import Exercicio06.Cliente;
import Exercicio07.Pedido;

public class Main {
    public static void main(String[] args) {

        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.
        Pessoa pessoa1 = new Pessoa("Joao", 20);
        System.out.println("Olá, seu nome é: " + pessoa1.getNome() + " e sua idade é: " + pessoa1.getIdade());
        pessoa1.setIdade(70);
        System.out.println("Olá, seu nome é: " + pessoa1.getNome() + " e sua idade é: " + pessoa1.getIdade());


        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.
        ContaBancaria contaBancaria1 = new ContaBancaria(12345, 500);
        contaBancaria1.setDepositar(200);
        contaBancaria1.setSacar(50);
        System.out.println("Saldo disponivel: " + contaBancaria1.getSaldoConta() + "\n");


        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.
        Produto produto1 = new Produto("MESA", 250.00, 10);
        System.out.println("DESCRIÇÃO PRODUTO \n" + "NOME:" + produto1.getNome() + "\n" + "PREÇO:" + produto1.getPreco() + "\n" + "QNT ESTOQUE:" + produto1.getQntEmEstoque());
        produto1.setAdicionarEstoque(5);
        produto1.setRemoverEstoque(1);
        System.out.println("ESTOQUE ATUALIZADO:" + produto1.getQntEmEstoque() + "\n");


        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.
        Livro livro1 = new Livro("Seja TOP", "João Santos", 2024);
        System.out.println("DESCRIÇÃO DO LIVRO \n" + "TITULO:" + livro1.getTitulo() + "\n" + "AUTOR:" + livro1.getAutor() + "\n" + "ANO PUBLICAÇÃO:" + livro1.getAnoPublicacao());
        livro1.setAnoPublicacao(2025);
        System.out.println("ANO DE PUBLICAÇÃO ATUALIZADO:" + livro1.getAnoPublicacao() + "\n");


        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
        Carro carro1 = new Carro("BMW", "320 M", 2020, 10200);
        System.out.println("DESCRIÇÃO DO CARRO \n" + "MARCA:" + carro1.getMarca() + "\n" + "MODELO:" + carro1.getModelo() + "\n" + "ANO:" + carro1.getAno() + "\n" + "QUILOMETRAGEM:" + carro1.getQuilometragem());
        carro1.adicionarQuilometragem(500);
        System.out.println("QUILOMETRAGEM ATUALIZADA:" + carro1.getQuilometragem() + "\n");


        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        // 2. Exibir o nome, email e telefone do cliente.
        // 3. Alterar o telefone do cliente e exibir novamente.
        Cliente cliente1 = new Cliente("Pedro", "pedrozinho@gmail.com", "47991929394");
        System.out.println("DESCRIÇÃO DO CLIENTE \n" + "NOME:" + cliente1.getNome() + "\n" + "EMAIL:" + cliente1.getEmail() + "\n" + "TELEFONE:" + cliente1.getTelefone());
        cliente1.setTelefone("47992939495");
        System.out.println("TELEFONE ATUALIZADO:" + cliente1.getTelefone() + "\n");


        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        // 2. Exibir o número do pedido, valor total e status.
        // 3. Alterar o status do pedido e exibir novamente.
        Pedido pedido1 = new Pedido(354, 54.20, "Pendente");
        System.out.println("DESCRIÇÃO DO PEDIDO \n" + "NUMERO PEDIDO:" + pedido1.getNumeroPedido() + "\n" + "VALOR TOTAL:" + pedido1.getValorTotal() + "\n" + "STATUS:" + pedido1.getStatus());
        pedido1.setStatus("Enviado");
        System.out.println("STATUS ATUALIZADO:" + pedido1.getStatus() + "\n");

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
