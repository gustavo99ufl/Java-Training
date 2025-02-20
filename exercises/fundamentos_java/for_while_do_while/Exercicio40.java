package exercises.fundamentos_java.for_while_do_while;

public class Exercicio40 {
    public static void main(String[] args) {
        int inteiro = 12345;
        int sum = 0;
        while (inteiro > 0) {
            sum += inteiro % 10;
            inteiro /= 10;
        }
        System.out.println("A soma dos dígitos é " + sum);
    }
}
