package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int i = 0;
        do {
            System.out.println("Qual sua idade? ");
            input = scanner.nextInt();
            if (input >= 18) {
                System.out.println("Você tem idade para dirigir!");
            } else {
                System.out.println("Você não tem idade para tirar habilitação!");
            }
            i++;
        } while (i < 1);
    }
}
