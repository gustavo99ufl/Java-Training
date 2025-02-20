package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int soma = 0;
        while (number != 0) {
            System.out.println("Digite um número: ");
            number = scanner.nextInt();
            soma += number;

        }
        System.out.println("A soma do valores foi: " + soma);
        scanner.close();
    }
}
