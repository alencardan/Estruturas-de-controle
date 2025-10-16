import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int voto, c1 = 0, c2 = 0, c3 = 0, c4 = 0, nulo = 0, branco = 0, total = 0;

        System.out.print("Digite o código do voto (1 a 6, 0 para encerrar): ");
        voto = input.nextInt();

        while (voto != 0) {
            switch (voto) {
                case 1: c1++; break;
                case 2: c2++; break;
                case 3: c3++; break;
                case 4: c4++; break;
                case 5: nulo++; break;
                case 6: branco++; break;
                default:
                    System.out.println("Código inválido! Use 1-6 ou 0 para sair.");
            }

            total++;
            System.out.print("Digite o código do voto (1 a 6, 0 para encerrar): ");
            voto = input.nextInt();
        }

        System.out.println("\n=== RESULTADOS DA VOTAÇÃO ===");
        System.out.println("Candidato 1: " + c1 + " voto(s)");
        System.out.println("Candidato 2: " + c2 + " voto(s)");
        System.out.println("Candidato 3: " + c3 + " voto(s)");
        System.out.println("Candidato 4: " + c4 + " voto(s)");
        System.out.println("Nulos: " + nulo);
        System.out.println("Brancos: " + branco);

        if (total > 0) {
            System.out.printf("Porcentagem de votos nulos: %.2f%%\n", (nulo * 100.0 / total));
            System.out.printf("Porcentagem de votos brancos: %.2f%%\n", (branco * 100.0 / total));
        } else {
            System.out.println("Nenhum voto registrado.");
        }

        input.close();
    }
}
