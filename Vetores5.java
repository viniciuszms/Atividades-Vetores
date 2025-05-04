import java.util.Scanner;

public class Vetores5 {
    public static void main(String[] args) {

        int vetor[] = new int[12];
        int somaValores = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
            somaValores += vetor[i];
        }

        double média = somaValores / 12;
        System.out.printf("A média dos valores é: %.2f%n", média);

        int maioresMédia = 0;
        for (int num : vetor) {
            if (num > média) {
                maioresMédia++;
            }
        }
        System.out.println("A quantidade de números maiores que a média é de: " + maioresMédia);

        scanner.close();

    }
}
