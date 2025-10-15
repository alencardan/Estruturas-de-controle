import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdPrimos = 0;

        System.out.println("=== Verificação de Números Primos ===");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int num = input.nextInt();

            if (ehPrimo(num)) {
                qtdPrimos++;
            }
        }

        System.out.println("\nQuantidade de números primos digitados: " + qtdPrimos);

        input.close();
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false; // 0, 1 e negativos não são primos
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
