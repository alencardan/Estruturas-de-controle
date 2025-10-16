import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo;
        double valor, rendimento = 0, totalInvestido = 0, totalJuros = 0;
        char tipo;

        System.out.print("Código do cliente (<=0 para encerrar): ");
        codigo = input.nextInt();

        while (codigo > 0) {
            System.out.print("Tipo de investimento (P= Poupança, L= Plus, R= Renda Fixa): ");
            tipo = input.next().toUpperCase().charAt(0);

            System.out.print("Valor investido: R$ ");
            valor = input.nextDouble();

            switch (tipo) {
                case 'P':
                    rendimento = valor * 0.015;
                    break;
                case 'L':
                    rendimento = valor * 0.02;
                    break;
                case 'R':
                    rendimento = valor * 0.04;
                    break;
                default:
                    System.out.println("Tipo inválido! Sem rendimento calculado.");
                    rendimento = 0;
            }

            System.out.printf("Rendimento mensal: R$ %.2f\n\n", rendimento);

            totalInvestido += valor;
            totalJuros += rendimento;

            System.out.print("Código do cliente (<=0 para encerrar): ");
            codigo = input.nextInt();
        }

        System.out.println("\n=== RESUMO FINAL ===");
        System.out.printf("Total investido: R$ %.2f\n", totalInvestido);
        System.out.printf("Total de juros pagos: R$ %.2f\n", totalJuros);

        input.close();
    }
}
