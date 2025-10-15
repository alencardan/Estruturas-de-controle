import java.util.Scanner;

public class Q8 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdIdadePeso = 0; // idade > 50 e peso < 60
        int somaIdadeAltura = 0; // soma das idades p/ média
        int contAltura = 0; // contador de pessoas com altura < 1.50
        int olhosAzuis = 0; // contador de olhos azuis
        int ruivosSemAzul = 0; // ruivos sem olhos azuis
        final int TOTAL = 6;

        System.out.println("Pesquisa de 6 pessoas\n");

        for (int i = 1; i <= TOTAL; i++) {
            System.out.println("--- Pessoa " + i + " ---");

            int idade = readInt("Idade (anos): ");
            double peso = readDouble("Peso (kg) — use ponto para decimal: ");
            double altura = readDouble("Altura (m) — use ponto para decimal: ");
            char olhos = readCharOption("Cor dos olhos (A=Azul, P=Preto, V=Verde, C=Castanho): ",
                                       new char[] {'A','P','V','C'});
            char cabelos = readCharOption("Cor dos cabelos (P=Preto, C=Castanho, L=Louro, R=Ruivo): ",
                                          new char[] {'P','C','L','R'});

            if (idade > 50 && peso < 60.0) {
                qtdIdadePeso++;
            }

            if (altura < 1.50) {
                somaIdadeAltura += idade;
                contAltura++;
            }

            if (olhos == 'A') {
                olhosAzuis++;
            }

            if (cabelos == 'R' && olhos != 'A') {
                ruivosSemAzul++;
            }

            System.out.println();
        }

        double mediaIdade = (contAltura > 0) ? (double) somaIdadeAltura / contAltura : 0.0;
        double percAzuis = ((double) olhosAzuis / TOTAL) * 100.0;

        System.out.println("=== Resultados da Pesquisa ===");
        System.out.println("1) Pessoas com idade > 50 e peso < 60 kg: " + qtdIdadePeso);
        if (contAltura > 0) {
            System.out.println("2) Média das idades (altura < 1,50 m): " + String.format("%.2f", mediaIdade));
        } else {
            System.out.println("2) Média das idades (altura < 1,50 m): não houve pessoas com altura < 1,50 m.");
        }
        System.out.println("3) Porcentagem com olhos azuis: " + String.format("%.1f", percAzuis) + "%");
        System.out.println("4) Ruivos sem olhos azuis: " + ruivosSemAzul);

        sc.close();
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim().replace(',', '.'); // aceita vírgula
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número (ex: 70.5).");
            }
        }
    }

    private static char readCharOption(String prompt, char[] allowed) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim().toUpperCase();
            if (line.isEmpty()) {
                System.out.println("Entrada vazia. Tente novamente.");
                continue;
            }
            char c = line.charAt(0);
            for (char a : allowed) {
                if (c == a) {
                    return c;
                }
            }
            System.out.print("Opção inválida. Valores permitidos: ");
            for (int i = 0; i < allowed.length; i++) {
                System.out.print(allowed[i] + (i < allowed.length - 1 ? ", " : "\n"));
            }
        }
    }
}
