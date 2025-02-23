package exercises.estruturas_de_dados.listas;

import javax.print.attribute.HashDocAttributeSet;
import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio10 {
    public static void main(String[] args) {
        ArrayList<Integer> inteirosLista = new ArrayList<>();
        inteirosLista.add(4);
        inteirosLista.add(22);
        inteirosLista.add(45);
        inteirosLista.add(64);
        inteirosLista.add(12);
        inteirosLista.add(12);
        inteirosLista.add(12);
        inteirosLista.add(12);

        System.out.println("Lista original: " + inteirosLista);
        HashSet<Integer> set = new HashSet<>(inteirosLista);
        ArrayList<Integer> inteirosSemDuplicatas = new ArrayList<>(set);

        System.out.println("Listas sem duplicatas " + inteirosSemDuplicatas);
    }
}
