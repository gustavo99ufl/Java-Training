package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Digite algo [digite 'sair', para sair]");
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("sair"));
        System.out.println("Você digitou 'sair' e o programa foi encerrado.");
        scanner.close();
    }
}
