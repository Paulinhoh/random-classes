package aula_14;

public class Vetor01 {
    public static void main(String[] args) {
        int n[] = { 3, 2, 8, 7, 5, 4 };

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        for (int i : n) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Total de casas de n: " + n.length);
    }
}
