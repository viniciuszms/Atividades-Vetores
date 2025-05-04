import java.util.Random;
import java.util.Scanner;

public class Vetores7 {
    public static void main(String[] args) {

        int[] vetor = new int[15];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
        }

        System.out.println("Vetor preenchido: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Digite um número para contar quantas vezes aparece no vetor: ");
        int numero = scanner.nextInt();

        int contador = 0;
        for (int num : vetor) {
            if (num == numero) {
                contador++;
            }
        }

        System.out.println("O número " + numero + " aparece " + contador + " vezes no vetor.");

        scanner.close();
    }
}