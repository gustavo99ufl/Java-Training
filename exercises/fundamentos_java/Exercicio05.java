import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadoresLogicos(scanner);
    }
    public static void OperadoresLogicos(Scanner scanner) {
        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        System.out.println("Você tem carteira de motorista? [S/N]");
        char carteira = scanner.next().charAt(0);
        if (age >= 18 && carteira == 'S' || carteira == 's') {
            System.out.println("Você pode dirigir um veículo!");
        } else {
            System.out.println("Você não pode dirigir um veículo!");
        }
        if (age > 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}