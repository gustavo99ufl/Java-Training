package exercises.fundamentos_java.for_while_do_while;

public class Exercicio22 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 50) {
            sum += i;
            i++;
            System.out.println(sum);
        }
    }
}
