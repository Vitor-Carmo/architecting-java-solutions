import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static List<Carro> carros = new ArrayList<>();
    private static List<Moto> motos = new ArrayList<>();
    private static List<Caminhao> caminhoes = new ArrayList<>();
    private static List<Pessoa> clientes = new ArrayList<>();
    private static List<Venda> vendas = new ArrayList<>();
    private static final Map<Class<? extends Veiculo>, String> VEICULO_NOMES = Map.of(
            Carro.class, "carro",
            Moto.class, "moto",
            Caminhao.class, "caminhão");

    private static final Map<Class<? extends Veiculo>, String> VEICULO_NOMES_PLURAIS = Map.of(
            Carro.class, "carros",
            Moto.class, "motos",
            Caminhao.class, "caminhões");

    public static void main(String[] args) {
        // Veiculo veiculo = new Veiculo("Chevrolet", "Onix", 2015, "Prata", 45000);
        // Carro carro = new Carro("Chevrolet", "Onix", 2015, "Prata",
        // 45000,5,"Flex",200);
        // Moto moto = new Moto("Kawasaky","Ninja
        // 900",2019,"Verde",55000,900,true,"Head");
        // Pessoa pessoa = new Pessoa("Leonardo", 52, "Rua 1 n123", "1138325599",
        // "leo@email.com", 192, 98.4);
        // Venda venda = new Venda(carro, pessoa, 50000, LocalDateTime.now());

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        do {
            try {
                System.out.println("### Menu Concessionaria ###");
                System.out.println("1 - Mostrar Veiculos");
                System.out.println("2 - Comprar Veiculo");
                System.out.println("3 - Vender Veiculo");
                System.out.println("4 - Cadastrar um cliente");
                System.out.println("5 - Gerar relatorio");
                System.out.println("6 - Exibir Clientes Cadastrados");
                System.out.println("7 - Sugerir Veiculo por Biotipo");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                escolha = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                switch (escolha) {
                    case 1:
                        mostrarVeiculos();
                        break;
                    case 2:
                        comprarVeiculo(scanner);
                        break;
                    case 3:
                        venderVeiculo(scanner);
                        break;
                    case 4:
                        cadastrarCliente(scanner);
                        break;
                    case 5:
                        gerarRelatorio();
                        break;
                    case 6:
                        mostrarClientes();
                        break;
                    case 7:
                        sugerirVeiculoPorBiotipo(scanner);
                        break;
                    case 0:
                        System.out.println("Fechando o programa...");
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Erro desconhecido: " + e.getMessage());
            }
        } while (escolha != 0);

        scanner.close();
    }

    private static void mostrarVeiculos() {
        try {
            mostrarVeiculo(Carro.class, carros);
            System.out.println("----------------------------------");
            mostrarVeiculo(Moto.class, motos);
            System.out.println("----------------------------------");
            mostrarVeiculo(Caminhao.class, caminhoes);
        } catch (VeiculoIndisponivelException e) {
            System.out.println(e.getMessage());
        }
    }

    private static <V extends Veiculo> void mostrarVeiculo(Class<V> tipoClasse, List<V> veiculos)
            throws VeiculoIndisponivelException {
        if (!veiculos.isEmpty()) {
            System.out.println("### Lista de " + VEICULO_NOMES_PLURAIS.get(tipoClasse) + " ###");
            int x = 1;
            for (V veiculo : veiculos) {
                System.out.println(x + " - " + veiculo.getModelo() + " - " + veiculo.getAno());
                x++;
            }
        } else {
            System.out.println("Nenhum " + VEICULO_NOMES.get(tipoClasse) + " foi encontrado!");
            throw new VeiculoIndisponivelException("Não há veículos disponíveis para venda!");
        }
    }

    private static void sugerirVeiculoPorBiotipo(Scanner scanner) throws ClienteNaoEncontradoException {
        if (clientes.isEmpty()) {

            throw new ClienteNaoEncontradoException("Não há clientes cadastrados!");
        }

        mostrarClientes();
        System.out.print("Escolha o cliente para sugestão: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indice < 0 || indice >= clientes.size()) {
            System.out.println("Cliente inválido!");
            return;
        }

        Pessoa cliente = clientes.get(indice);

        double altura = cliente.getAltura();
        double peso = cliente.getPeso();
        double imc = peso / (altura * altura);

        System.out.println("IMC do cliente: " + String.format("%.2f", imc));

        if (imc < 18.5) {
            System.out.println("Sugestão: Moto (perfil leve e ágil)");
        } else if (imc < 30) {
            System.out.println("Sugestão: Carro (perfil equilibrado)");
        } else {
            System.out.println("Sugestão: Caminhão (perfil robusto)");
        }
    }

    private static <V extends Veiculo> void comprarVeiculo(List<V> veiculos, V veiculo) {
        veiculos.add(veiculo);

        System.out.println(VEICULO_NOMES.get(veiculo.getClass()) + " modelo: " + veiculo.getModelo()
                + ", cadastrado com sucesso!");
        veiculo.exibirInformacoes();
    }

    private static void comprarVeiculo(Scanner scanner) {
        try {
            System.out.println("### Compra de Veiculo ###");
            int escolha;

            System.out.println("Qual novo veiculo deseja cadastrar?");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhão");
            System.out.println("0 - Voltar ao menu");
            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha > 3 || escolha < 0) {
                throw new InputMismatchException();
            }

            while (escolha != 0) {
                System.out.print("Digite a marca do veículo: ");
                String marca = scanner.nextLine();

                System.out.print("Digite o modelo do veículo: ");
                String modelo = scanner.nextLine();

                System.out.print("Digite o ano do veículo: ");
                int ano = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite a cor do veículo: ");
                String cor = scanner.nextLine();

                System.out.print("Digite o preço do veículo: ");
                double preco = scanner.nextDouble();

                switch (escolha) {
                    case 1:
                        System.out.print("Digite o numero de portas veículo: ");
                        int nPortar = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o tipo de combustivel: ");
                        String tipoCombustivel = scanner.nextLine();

                        System.out.print("Digite a capacidade do porta malas do veículo: ");
                        int capacidadePortaMalas = scanner.nextInt();
                        scanner.nextLine();

                        comprarVeiculo(carros, new Carro(marca, modelo, ano, cor, preco, nPortar, tipoCombustivel,
                                capacidadePortaMalas));

                        escolha = 0;
                        break;

                    case 2:
                        System.out.print("Digite as cilindradas do veiculo: ");
                        int cilindradas = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("O veiculo possui partida eletrica? S - sim, N - não");
                        String partida = scanner.nextLine();
                        boolean partidaEletrica;
                        if (partida.equalsIgnoreCase("S")) {
                            partidaEletrica = true;
                        } else {
                            partidaEletrica = false;
                        }

                        System.out.print("Digite a categoria do veiculo: ");
                        String categoria = scanner.nextLine();

                        comprarVeiculo(motos,
                                new Moto(marca, modelo, ano, cor, preco, cilindradas, partidaEletrica, categoria));
                        escolha = 0;
                        break;

                    case 3:
                        System.out.print("Digite a capacidade de carga do caminhão (em toneladas): ");
                        double capacidadeCarga = scanner.nextDouble();
                        scanner.nextLine();

                        comprarVeiculo(caminhoes, new Caminhao(marca, modelo, ano, cor, preco, capacidadeCarga));

                        escolha = 0;
                        break;

                    default:
                        System.out.println("Opção invalida. Tente novamente.");
                        break;
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }

    private static <V extends Veiculo> void venderVeiculo(Class<V> tipoClasse, List<V> veiculos,
            Pessoa comprador,
            double valor, Scanner scanner) throws VeiculoIndisponivelException {
        mostrarVeiculo(tipoClasse, veiculos);

        int indice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indice < 0 || indice >= veiculos.size()) {
            System.out.println("Indice invalido!");
            throw new VeiculoIndisponivelException("Índice inválido!");
        }
        
        V veiculoParaVenda = veiculos.get(indice);
        Venda novaVenda = new Venda(veiculoParaVenda, comprador, valor, LocalDateTime.now());
        vendas.add(novaVenda);
        veiculos.remove(veiculoParaVenda);
    }

    private static void venderVeiculo(Scanner scanner) {
        try {
            if (clientes.isEmpty() || (carros.isEmpty() && motos.isEmpty()) || caminhoes.isEmpty()) {
                if (clientes.isEmpty()) {
                    System.out.println("Não há clientes na base de dados!");
                }
                if (carros.isEmpty()) {
                    System.out.println("Não há carros disponiveis para vendas!");
                }
                if (motos.isEmpty()) {
                    System.out.println("Não há motos disponiveis para vendas!");
                }
                if (caminhoes.isEmpty()) {
                    System.out.println("Não há caminhões disponiveis para vendas!");
                }
            } else {
                mostrarClientes();
                Pessoa comprador = clientes.get(scanner.nextInt() - 1);
                scanner.nextLine();

                System.out.print("Informe o valor da venda: R$");
                double valor = scanner.nextDouble();
                scanner.nextLine();

                int escolha;

                System.out.println("Qual novo veiculo deseja vender?");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Caminhão");
                escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        venderVeiculo(Carro.class, carros, comprador, valor, scanner);
                        break;

                    case 2:
                        venderVeiculo(Moto.class, motos, comprador, valor, scanner);
                        break;

                    case 3:
                        venderVeiculo(Caminhao.class, caminhoes, comprador, valor, scanner);
                        break;
                }

                System.out.println("Venda executada com sucesso!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Indice invalido. Certifique-se de escolher uma opção correta!");
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }

    private static void mostrarClientes() {
        if (!clientes.isEmpty()) {
            System.out.println("### Lista de Clientes ###");
            int x = 1;
            for (Pessoa cliente : clientes) {
                System.out.println(x + " - " + cliente.getNome() + " - " + cliente.getTelefone());
                x++;
            }
        } else {
            System.out.println("Nenhuma cliente foi encontrado!");
        }
    }

    private static void cadastrarCliente(Scanner scanner) {
        try {
            System.out.println("### Cadastro de Cliente ###");

            System.out.println("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do cliente: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o endereço do cliente: ");
            String endereco = scanner.nextLine();

            System.out.println("Digite um telefone para contato do cliente: ");
            String telefone = scanner.nextLine();

            System.out.println("Digite o email do cliente: ");
            String email = scanner.nextLine();

            System.out.println("Digite a altura do cliente: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite o peso do cliente: ");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            Pessoa novoCliente = new Pessoa(nome, idade, endereco, telefone, email, altura, peso);
            clientes.add(novoCliente);

            System.out.println("O cliente: " + nome + ", foi cadastrado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }

    private static void gerarRelatorio() {
        if (vendas.isEmpty()) {
            System.out.println("Não existem vendas cadastradas!");
            return;
        }

        System.out.println("### Relatorio de vendas ###");
        System.out.println();

        for (Venda venda : vendas) {
            Veiculo veiculo = venda.getVeiculo();
            double precoCompra = veiculo.getPreco();
            double valorVenda = venda.getValor();
            double resultado = valorVenda - precoCompra;

            System.out.println("Data: " + venda.getDataVenda());
            System.out.println("Veiculo: " + veiculo.getModelo() + " - " + veiculo.getAno());
            System.out.println("Comprador: " + venda.getComprador().getNome());
            System.out.println("Preço de compra: R$" + precoCompra);
            System.out.println("Valor da venda: R$" + valorVenda);

            if (resultado > 0) {
                System.out.println("Lucro: R$" + resultado);
            } else if (resultado < 0) {
                System.out.println("Prejuizo: R$" + Math.abs(resultado));
            } else {
                System.out.println("Venda sem lucro ou prejuizo.");
            }

            System.out.println("----------------------------------------------------------------");
            System.out.println();
        }
    }
}
