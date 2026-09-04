package aula_14;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = { 3, 7, 6, 1, 9, 4, 2 };

        for (int i : vet) {
            System.out.print(i + " ");
        }

        int pos = Arrays.binarySearch(vet, 1);
        System.out.println("\nEncontrei o valor 1 na posição: " + pos);
    }
}
