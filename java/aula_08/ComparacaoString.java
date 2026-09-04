package aula_08;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;

        // operador relacional
        res = (nome1 == nome2) ? "igual" : "diferente";
        System.out.println("Nome1 == Nome2: " + res);

        res = (nome1 == nome3 || nome2 == nome3) ? "igual" : "diferente";
        System.out.println("Nome1 or Nome2 == Nome3: " + res);

        // equals
        res = (nome1.equals(nome3) || nome2.equals(nome3)) ? "igual" : "diferente";
        System.out.println("Nome1 or Nome2 == Nome3: " + res);
    }
}
