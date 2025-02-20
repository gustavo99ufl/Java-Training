package exercises.fundamentos_java.for_while_do_while;

public class Exercicio12 {
    public static void main(String[] args) {
    int n = 15;
    int first = 0;
    int second = 1;
    System.out.println(first);
    System.out.println(second);
    for (int i = 3; i <= 15; i++) {
        int next = first + second;
        System.out.println(next);
        first = second;
        second = next;
    }
    }
}
