import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, cont = 0;
        double altura, somaAlturas = 0;

        System.out.print("Idade (<=0 para encerrar): ");
        idade = input.nextInt();

        while (idade > 0) {
            System.out.print("Altura (em metros): ");
            altura = input.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                cont++;
            }

            System.out.print("\nIdade (<=0 para encerrar): ");
            idade = input.nextInt();
        }

        if (cont > 0) {
            double media = somaAlturas / cont;
            System.out.printf("Média das alturas (idade > 50): %.2f m\n", media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos.");
        }

        input.close();
    }
}
