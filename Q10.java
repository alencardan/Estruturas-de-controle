import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somaPares = 0;
        int somaPrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = input.nextInt();

            // Soma dos pares
            if (num % 2 == 0) {
                somaPares += num;
            }

            // Soma dos primos
            if (ehPrimo(num)) {
                somaPrimos += num;
            }
        }

        System.out.println("\n=== Resultados ===");
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números primos: " + somaPrimos);

        input.close();
    }

    // Função auxiliar para verificar se um número é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false; // 0, 1 e negativos não são primos
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
