import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPessoas = 10;
        int somaIdades = 0;
        int qtdPesoAltura = 0; // peso > 90 e altura < 1.50
        int qtdMais190 = 0; // pessoas com altura > 1.90
        int qtdEntre10e30 = 0; // pessoas entre 10 e 30 anos e altura > 1.90

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\n--- Pessoa " + i + " ---");

            System.out.print("Idade: ");
            int idade = input.nextInt();

            System.out.print("Peso (kg): ");
            double peso = input.nextDouble();

            System.out.print("Altura (m): ");
            double altura = input.nextDouble();

            somaIdades += idade;

            // 2) Pessoas com peso > 90 e altura < 1.50
            if (peso > 90 && altura < 1.50) {
                qtdPesoAltura++;
            }

            // 3) Idade entre 10 e 30 e altura > 1.90
            if (altura > 1.90) {
                qtdMais190++;
                if (idade >= 10 && idade <= 30) {
                    qtdEntre10e30++;
                }
            }
        }

        // 1) Média das idades
        double mediaIdade = (double) somaIdades / totalPessoas;

        // 3) Porcentagem de pessoas entre 10 e 30 anos entre as que têm mais de 1.90m
        double porcentagem = (qtdMais190 > 0) ? ((double) qtdEntre10e30 / qtdMais190) * 100 : 0;

        System.out.println("\n=== Resultados ===");
        System.out.println("1) Média das idades: " + String.format("%.2f", mediaIdade));
        System.out.println("2) Pessoas com peso > 90 kg e altura < 1,50 m: " + qtdPesoAltura);
        System.out.println("3) Porcentagem de pessoas (10–30 anos e >1,90 m): " + String.format("%.1f", porcentagem) + "%");

        input.close();
    }
}
