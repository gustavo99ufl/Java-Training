package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Digite um número: ");
        input = scanner.nextInt();
        int new_value;
        new_value = input;

        do {
            new_value /= 2;
            System.out.println(new_value);
        } while (new_value != 0);
    }
}
