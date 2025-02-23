package exercises.estruturas_de_dados.listas;

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercicio08 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("casa");
        lista.add("carro");
        lista.add("jardim");
        lista.add("mercado");
        lista.add("rua");

        System.out.println("Lista original: " + lista);

        System.out.println("Lista em ordem reversa: ");
        ListIterator<String> iterator = lista.listIterator(lista.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
