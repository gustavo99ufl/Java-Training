package exercises.estruturas_de_dados.listas;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int[] lista = new int[3];
        lista[0] = 10;
        lista[1] = 15;
        lista[2] = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele está na lista: ");
        int input = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == input) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("O número " + input + " está na lista");
        } else {
            System.out.println("O número " + input + " não está na lista");
        }
        scanner.close();
    }
}
