package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Diga um número: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int temp = number; temp != 0; temp /=10) {
            sum += temp % 10;
        }

        System.out.println("A soma dos dígitos é: " + sum);
    }
}
