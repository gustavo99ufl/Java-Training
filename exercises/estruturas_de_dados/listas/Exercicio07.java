package exercises.estruturas_de_dados.listas;

import java.util.LinkedList;

public class Exercicio07 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("Golang");
        lista.add("Javascript");
        lista.add("Typescript");
        lista.add("Lua");

        System.out.println("Linguagens de programação " + lista);
    }
}
