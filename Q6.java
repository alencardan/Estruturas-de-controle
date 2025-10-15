import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalVista = 0;   // Soma das compras à vista
        double totalPrazo = 0;   // Soma das compras a prazo

        // Ler 15 transações
        for (int i = 1; i <= 15; i++) {
            System.out.println("\nTransação " + i + ":");
            System.out.print("Digite o código (V - à vista / P - a prazo): ");
            char codigo = input.next().toUpperCase().charAt(0); // converte para maiúscula

            System.out.print("Digite o valor da compra: R$ ");
            double valor = input.nextDouble();

            // Verifica o tipo de transação
            if (codigo == 'V') {
                totalVista += valor;
            } else if (codigo == 'P') {
                totalPrazo += valor;
            } else {
                System.out.println("⚠️ Código inválido! Use apenas V ou P.");
                i--; // repete a leitura dessa transação
            }
        }

        // Exibe os resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Total das compras à vista: R$ %.2f%n", totalVista);
        System.out.printf("Total das compras a prazo: R$ %.2f%n", totalPrazo);

        input.close();
    }
}

