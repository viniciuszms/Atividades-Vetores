import java.util.ArrayList;
import java.util.Scanner;

public class Vetores9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanho = 6;
        int[] vetor1 = new int[6];
        int[] vetor2 = new int[6];

        System.out.println("Digite os números do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os números do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        ArrayList<Integer> comuns = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (vetor1[i] == vetor2[j]) {

                    if (!comuns.contains(vetor1[i])) {
                        comuns.add(vetor1[i]);
                    }
                }
            }
        }

        int[] vetorComumFinal = new int[comuns.size()];
        for (int i = 0; i < comuns.size(); i++) {
            vetorComumFinal[i] = comuns.get(i);
        }

        System.out.println("Terceiro vetor com elementos comuns:");
        for (int num : vetorComumFinal) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

}
