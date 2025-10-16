import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Novo Salário");
            System.out.println("2 - Férias");
            System.out.println("3 - Décimo Terceiro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Digite o salário atual: R$ ");
                double salario = input.nextDouble();

                switch (opcao) {
                    case 1:
                        if (salario <= 1200)
                            salario *= 1.15;
                        else if (salario <= 2400)
                            salario *= 1.10;
                        else
                            salario *= 1.05;
                        System.out.printf("Novo salário: R$ %.2f\n", salario);
                        break;

                    case 2:
                        double ferias = salario + (salario / 3);
                        System.out.printf("Valor das férias: R$ %.2f\n", ferias);
                        break;

                    case 3:
                        System.out.print("Meses trabalhados (1 a 12): ");
                        int meses = input.nextInt();
                        double decimo = (salario * meses) / 12;
                        System.out.printf("Décimo terceiro: R$ %.2f\n", decimo);
                        break;
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida! Escolha entre 1 e 4.");
            }

        } while (opcao != 4);

        System.out.println("Encerrando...");
        input.close();
    }
}
