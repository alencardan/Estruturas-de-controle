import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int canal, pessoas;
        int total = 0, c4 = 0, c5 = 0, c7 = 0, c12 = 0;

        System.out.print("Canal (4, 5, 7, 12 ou 0 para sair): ");
        canal = input.nextInt();

        while (canal != 0) {
            System.out.print("Número de pessoas assistindo: ");
            pessoas = input.nextInt();

            total += pessoas;
            switch (canal) {
                case 4: c4 += pessoas; break;
                case 5: c5 += pessoas; break;
                case 7: c7 += pessoas; break;
                case 12: c12 += pessoas; break;
                default: System.out.println("Canal inválido!");
            }

            System.out.print("\nCanal (4, 5, 7, 12 ou 0 para sair): ");
            canal = input.nextInt();
        }

        System.out.println("\n=== PORCENTAGEM DE AUDIÊNCIA ===");
        if (total > 0) {
            System.out.printf("Canal 4: %.2f%%\n", c4 * 100.0 / total);
            System.out.printf("Canal 5: %.2f%%\n", c5 * 100.0 / total);
            System.out.printf("Canal 7: %.2f%%\n", c7 * 100.0 / total);
            System.out.printf("Canal 12: %.2f%%\n", c12 * 100.0 / total);
        } else {
            System.out.println("Nenhum dado informado.");
        }

        input.close();
    }
}
