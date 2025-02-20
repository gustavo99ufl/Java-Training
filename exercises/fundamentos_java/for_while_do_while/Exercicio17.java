package exercises.fundamentos_java.for_while_do_while;

public class Exercicio17 {
    public static void main(String[] args) {
        String str = "olá mundo";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
