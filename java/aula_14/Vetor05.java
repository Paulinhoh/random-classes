package aula_14;

import java.util.Arrays;

public class Vetor05 {
    public static void main(String[] args) {
        int vet[] = new int[20];
        Arrays.fill(vet, 0);

        for (int i : vet) {
            System.out.print(i + " ");
        }
    }
}
