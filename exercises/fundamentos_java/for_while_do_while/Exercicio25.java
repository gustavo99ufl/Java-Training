package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
     int i = 0;
        while (true) {
            try {
                System.out.println("Diga um número: ");
                number = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro!");
                scanner.nextLine();
            }

        }
        System.out.println("Você inseriu o número " + number);
        scanner.close();
    }
}
