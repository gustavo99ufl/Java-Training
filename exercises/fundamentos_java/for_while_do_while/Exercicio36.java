package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int input = scanner.nextInt();
        int contador = 0;
        while (input != 0) {
            input /=10;
            contador++;
        }
        System.out.println("Número de dígitos: " + contador);
    }
}
