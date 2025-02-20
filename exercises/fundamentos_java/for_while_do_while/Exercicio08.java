package exercises.fundamentos_java.for_while_do_while;

public class Exercicio08 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 7 == 0) {
                soma += 1;
            }
        }
        System.out.println(soma);
    }
}
