package exercises.fundamentos_java.for_while_do_while;

public class Exercicio46 {
    public static void main(String[] args) {
        int first = 0;
        System.out.println(first);
        int second = 1;
        System.out.println(second);
        int next;
        int i = 3;
        do {
            next = first + second;
            first = second;
            second = next;
            System.out.println(next);
            i++;
        } while (i <= 10);
    }
}
