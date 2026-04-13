package aula_08;

public class OperadoresLogicosRelacionais {
    public static void main(String[] args) {

        // operador ternario
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1 > n2) ? 0 : 1;
        System.out.println(r);

        /*
         * Operadores Relacionais:
         * - > (maior que)
         * - < (menor que)
         * - >= (maior e igual)
         * - <= (menor e igual)
         * - == (igual)
         * - != (diferente)
         */

        /*
         * Operadores Lógicos:
         * - && (and)
         * - || (or)
         * - ^ (xor)
         * - ! (not)
         */

        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean res;
        res = (x < y && y < z) ? true : false;
        System.out.println(res);
    }
}
