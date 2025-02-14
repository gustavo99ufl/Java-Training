public class Exercicio04 {
    public static void main(String[] args) {
        // Chamando os métodos diretamente, pois são estáticos
        verificarFrase();
        executarCondicional();
        loopsExecutar();
    }

    // Método que verifica se a frase contém a palavra desejada
    public static void verificarFrase() {
        String frase = "Hoje é quinta feira";
        String palavra = "quinta feira";

        if (frase.contains(palavra)) {
            System.out.println("Dia normal");
        } else {
            System.out.println("Dia feliz!");
        }
    }

    // Método para executar a condicional de comparação de números
    public static void executarCondicional() {
        byte a = 5, b = 34;
        char sexo = 'M';
        String str = "fdsfsd";

        if (a > b) {
            System.out.println("a é maior que b");
        } else if (b > a) {
            System.out.println("b é maior que a");
        }
        if (sexo == 'F') {
            System.out.println("sexo feminino");
        } else {
            System.out.println("sexo masculino");
        }
        if (str.isBlank()) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }

    public static void loopsExecutar() {
        for(int i = 0; i <= 5; i++) {
            System.out.println("Número " + i);
        }
    }
}