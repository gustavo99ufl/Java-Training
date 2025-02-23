package exercises.fundamentos_java.for_while_do_while;

import java.util.Random;
import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        Scanner scanner = new Scanner(System.in);
        number = random.nextInt(100);
        int input;
        do {
            System.out.println("Digite um número entre 1 e 100!");
            input = scanner.nextInt();
            if (input > number) {
                System.out.println("O número é menor!");
            } else if (input == number) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("O número é maior!");
            }
           } while(input != number);
    }
}
