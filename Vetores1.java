import java.util.Scanner;

public class Vetores1 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        int soma = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma dos valores do vetor é: " + soma);

        scanner.close();
    }

}
