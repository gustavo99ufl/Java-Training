package exercises.fundamentos_java.for_while_do_while;
import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Diga um número: ");
        int number = scanner.nextInt();


        boolean isPrime = true;


        int i = 2;


        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }


        if (number > 1 && isPrime) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " não 6é um número primo.");
        }


        scanner.close();
    }
}
