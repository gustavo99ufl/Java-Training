package exercises.fundamentos_java.for_while_do_while;

import java.util.Random;

public class Exercicio37 {
    public static void main(String[] args) {
        Random random = new Random();
        int dado = 0;
        while (dado != 6) {
            dado = random.nextInt(7);
            System.out.println("O dado foi lançado e o número é " + dado);
        }
    }
}
