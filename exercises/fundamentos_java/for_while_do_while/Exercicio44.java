package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String email;
        boolean isValid;
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        do {
            System.out.println("Insira um e-mail: ");
            email = scanner.nextLine();
            email = scanner.nextLine();
        } while (!pattern.matcher(email).matches());
        System.out.println("Email válido: " + email);
        scanner.close();
    }
}
