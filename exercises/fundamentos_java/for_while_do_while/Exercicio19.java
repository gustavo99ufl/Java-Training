package exercises.fundamentos_java.for_while_do_while;

public class Exercicio19 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        int soma = first + second;
        for (int i = 3; i <= 20; i++) {
            int next = first + second;
            soma += next;
            first = second;
            second = next;

        }
        System.out.println("A soma dos primeiros 20 núimeros de Fibonacci: " + soma);
    }
}
