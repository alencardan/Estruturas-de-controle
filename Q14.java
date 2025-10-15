import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPessoas = 15;
        int somaIdadesOtimo = 0, contOtimo = 0;
        int contRegular = 0, contBom = 0;

        System.out.println("=== Pesquisa de Opinião ===");
        System.out.println("Use: 3 = Ótimo, 2 = Bom, 1 = Regular\n");

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("--- Pessoa " + i + " ---");

            System.out.print("Idade: ");
            int idade = input.nextInt();

            int opiniao;
            do {
                System.out.print("Opinião (1-Regular, 2-Bom, 3-Ótimo): ");
                opiniao = input.nextInt();
                if (opiniao < 1 || opiniao > 3) {
                    System.out.println("Opção inválida! Digite 1, 2 ou 3.");
                }
            } while (opiniao < 1 || opiniao > 3);

            if (opiniao == 3) {
                somaIdadesOtimo += idade;
                contOtimo++;
            } else if (opiniao == 2) {
                contBom++;
            } else {
                contRegular++;
            }

            System.out.println();
        }

        double mediaOtimo = (contOtimo > 0) ? (double) somaIdadesOtimo / contOtimo : 0.0;
        double percBom = ((double) contBom / totalPessoas) * 100.0;

        System.out.println("=== Resultados da Pesquisa ===");
        if (contOtimo > 0) {
            System.out.printf("1) Média das idades (ótimo): %.2f anos%n", mediaOtimo);
        } else {
            System.out.println("1) Média das idades (ótimo): nenhuma pessoa respondeu 'ótimo'.");
        }
        System.out.println("2) Quantidade de pessoas que responderam 'regular': " + contRegular);
        System.out.printf("3) Porcentagem de pessoas que responderam 'bom': %.1f%%%n", percBom);

        input.close();
    }
}
