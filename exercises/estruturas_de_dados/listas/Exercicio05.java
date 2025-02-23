package exercises.estruturas_de_dados.listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(20);
        lista.add(3);
        lista.add(6);
        lista.add(70);
        lista.add(30);
        lista.add(12);
        lista.add(23);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele está na lista: ");
        int numeroBuscado = scanner.nextInt();
        if (lista.contains(numeroBuscado)) {
            System.out.println("O número " + numeroBuscado + " está na lista.");
        } else {
            System.out.println("O número " + numeroBuscado + " não está na lista");
        }
        scanner.close();
    }
}
