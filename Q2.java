public class Q2 {
    public static void main(String[] args) {
        double preco = 5.0;           // preço inicial do ingresso
        double despesas = 200.0;      // despesas fixas
        int ingressos = 120;          // quantidade inicial de ingressos
        double lucroMaximo = 0.0;     // variável para guardar o maior lucro
        double precoLucroMaximo = 0.0;
        int ingressosLucroMaximo = 0;

        System.out.println("Preço (R$)\tIngressos\tLucro (R$)");
        System.out.println("---------------------------------------");

        // Loop para variar o preço de R$ 5,00 até R$ 1,00 (em passos de R$ 0,50)
        for (preco = 5.0; preco >= 1.0; preco -= 0.5) {
            // Cálculo dos ingressos vendidos conforme o desconto
            // A cada R$ 0,50 de desconto -> +26 ingressos
            int aumento = (int) ((5.0 - preco) / 0.5) * 26;
            int totalIngressos = ingressos + aumento;

            // Cálculo do lucro: (preço * ingressos) - despesas
            double lucro = (preco * totalIngressos) - despesas;

            // Mostra a linha da tabela
            System.out.printf("%.2f\t\t%d\t\t%.2f%n", preco, totalIngressos, lucro);

            // Verifica se é o maior lucro até agora
            if (lucro > lucroMaximo) {
                lucroMaximo = lucro;
                precoLucroMaximo = preco;
                ingressosLucroMaximo = totalIngressos;
            }
        }

        // Exibe o lucro máximo e seus dados
        System.out.println("\n=======================================");
        System.out.printf("Lucro máximo: R$ %.2f%n", lucroMaximo);
        System.out.printf("Preço correspondente: R$ %.2f%n", precoLucroMaximo);
        System.out.printf("Ingressos vendidos: %d%n", ingressosLucroMaximo);
    }
}