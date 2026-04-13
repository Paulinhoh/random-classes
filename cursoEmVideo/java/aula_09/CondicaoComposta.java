package aula_09;

import java.util.Scanner;

public class CondicaoComposta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Em qual ano você nasceu: ");
        int nasc = scan.nextInt();
        int idade = 2026 - nasc;

        if (idade > 18) {
            System.out.println(idade + " -> Maior de idade");
        } else {
            System.out.println(idade + " -> Menor de idade");
        }

        scan.close();
    }
}
