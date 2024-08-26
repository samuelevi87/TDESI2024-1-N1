import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;
import Exercicio04.Livro;
import Exercicio05.Carro;
import Exercicio06.Cliente;
import Exercicio07.Pedido;
import Exercicio08.Funcionario;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        Pessoa pessoa=new Pessoa("william",25);
        // 2. Exibir o nome e a idade da pessoa.
        System.out.println("Nome: "+ pessoa.getNome());
        System.out.println(" idade: "+ pessoa.getIdade());
        // 3. Alterar a idade da pessoa e exibir novamente.
        pessoa.setIdade(25);
        System.out.println("Idade pós alteração: "+ pessoa.getIdade());
        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        ContaBancaria contaBancaria = new ContaBancaria(777,2200);
        System.out.println("saldo inicial: "+contaBancaria.getSaldo());
        // 2. Depositar um valor na conta.
        contaBancaria.depositar(100);
        System.out.println("saldo atual: "+contaBancaria.getSaldo());
        // 3. Sacar um valor da conta.
        contaBancaria.saque(25);
        // 4. Exibir o saldo final.
        System.out.println("Saldo atual: "+contaBancaria.getSaldo());

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        Produto produto = new Produto("Energético", 8.25,1);
        // 2. Exibir o nome, preço e quantidade em estoque.
        System.out.println(produto.getNome()+" no preço de: "+produto.getPreco()+"restam: "+produto.getQuntidadeEmEstoque());
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        Livro livro = new Livro("Diario da cocaina","Nikki Sixx",2008);
        // 2. Exibir o título, autor e ano de publicação.
        System.out.println("título: "+livro.getLivro()+"Autor: "+livro.getAutor()+"Ano Publicado: "+livro.getAnoPublicado());
        // 3. Alterar o ano de publicação e exibir novamente.
        livro.setAnoPublicado(2007);
        System.out.println("ano de ublicação após alterado: "+livro.getAnoPublicado());

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        Carro carro = new Carro("Volvo","XC90",2024,20000);
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        System.out.println("Marca: "+carro.getMarca()+"Modelo: "+carro.getModelo()+"Ano de fabricação: "+carro.getAno()+"Quilometragem: "+carro.getQuilimetragem());
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
        carro.addQuilimetragem(25000);
        System.out.println("Nova quilometragem: "+carro.getQuilimetragem());

        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        Cliente cliente = new Cliente("William de Oliveira de Liz", "Liam@Gmail.com","98990-9969");
        // 2. Exibir o nome, email e telefone do cliente.
        System.out.println("Nome: "+cliente.getNome());
        System.out.println("Email: "+cliente.getEmail());
        System.out.println("Telefone: "+cliente.getTelefone());
        // 3. Alterar o telefone do cliente e exibir novamente.
        cliente.setTelefone("98903-9298");
        System.out.println("Numero após alteração: "+cliente.getTelefone());

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        Pedido pedido=new Pedido(999,18.80,"Pendente");
        // 2. Exibir o número do pedido, valor total e status.
        System.out.println("Número do pedido: "+ pedido.getNumeroPedido());
        System.out.println("Valor total: "+pedido.getValorTotal());
        System.out.println("Status: "+pedido.getStatus());
        // 3. Alterar o status do pedido e exibir novamente.
        pedido.setStstus("Enviado");
        System.out.println("Status: "+pedido.getStatus());

        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        Funcionario funcionario = new Funcionario("William","auxiliar de produção",2200.00);
        // 2. Exibir o nome, cargo e salário do funcionário.
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Cargo: "+funcionario.getCargo());
        System.out.println("Salário: "+funcionario.getSalario());
        // 3. Alterar o salário do funcionário e exibir novamente.
        funcionario.setSalario(2500.00);
        System.out.println("Salário pós alteração: "+funcionario.getSalario());

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
