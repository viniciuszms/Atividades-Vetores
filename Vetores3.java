import java.util.Scanner;

public class Vetores3 {
    public static void main(String[] args) {

        int vetor[] = new int[20];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
        }
        int númerosPares = 0;
        for (int i = 0; i < 20; i++) {
            if (vetor[i] % 2 == 0) {
                númerosPares++;
            }

        }
        System.out.println("A quantidade de números pares é: " + númerosPares);

        scanner.close();
    }
}
