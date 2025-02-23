package exercises.estruturas_de_dados.listas;

import java.util.Arrays;

public class Exercicio03 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 34;
        array[1] = 23;
        array[2] = 54;
        array[3] = 3;
        array[4] = 95;
        int remover = 54;

        int[] novoArray = new int[array.length - 1];
        int index = 0;

        for(int num : array) {
            if (num != remover) {
                novoArray[index] = num;
                index++;
            }
        }
        System.out.println(Arrays.toString(novoArray));
    }
}
