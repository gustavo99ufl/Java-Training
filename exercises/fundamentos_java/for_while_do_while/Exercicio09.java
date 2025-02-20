package exercises.fundamentos_java.for_while_do_while;

public class Exercicio09 {
    public static void main(String[] args) {
        int num = 5;
        int resultado = 1;
        for (int i = 1; i <= num; i ++) {
            resultado *= i;
        }
        System.out.println("A fatoração de " + num + " é igual a " + resultado);
    }
}
