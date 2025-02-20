package exercises.fundamentos_java.for_while_do_while;

public class Exercicio10 {
    public static void main(String[] args) {
        int level = 5;

        for (int i = 1; i <= level; i++) {

            for (int j = 1; j <= level - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
