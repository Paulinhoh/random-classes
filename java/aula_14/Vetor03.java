package aula_14;

import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        int n[] = { 3, 2, 8, 7, 5, 4 };
        Arrays.sort(n);

        for (int i : n) {
            System.out.print(i + " ");
        }
    }
}
