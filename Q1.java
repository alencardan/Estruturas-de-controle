import java.util.Arrays;  
import java.util.Scanner; 

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // O programa vai ler 5 grupos de 4 valores cada (A, B, C, D)
        for (int grupo = 1; grupo <= 5; grupo++) {
            System.out.println("\n===== Grupo " + grupo + " =====");
            double[] valores = new double[4];

            // Leitura dos 4 valores do grupo
            for (int i = 0; i < 4; i++) {
                char letra = (char) ('A' + i); // gera A, B, C, D automaticamente
                System.out.print("Digite o valor " + letra + ": ");
                valores[i] = input.nextDouble();
            }

            // Mostra os valores na ordem lida
            System.out.println("Ordem lida: " + Arrays.toString(valores));

            // Ordenação crescente
            double[] crescente = valores.clone(); // copia o vetor original
            Arrays.sort(crescente);
            System.out.println("Ordem crescente: " + Arrays.toString(crescente));

            // Ordenação decrescente (invertendo o vetor ordenado)
            double[] decrescente = crescente.clone();
            for (int i = 0; i < decrescente.length / 2; i++) {
                double temp = decrescente[i];
                decrescente[i] = decrescente[decrescente.length - 1 - i];
                decrescente[decrescente.length - 1 - i] = temp;
            }
            System.out.println("Ordem decrescente: " + Arrays.toString(decrescente));
        }

        input.close();
        System.out.println("\nPrograma finalizado com sucesso!");
    }
}
