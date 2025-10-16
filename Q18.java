import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, cont = 0, maiorIdade = 0, menorIdade = 0;
        double salario, somaSalarios = 0, menorSalario = Double.MAX_VALUE;
        String sexo, pessoaMenorSalario = "";
        int mulheresAte200 = 0;

        System.out.print("Idade (negativa para sair): ");
        idade = input.nextInt();

        while (idade >= 0) {
            System.out.print("Sexo (M/F): ");
            sexo = input.next().toUpperCase();

            System.out.print("Salário: R$ ");
            salario = input.nextDouble();

            somaSalarios += salario;
            cont++;

            if (cont == 1 || idade > maiorIdade) maiorIdade = idade;
            if (cont == 1 || idade < menorIdade) menorIdade = idade;

            if (sexo.equals("F") && salario <= 200) mulheresAte200++;

            if (salario < menorSalario) {
                menorSalario = salario;
                pessoaMenorSalario = "Idade: " + idade + " | Sexo: " + sexo + " | Salário: R$ " + salario;
            }

            System.out.print("\nIdade (negativa para sair): ");
            idade = input.nextInt();
        }

        if (cont > 0) {
            double mediaSalarios = somaSalarios / cont;
            System.out.println("\n=== RESULTADOS ===");
            System.out.printf("Média dos salários: R$ %.2f\n", mediaSalarios);
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Mulheres com salário até R$200: " + mulheresAte200);
            System.out.println("Pessoa com menor salário -> " + pessoaMenorSalario);
        } else {
            System.out.println("Nenhum dado informado.");
        }

        input.close();
    }
}
