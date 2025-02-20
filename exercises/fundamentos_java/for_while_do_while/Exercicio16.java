package exercises.fundamentos_java.for_while_do_while;

public class Exercicio16 {
    public static void main(String[] args) {
        int divcinco = 0;
        int divtres = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                divcinco += 1;
            }
            if (i % 3 == 0) {
                divtres += 1;
            }
        }
        System.out.println("Divisível por 3: " + divtres + "\nDivisível por 5: " + divcinco);
    }
}
