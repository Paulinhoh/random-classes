package aula_15;

public class Funcao01 {
    public static void main(String[] args) {
        System.out.println("começou o programa!");
        soma(5, 2);

        int sm = soma2(5, 2);
        System.out.println("A soma2 é: " + sm);
    }

    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é: " + s);
    }

    static int soma2(int a, int b) {
        int s = a + b;
        return s;
    }
}
