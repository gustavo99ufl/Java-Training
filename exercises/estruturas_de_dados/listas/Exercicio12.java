package exercises.estruturas_de_dados.listas;

public class Exercicio12 {
    public static void main(String[] args) {
        char[][] tabuleiro = {
                {'X', 'O', 'X'},
                {'O', 'X', ' '},
                {' ', 'O', 'X'},
        };

        System.out.println(" 0   1   2");

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " "); // Índice da linha

            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]); // Imprime o elemento
                if (j < 2) {
                    System.out.print(" | "); // Separador de coluna
                }
            }

            System.out.println(); // Quebra de linha após imprimir a linha do tabuleiro

            if (i < 2) {
                System.out.println("  ---------"); // Separador de linha
            }
        }
    }
}

