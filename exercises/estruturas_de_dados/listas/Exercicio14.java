package exercises.estruturas_de_dados.listas;

import java.util.Random;

public class Exercicio14 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j ++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Matrix 5x5 com números aleatórios: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
