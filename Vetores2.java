import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {

        int vetor[] = new int[15];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite o número " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
        }
        int maiorValor = vetor[0];
        int índiceMaiorValor = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                índiceMaiorValor = i;
            }
        }

        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O índice do maior valor é: " + índiceMaiorValor);

        scanner.close();
    }

}
