import java.util.ArrayList;
import java.util.List;

public class Vetores8 {
    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 4, 5, 6, 7, 8 };

        List<Integer> C = new ArrayList<>();

        for (int num : A) {
            if (!C.contains(num)) {
                C.add(num);
            }
        }

        for (int num : B) {
            if (!C.contains(num)) {
                C.add(num);
            }
        }

        System.out.println("Vetor C (união): " + C);
    }
}