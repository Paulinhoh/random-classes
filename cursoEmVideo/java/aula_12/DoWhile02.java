package aula_12;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, s = 0;
        String resp = "s";

        do {
            System.out.print("Digite um numero: ");
            n = scan.nextInt();
            s += n;
            System.out.println("Quer continuar [s/n]: ");
            resp = scan.next();
        } while (resp.equals("s"));

        System.out.println("A soma de todos os valores é: " + s);

        scan.close();
    }
}
