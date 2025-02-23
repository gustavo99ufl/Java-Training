package exercises.estruturas_de_dados.listas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio06 {
    public static void removerElementos(ArrayList<Integer> lista) {
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        System.out.println("Lista original: " + numeros);

        removerElementos(numeros);

        System.out.println("Lista após remover os pares: " + numeros);


    }
}
