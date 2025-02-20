package exercises.fundamentos_java.for_while_do_while;

public class Exercicio20 {
    public static void main(String[] args) {
        //int divquatro = 0;
        //int divseis = 0;
        for(int i = 0; i <= 100; i ++) {
            if (i % 4 == 0) {
               // divquatro = i;
                System.out.println("Divisível por 4: " + i);
            }
            if (i % 6 == 0) {
                //divseis = i;
                System.out.println("Divisível por 6: " + i);
            }
        }
    }
}
