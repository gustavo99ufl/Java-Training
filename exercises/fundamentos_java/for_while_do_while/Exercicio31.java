package exercises.fundamentos_java.for_while_do_while;

public class Exercicio31 {
    public static void main(String[] args) {
        int i = 1;
        int raiz = 0;
        while (i <= 25) {
            raiz = i * i;
            System.out.println(raiz);
            i++;
        }
    }
}
