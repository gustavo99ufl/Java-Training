package exercises.fundamentos_java.for_while_do_while;

public class Exercicio39 {
    public static void main(String[] args) {
        int i = 1;
        while ( i <= 100) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
