package exercises.fundamentos_java.for_while_do_while;

public class Exercicio38 {
    public static void main(String[] args) {
        int cont = 10;
        while (cont >= 0) {
            try {
                Thread.sleep(1000);

            System.out.println("CONTAGEM REGRESSIVA: " + cont + " segundos");
        } catch (InterruptedException  e) {
                e.printStackTrace();
            }
            if (cont == 0) {
                System.out.println("ACABOU A CONTAGEM REGRESSIVA!");
            }
            cont--;
        }
    }
}
