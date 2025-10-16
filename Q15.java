import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalSim = 0, totalNao = 0, mulheresSim = 0, homens = 0, homensNao = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nEntrevistado " + i + ":");
            System.out.print("Sexo (M/F): ");
            char sexo = input.next().toUpperCase().charAt(0);

            System.out.print("Resposta (S/N): ");
            char resposta = input.next().toUpperCase().charAt(0);

            if (resposta == 'S') {
                totalSim++;
                if (sexo == 'F') {
                    mulheresSim++;
                }
            } else if (resposta == 'N') {
                totalNao++;
                if (sexo == 'M') {
                    homensNao++;
                }
            }

            if (sexo == 'M') {
                homens++;
            }
        }

        double porcentagemHomensNao = (homens > 0) ? (homensNao * 100.0 / homens) : 0;

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Pessoas que responderam SIM: " + totalSim);
        System.out.println("Pessoas que responderam NÃO: " + totalNao);
        System.out.println("Mulheres que responderam SIM: " + mulheresSim);
        System.out.printf("Porcentagem de homens que responderam NÃO: %.2f%%\n", porcentagemHomensNao);

        input.close();
    }
}
