package exercises.fundamentos_java.for_while_do_while;

public class Exercicio15 {
        public static void main(String[] args) {
            for (int i = 2; i <= 100; i++) {
                boolean isPrime = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
