package aula_09;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a 1° nota: ");
        float n1 = scan.nextFloat();
        System.out.print("Digite a 2° nota: ");
        float n2 = scan.nextFloat();

        float media = (n1 + n2) / 2;
        System.out.println("Sua média foi: " + media);

        if (media > 9) {
            System.out.println("Parabéns pequeno gafanhoto!");
        }

        scan.close();
    }
}
