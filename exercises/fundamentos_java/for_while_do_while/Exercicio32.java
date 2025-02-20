package exercises.fundamentos_java.for_while_do_while;

public class Exercicio32 {
    public static void main(String[] args) {
        int i = 0;
        int soma = 0;
        while (i < 100) {
            soma += i;
            System.out.println("A soma dos valores de 1 até 100 é " + soma);
            i++;
            System.out.println(i);
        }
    }
}
