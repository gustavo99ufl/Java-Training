package exercises.estruturas_de_dados.listas;

import java.util.ArrayList;

public class Exercicio09 {
    public static void main(String[] args) {
        ArrayList<Integer> inteirosLista = new ArrayList<>();
        inteirosLista.add(4);
        inteirosLista.add(22);
        inteirosLista.add(45);
        inteirosLista.add(64);
        inteirosLista.add(12);
        int soma = 0;
        for (int i = 0; i < inteirosLista.size(); i++) {
            soma += inteirosLista.get(i);
        }
        System.out.println("A soma dos elementos do Array é " + soma);
    }
}
