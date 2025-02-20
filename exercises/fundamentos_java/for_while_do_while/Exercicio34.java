package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string");
        String input = scanner.nextLine();
        String revertido = "";
        int index = input.length() - 1;

        while (index >= 0) {
            revertido += input.charAt(index);
            index--;
        }
        System.out.println("String invertida: " + revertido);
    }
}
