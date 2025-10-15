import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPessoas = 8;
        int faixa1 = 0; // até 15 anos
        int faixa2 = 0; // de 16 a 30 anos
        int faixa3 = 0; // de 31 a 45 anos
        int faixa4 = 0; // de 46 a 60 anos
        int faixa5 = 0; // acima de 60 anos

        // Leitura das idades
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = input.nextInt();

            // Verifica a faixa etária correspondente
            if (idade <= 15) {
                faixa1++;
            } else if (idade <= 30) {
                faixa2++;
            } else if (idade <= 45) {
                faixa3++;
            } else if (idade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }
        }

        // Cálculo das porcentagens
        double percFaixa1 = (faixa1 * 100.0) / totalPessoas;
        double percFaixa5 = (faixa5 * 100.0) / totalPessoas;

        // Exibição dos resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Faixa Etária\t\tIdade\t\tQuantidade");
        System.out.println("---------------------------------------------");
        System.out.println("1ª Faixa\t\tAté 15 anos\t\t" + faixa1);
        System.out.println("2ª Faixa\t\t16 a 30 anos\t" + faixa2);
        System.out.println("3ª Faixa\t\t31 a 45 anos\t" + faixa3);
        System.out.println("4ª Faixa\t\t46 a 60 anos\t" + faixa4);
        System.out.println("5ª Faixa\t\tAcima de 60 anos\t" + faixa5);

        System.out.printf("\nPorcentagem até 15 anos: %.2f%%\n", percFaixa1);
        System.out.printf("Porcentagem acima de 60 anos: %.2f%%\n", percFaixa5);

        input.close();
    }
}
