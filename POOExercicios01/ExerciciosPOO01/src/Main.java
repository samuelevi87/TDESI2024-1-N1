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
import Exercicio15.Seguro;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        Pessoa pessoaNova = new Pessoa("Ruan", 20);
        // 2. Exibir o nome e a idade da pessoa.
        System.out.println("o nome é: " + pessoaNova.getNome());
        System.out.println("sua idade é:" + pessoaNova.getIdade());
        // 3. Alterar a idade da pessoa e exibir novamente.
        pessoaNova.setIdade(30);
        System.out.println("dados atualizados:\nNome " + pessoaNova.getIdade() + "idade" +  pessoaNova.getIdade());

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        ContaBancaria contaCorrente = new ContaBancaria(78965, 5000);
        System.out.println("seu saldo inicial " + contaCorrente.getSaldo());
        // 2. Depositar um valor na conta.
        contaCorrente.depositar(100);
        System.out.println("seu saldo foi atualizado" + contaCorrente.getSaldo());
        // 3. Sacar um valor da conta.
        contaCorrente.sacar(50);
        System.out.println("seu saldo foi de " + contaCorrente.getSaldo());
        // 4. Exibir o saldo final.
        System.out.println("seu saldo atual e atualizado é de " + contaCorrente.getSaldo());

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        Produto produto = new Produto("eletro domesticos", 299.99, 50);
        // 2. Exibir o nome, preço e quantidade em estoque.
        System.out.println("nome: " + produto.getNome());
        System.out.println("preço: " + produto.getPreco());
        System.out.println("quantidade em estoque: " + produto.getQuantidadeEmEstoque());
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        produto.adicionarEstoque(20);
        System.out.println("\nestoque adicionado e atualizado:");
        System.out.println("quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
        // 4. Remover itens do estoque e exibir a nova quantidade.
        produto.removerEstoque(10);
        System.out.println("\nunidades removidas do estoque:");
        System.out.println("quantidade em estoque: " + produto.getQuantidadeEmEstoque());

        produto.removerEstoque(100);

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        Livro livro = new Livro("aslongas tranças de um careca", "R.C.P Fortes", 2024);
        // 2. Exibir o título, autor e ano de publicação.
        System.out.println("titulos:" +  livro.getTitulo());
        System.out.println("autor:" + livro.getAutor());
        System.out.println("ano de publicação:" + livro.getAnoPublicado());
        // 3. Alterar o ano de publicação e exibir novamente.
        livro.setAnoPublicado(2024);
        System.out.println("o ano de alteração:" + livro.getAnoPublicado());

        livro.setAnoPublicado(-1500);

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        Carro carro = new Carro("Chevrolet", "Corsa Sedan", 2003, 15000);
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        System.out.println("Marca:" + carro.getMarca());
        System.out.println("Modelo:" + carro.getModelo());
        System.out.println("Ano:" + carro.getAno());
        System.out.println("Sua Quilometragem:" + carro.getQuilometragem() + "km");
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
        //System.out.println("adicionamos" + carro.setAdicionarQuilometragem()+ "Km");
        carro.setAdicionarQuilometragem(250);

        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        Cliente cliente = new Cliente("Ruan Carlos Pereira Fortes", "ruancarlos280204@gmail.com", "(47)98493-7404");
        // 2. Exibir o nome, email e telefone do cliente.
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
        // 3. Alterar o telefone do cliente e exibir novamente.
        cliente.setTelefone("8765-4321");
        System.out.println("\nApós alteração do telefone:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        Pedido pedido = new Pedido(12345, 250.75, "pendente");
        // 2. Exibir o número do pedido, valor total e status.
        System.out.println("numero do Pedido: " + pedido.getNumeroPedido());
        System.out.println("valor total do pedido: " + pedido.getValorTotal());
        System.out.println("status: " + pedido.getStatus());
        // 3. Alterar o status do pedido e exibir novamente.
        pedido.setStatus("enviado");

        System.out.println("\napos alteração do status:");
        System.out.println("numero do pedido: " + pedido.getNumeroPedido());
        System.out.println("valor total do pedido: " + pedido.getValorTotal());
        System.out.println("status: " + pedido.getStatus());

        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        Funcionario funcionario = new Funcionario("Ruan Carlos Pereira Fortes", "Escritorio", 2300.00);
        // 2. Exibir o nome, cargo e salário do funcionário.
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());
        // 3. Alterar o salário do funcionário e exibir novamente.
        funcionario.setSalario(4000.00);

        System.out.println("\nsalario atualizado:");
        System.out.println("nome: " + funcionario.getNome());
        System.out.println("cargo: " + funcionario.getCargo());
        System.out.println("salario: " + funcionario.getSalario());

        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        ProdutoIndustrial produtoDeIndustrias = new ProdutoIndustrial("P001", "rolamento de maquinas industriais", 1500.00, 2000.00);
        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
        System.out.println("Código: " + produtoDeIndustrias.getCodigo());
        System.out.println("Nome: " + produtoDeIndustrias.getNome());
        System.out.println("Preço de Custo: " + produtoDeIndustrias.getPrecoCusto());
        System.out.println("Preço de Venda: " + produtoDeIndustrias.getPrecoVenda());
        // 3. Calcular e exibir a margem de lucro do produto.
        double margemLucro = produtoDeIndustrias.calcularMargemLucro();

        System.out.println("Margem de Lucro: " + margemLucro);

        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
        Contrato contrato = new Contrato("C12345", "contrato de prestação de serviços", 15000.00, 12);
        // 2. Exibir o número do contrato, descrição, valor e vigência.
        System.out.println("numero do contrato: " + contrato.getNumeroContrato());
        System.out.println("descrição: " + contrato.getDescricao());
        System.out.println("valor: " + contrato.getValor());
        System.out.println("vigencia: " + contrato.getVigencia() + " meses");
        // 3. Alterar a vigência do contrato e exibir novamente.
        contrato.setVigencia(24);
        System.out.println("\nvigencia foi atualizada:");
        System.out.println("vigencia: " + contrato.getVigencia() + " meses");

        contrato.setVigencia(-6);

        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
        Fornecedor fornecedor = new Fornecedor("fornecedor ABC", "12.345.678/0001-90", "(47) 98765-4321");
        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
        System.out.println("nome: " + fornecedor.getNome());
        System.out.println("CNPJ: " + fornecedor.getCnpj());
        System.out.println("telefone: " + fornecedor.getTelefone());
        // 3. Alterar o telefone do fornecedor e exibir novamente.
        fornecedor.setTelefone("(47) 12345-6789");
        System.out.println("\ntelefone foi atualizado:");
        System.out.println("telefone: " + fornecedor.getTelefone());

        // Exercício 12:
        // 1. Criar uma instância da classe Maquina.
        Maquina maquina = new Maquina("M001", "corte", "operacional");
        // 2. Exibir o ID da máquina, tipo e status de operação.
        System.out.println("ID da maquina: " + maquina.getIdMaquina());
        System.out.println("tipo: " + maquina.getTipo());
        System.out.println("status de operação: " + maquina.getStatusOperacao());
        // 3. Alterar o status de operação da máquina e exibir novamente.
        maquina.setStatusOperacao("manutençao");
        System.out.println("\nstatus de operaçao foi atualizado:");
        System.out.println("status de operaçao: " + maquina.getStatusOperacao());

        // Exercício 13:
        // 1. Criar uma instância da classe VeiculoEmpresa.
        VeiculoEmpresa veiculo = new VeiculoEmpresa("ABC-1234", "Jeep", 2018, 50000.0);
        // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
        System.out.println("placa: " + veiculo.getPlaca());
        System.out.println("modelo: " + veiculo.getModelo());
        System.out.println("ano: " + veiculo.getAno());
        System.out.println("quilometragem: " + veiculo.getQuilometragem() + " km");
        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.
        veiculo.adicionarQuilometragem(1500.0);
        System.out.println("\nquilometragem foi atualizado:");
        System.out.println("quilometragem: " + veiculo.getQuilometragem() + " km");

        veiculo.adicionarQuilometragem(-200.0);

        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
        Projeto projeto = new Projeto("projeto X", 12, 50000.00);
        // 2. Exibir o nome, duração e orçamento do projeto.
        System.out.println("nome do projeto: " + projeto.getNome());
        System.out.println("duração: " + projeto.getDuracao() + " meses");
        System.out.println("orçamento: " + projeto.getOrcamento());
        // 3. Alterar o orçamento do projeto e exibir novamente.
        projeto.setOrcamento(60000.00);
        System.out.println("\norçamento foi atualizado:");
        System.out.println("orçamento: " + projeto.getOrcamento());

        projeto.setOrcamento(-1000.00);

        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
        Seguro seguro = new Seguro("AP123456", "veículo", 50000.00, 1200.00);
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        System.out.println("numero da Aapolice: " + seguro.getNumeroApolice());
        System.out.println("tipo: " + seguro.getTipo());
        System.out.println("valor da cobertura: " + seguro.getValorCobertura());
        System.out.println("valor do premio: " + seguro.getValorPremio());
        // 3. Alterar o valor do prêmio e exibir novamente.
    }
}
