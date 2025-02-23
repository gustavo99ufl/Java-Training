package exercises.estruturas_de_dados.listas;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] array = new int [10];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 60;
        array[6] = 70;
        array[7] = 80;
        array[8] = 90;
        array[9] = 100;
        for (int i = 0; i <= 9; i++) {
            System.out.println("Elementos do array:\nÍndice " + i + ": " + array[i]);
        }
    }
}
