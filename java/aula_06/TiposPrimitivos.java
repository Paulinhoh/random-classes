package aula_06;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();

        System.out.print("Digite a nota do aluno: ");
        float nota = scan.nextFloat();

        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        scan.close();

        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
    }
}
