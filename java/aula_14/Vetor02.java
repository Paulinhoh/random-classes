package aula_14;

public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dec" };
        int dias[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = 0; i < mes.length; i++) {
            System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias.");
        }
    }
}
