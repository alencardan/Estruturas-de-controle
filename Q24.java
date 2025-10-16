import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.print("Digite um número (0 para encerrar): ");
        num = input.nextInt();

        while (num != 0) {
            if (num > 0) {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            } else {
                System.out.println("Número negativo ignorado.");
            }

            System.out.print("Digite um número (0 para encerrar): ");
            num = input.nextInt();
        }

        if (maior != Integer.MIN_VALUE) {
            System.out.println("\nMaior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor positivo informado.");
        }

        input.close();
    }
}
