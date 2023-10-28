import java.util.Scanner;
import Calculos.MRU;

public class Menu {
    public static void main(String[] args) {
        apresentarMenu();
    }

    public static void apresentarMenu(){
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;

            do{
                System.out.println("Escolha uma opção:");
                System.out.println("1. Simular movimento retilíneo uniforme");
                System.out.println("2. Simular movimento retilíneo uniformemente variável");
                System.out.println("3. Simular movimento vertical");
                System.out.println("4. Simular movimento oblíquo");
                System.out.println("5. Sair");
                System.out.println("Digite o número da opção desejada: ");

                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.println("Você escolheu a opção 1: Simular movimento retilíneo uniforme");
                            MRU.executarMRU(); // Chame o método da classe MRU
                            break;
                        case 2:
                            System.out.println("Você escolheu a opção 2: Simular movimento retilíneo uniformemente variável");
                            break;
                        case 3:
                            System.out.println("Você escolheu a opção 3: Simular movimento vertical");
                            break;
                        case 4:
                            System.out.println("Você escolheu a opção 4: Simular movimento oblíquo");
                            break;
                        case 5:
                            System.out.println("Você escolheu a opção 5: Sair");
                            break;
                        default:
                            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                            break;
                    }
               
                } else {
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    scanner.nextLine();
                    opcao = 0;
                }
            }while(opcao != 5);
        }
    }
}
