import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char tipo;
        double compra, venda, lucro, lucroTotal = 0;
        int lucroMaior1000 = 0, lucroMenor200 = 0;

        System.out.print("Tipo da ação (ou F para finalizar): ");
        tipo = input.next().toUpperCase().charAt(0);

        while (tipo != 'F') {
            System.out.print("Preço de compra: R$ ");
            compra = input.nextDouble();
            System.out.print("Preço de venda: R$ ");
            venda = input.nextDouble();

            lucro = venda - compra;
            lucroTotal += lucro;

            if (lucro > 1000) lucroMaior1000++;
            if (lucro < 200) lucroMenor200++;

            System.out.printf("Lucro da ação %c: R$ %.2f\n\n", tipo, lucro);

            System.out.print("Tipo da ação (ou F para finalizar): ");
            tipo = input.next().toUpperCase().charAt(0);
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Ações com lucro > R$1000: " + lucroMaior1000);
        System.out.println("Ações com lucro < R$200: " + lucroMenor200);
        System.out.printf("Lucro total: R$ %.2f\n", lucroTotal);

        input.close();
    }
}
