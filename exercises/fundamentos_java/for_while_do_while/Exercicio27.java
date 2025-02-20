package exercises.fundamentos_java.for_while_do_while;
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int vezes = 0;
        int number = 0;
        number = scanner.nextInt();
        while (number > 1) {
            number /= 2;
            vezes++;
            System.out.println(vezes);
        }
    }
}
