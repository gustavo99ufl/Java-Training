package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("A soma dos digítos é: " + sum);
        scanner.close();
    }
}
