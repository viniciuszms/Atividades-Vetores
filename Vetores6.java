import java.util.Scanner;

public class Vetores6 {
    public static void main(String[] args) {

        int vetor[] = { 10, 4, 16, 8, 30, 55, 72, 91, 24, 60 };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número que deseja remover: ");
        int numeroRemover = scanner.nextInt();

        boolean removido = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroRemover) {

                for (int j = i; j < vetor.length - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                removido = true;
                break;
            }
        }

        if (removido) {
            System.out.println("Vetor após remoção:");
            for (int num : vetor) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Número não encontrado no vetor.");
        }

        scanner.close();
    }
}