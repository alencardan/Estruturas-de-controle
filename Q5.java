public class Q5 {
    public static void main(String[] args) {

        // Laço externo: percorre os números de 1 a 10
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("\nTabuada do " + numero + ":");
            System.out.println("----------------------");

            // Laço interno: gera a tabuada de 0 até 10 para cada número
            for (int i = 0; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }

        System.out.println("\nTodas as tabuadas foram exibidas com sucesso!");
    }
}
