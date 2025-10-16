import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE OPÇÕES ===");
            System.out.println("1 - Média Aritmética (2 notas)");
            System.out.println("2 - Média Ponderada (3 notas e pesos)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    double n1, n2;
                    System.out.print("Digite a primeira nota: ");
                    n1 = input.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    n2 = input.nextDouble();
                    double mediaArit = (n1 + n2) / 2;
                    System.out.printf("Média Aritmética: %.2f\n", mediaArit);
                    break;

                case 2:
                    double nota1, nota2, nota3;
                    double p1, p2, p3;
                    System.out.print("Nota 1: ");
                    nota1 = input.nextDouble();
                    System.out.print("Peso 1: ");
                    p1 = input.nextDouble();
                    System.out.print("Nota 2: ");
                    nota2 = input.nextDouble();
                    System.out.print("Peso 2: ");
                    p2 = input.nextDouble();
                    System.out.print("Nota 3: ");
                    nota3 = input.nextDouble();
                    System.out.print("Peso 3: ");
                    p3 = input.nextDouble();
                    double mediaPond = (nota1 * p1 + nota2 * p2 + nota3 * p3) / (p1 + p2 + p3);
                    System.out.printf("Média Ponderada: %.2f\n", mediaPond);
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
            }
        } while (opcao != 3);

        input.close();
    }
}
