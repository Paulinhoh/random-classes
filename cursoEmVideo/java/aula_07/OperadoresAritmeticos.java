package aula_07;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        // /, *, %, +, -
        int n1 = 5;
        int n2 = 3;
        float media = (n1 + n2) / 2;
        System.out.println(media);

        // ++, --,
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);

        // +=, -=, *=, /=, %=
        int x = 4;
        x *= 2;
        System.out.println(x);

        // class Math
        System.out.println(Math.PI); // valor de PI
        System.out.println(Math.pow(5, 2)); // exponenciação
        System.out.println(Math.sqrt(25)); // raiz quadrada
        System.out.println(Math.cbrt(27)); // raiz cubica
        System.out.println(Math.abs(-10)); // modulo
        System.out.println(Math.floor(3.9)); // arredondamento para baixo
        System.out.println(Math.ceil(3.9)); // arredondamento para cima
        System.out.println(Math.round(3.9)); // arredondamento aritmetico

        // numero aleatorios
        System.out.println(Math.random()); // valores aleatorios entre 0 e 1
        // intervalo de 5 à 10 -> int x = (int) (5 + Math.random() * (10-5))
        // intervalo de 15 à 50 -> int x = (int) (15 + Math.random() * (50-15))
    }
}
