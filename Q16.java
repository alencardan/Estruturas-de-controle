import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, soma = 0, cont = 0;

        System.out.print("Digite uma idade (0 para finalizar): ");
        idade = input.nextInt();

        while (idade != 0) {
            soma += idade;
            cont++;
            System.out.print("Digite outra idade (0 para finalizar): ");
            idade = input.nextInt();
        }

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("Média das idades: %.2f\n", media);
        } else {
            System.out.println("Nenhuma idade informada.");
        }

        input.close();
    }
}
