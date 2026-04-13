package aula_11;

public class While02 {
    public static void main(String[] args) {
        int cc = 0;

        while (cc < 10) {
            cc++;

            if (cc == 5 || cc == 7 || cc == 9) {
                continue;
            }

            System.out.println("Cambalhota " + cc);
        }
    }
}
