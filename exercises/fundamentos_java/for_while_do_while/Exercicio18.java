package exercises.fundamentos_java.for_while_do_while;

public class Exercicio18 {
        public static void main(String[] args) {
            int n = 5;  // Number of levels in the top half (it will have 2n-1 stars in the widest part)


            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }


            for (int i = n - 1; i >= 1; i--) {

                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
