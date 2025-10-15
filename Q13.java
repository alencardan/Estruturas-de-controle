import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPessoas = 15;

        double somaPeso1a10 = 0, somaPeso11a20 = 0, somaPeso21a30 = 0, somaPeso31mais = 0;
        int cont1a10 = 0, cont11a20 = 0, cont21a30 = 0, cont31mais = 0;

        System.out.println("=== Média de Peso por Faixa Etária ===");

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\n--- Pessoa " + i + " ---");

            System.out.print("Idade: ");
            int idade = input.nextInt();

            System.out.print("Peso (kg): ");
            double peso = input.nextDouble();

            if (idade >= 1 && idade <= 10) {
                somaPeso1a10 += peso;
                cont1a10++;
            } else if (idade >= 11 && idade <= 20) {
                somaPeso11a20 += peso;
                cont11a20++;
            } else if (idade >= 21 && idade <= 30) {
                somaPeso21a30 += peso;
                cont21a30++;
            } else if (idade > 30) {
                somaPeso31mais += peso;
                cont31mais++;
            }
        }

        System.out.println("\n=== Resultados ===");
        System.out.println("Média de peso (1 a 10 anos): " + media(somaPeso1a10, cont1a10));
        System.out.println("Média de peso (11 a 20 anos): " + media(somaPeso11a20, cont11a20));
        System.out.println("Média de peso (21 a 30 anos): " + media(somaPeso21a30, cont21a30));
        System.out.println("Média de peso (acima de 30 anos): " + media(somaPeso31mais, cont31mais));

        input.close();
    }

    // Função auxiliar para calcular a média com verificação de divisão por zero
    public static String media(double soma, int contador) {
        if (contador == 0) {
            return "sem pessoas nessa faixa";
        } else {
            return String.format("%.2f kg", soma / contador);
        }
    }
}

