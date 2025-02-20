package exercises.fundamentos_java.for_while_do_while;

public class Exercicio24 {
    public static void main(String[] args) {
        int first = 0;
        System.out.println(first);
        int second = 1;
        System.out.println(second);
        int next = 0;
        int i = 3;
        while (i <= 20) {
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
            i++;
        }
    }
}
