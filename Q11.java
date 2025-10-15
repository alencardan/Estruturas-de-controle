import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Q11 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double valorCarro = readPositiveDouble("Digite o valor do carro: R$ ");

        // Tabela de parcelas e acréscimos
        int[] parcelas = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
        double[] acrescimos = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("\n=== Tabela de Pagamento ===");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-12s %-12s %-20s %-20s%n", "Parcelas", "Acréscimo", "Preço Final", "Valor da Parcela");
        System.out.println("---------------------------------------------------------------------");

        // À vista (20% de desconto)
        double precoVista = valorCarro * 0.8;
        System.out.printf("%-12s %-12s %-20s %-20s%n",
                "À vista",
                "-20%",
                nf.format(precoVista),
                "-");

        // Parcelamentos com acréscimos
        for (int i = 0; i < parcelas.length; i++) {
            double precoFinal = valorCarro * (1.0 + acrescimos[i] / 100.0);
            double valorParcela = precoFinal / parcelas[i];

            System.out.printf("%-12d %-11s %-20s %-20s%n",
                    parcelas[i],
                    String.format("+%.0f%%", acrescimos[i]),
                    nf.format(precoFinal),
                    nf.format(valorParcela));
        }

        System.out.println("---------------------------------------------------------------------");
        sc.close();
    }

    // Lê double positivo, aceita vírgula como separador decimal
    private static double readPositiveDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("Entrada vazia. Tente novamente.");
                continue;
            }
            line = line.replace(",", "."); // aceita vírgula
            try {
                double v = Double.parseDouble(line);
                if (v <= 0) {
                    System.out.println("Digite um valor maior que zero.");
                    continue;
                }
                return v;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número (ex: 50000 ou 50.000,00).");
            }
        }
    }
}
