import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPessoas = 5;
        int contMaior50 = 0;
        int contIdade10a20 = 0;
        double somaAlturas10a20 = 0;
        int contPesoMenor40 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\n===== Pessoa " + i + " =====");
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = input.nextDouble();
            System.out.print("Peso (em kg): ");
            double peso = input.nextDouble();

            // Pessoas com idade superior a 50
            if (idade > 50) {
                contMaior50++;
            }

            // Pessoas entre 10 e 20 anos (para média de altura)
            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                contIdade10a20++;
            }

            // Pessoas com peso inferior a 40 kg
            if (peso < 40) {
                contPesoMenor40++;
            }
        }

        // Cálculos finais
        double mediaAlturas = (contIdade10a20 > 0) ? (somaAlturas10a20 / contIdade10a20) : 0;
        double percPesoMenor40 = (contPesoMenor40 * 100.0) / totalPessoas;

        // Exibição dos resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Quantidade de pessoas com mais de 50 anos: " + contMaior50);
        System.out.printf("Média das alturas (10 a 20 anos): %.2f m\n", mediaAlturas);
        System.out.printf("Porcentagem com peso < 40 kg: %.2f%%\n", percPesoMenor40);

        input.close();
    }
}
