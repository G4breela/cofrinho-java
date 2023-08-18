import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        cofrinho cofrinho = new cofrinho();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Escolha o tipo de moeda:");
                System.out.println("1. Real");
                System.out.println("2. Dólar");
                System.out.println("3. Euro");
                int tipoMoeda = scanner.nextInt();
            
                System.out.print("Digite o valor da moeda: ");
                double valorMoeda = scanner.nextDouble();
            
                moeda novaMoeda;
            
                switch (tipoMoeda) {

                    case 1: // Lógica para adicionar moeda ao cofrinho

                        novaMoeda = new real(valorMoeda);
                        break;
                    case 2:
                        novaMoeda = new dolar(valorMoeda);
                        break;
                    case 3:
                        novaMoeda = new euro(valorMoeda);
                        break;
                    default:
                        System.out.println("Tipo de moeda inválido.");
                        continue; // Volta ao início do loop
                }
            
                    cofrinho.adicionarMoeda(novaMoeda);
                    System.out.println("Moeda adicionada ao cofrinho.");
            
                    break;

                    case 2:  // Lógica para remover moeda do cofrinho
    
                    if (cofrinho.getMoedas().isEmpty()) {
                    System.out.println("O cofrinho está vazio. Não há moedas para remover.");
                    break;
                    }

                    System.out.println("Moedas no cofrinho:");
                    cofrinho.listarMoedas();

                    System.out.print("Digite o número da moeda que deseja remover: ");
                    int indiceMoeda = scanner.nextInt();

                    if (indiceMoeda >= 1 && indiceMoeda <= cofrinho.getMoedas().size()) {
                        cofrinho.removerMoeda(indiceMoeda - 1);
                        System.out.println("Moeda removida do cofrinho.");
                    } else {
                        System.out.println("Número de moeda inválido.");
                    }

                    break;

                    case 3: // Lógica para listar moedas no cofrinho

                    if (cofrinho.getMoedas().isEmpty()) {
                        System.out.println("O cofrinho está vazio. Não há moedas para listar.");
                    } else {
                        System.out.println("Moedas no cofrinho:");
                        cofrinho.listarMoedas();
                    }
            
                    break;

                    case 4: // Conversão do total de moedas em Real
                    double totalReal = cofrinho.calcularTotalEmReal();
                    System.out.println("Total em Real: " + totalReal);
                    break;

                    case 5: 

                    System.out.println("Encerrando o programa.");
                    break;
                    default:
                    System.out.println("Opção inválida. Escolha novamente.");
                }

            } while (opcao != 5);
        }
    }
}
