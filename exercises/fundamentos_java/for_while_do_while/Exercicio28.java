package exercises.fundamentos_java.for_while_do_while;

import java.util.Random;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int aleatorio = 89978924;
      while (number != aleatorio) {
          System.out.println("Digite um número até 10: ");
           number = scanner.nextInt();
           aleatorio = random.nextInt(10);
           if (number != aleatorio) {
               System.out.println("O número aleatório foi " + aleatorio + " tente novamente!");
           } else if (number == aleatorio) {
               System.out.println("Você acertou! O número aleatório foi " + aleatorio);
           }
           if (number > 10) {
               System.out.println("É permitido apenas números entre 0 e 10!");
           }
      }
    }
}
