import java.util.Scanner;
import Calculos.MRU;
import Calculos.MRUV;
// import Calculos.MovimentoObliquo;
// import Calculos.MovimentoVertical;

public class Menu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char resposta = 'S'; // Inicializamos com 'S' para entrar no loop

            while (resposta == 'S' || resposta == 's') {
                int opcao = apresentarMenu(scanner);
                if (opcao == 5) {
                    break;  // Sair do loop se a opção for 5 (Sair)
                }

                resposta = pedirConfirmacao(scanner);
            }
        } catch (Exception e) {
            System.out.println("\nOpção inválida. Por favor, escolha 'S' ou 'N'.");
        }
    }

    public static int apresentarMenu(Scanner scanner) {
        System.out.println("\nEscolha uma opção:");
        System.out.println("\n1. Simular movimento retilíneo uniforme.");
        System.out.println("\n2. Simular movimento retilíneo uniformemente variável.");
        System.out.println("\n3. Simular movimento vertical.");
        System.out.println("\n4. Simular movimento oblíquo.");
        System.out.println("\n5. Sair.");
        System.out.print("\nDigite o número da opção desejada: ");

        int opcao = -1; // Valor padrão inválido

        if (scanner.hasNextInt()) {
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nVocê escolheu a opção 1: Simular movimento retilíneo uniforme");
                    MRU.executarMRU(scanner);
                    break;
                case 2:
                    System.out.println("\nVocê escolheu a opção 2: Simular movimento retilíneo uniformemente variável");
                    MRUV.executarMRUV(scanner);
                    break;
                case 3:
                    System.out.println("\nVocê escolheu a opção 3: Simular movimento vertical");
                    // MovimentoVertical.executarMovimentoVertical(scanner);
                    break;
                case 4:
                    System.out.println("\nVocê escolheu a opção 4: Simular movimento oblíquo");
                    // MovimentoObliquo.executarMovimentoObliquo(scanner);
                    break;
                case 5:
                    System.out.println("\nVocê escolheu a opção 5: Sair");
                    break;
                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } else {
            System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
            scanner.nextLine(); // Limpa a entrada do teclado
        }

        return opcao;
    }

    public static char pedirConfirmacao(Scanner scanner) {
        char resposta = ' ';

        while (resposta != 'S' && resposta != 's' && resposta != 'N' && resposta != 'n') {
            System.out.print("\nDeseja realizar uma nova operação? (S para Sim / N para Não): ");
            resposta = scanner.next().charAt(0);
            scanner.nextLine(); // Limpa a entrada do teclado

            if (resposta != 'S' && resposta != 's' && resposta != 'N' && resposta != 'n') {
                System.out.println("\nOpção inválida. Por favor, escolha 'S' ou 'N'.");
            }
        }

        return resposta;
    }
}
