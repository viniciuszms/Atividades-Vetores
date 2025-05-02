import java.util.Scanner;

public class Vetores4 {
    public static void main(String[] args) {

        int vetor[] = new int[8];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Vetor em ordem inversa: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }

}
