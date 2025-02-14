public class Exercicio03 {
    public static void main(String[] args) {
    int a = 10, b = 5;
    // operadores aritméticos
        System.out.println("soma: " + (a + b));
        System.out.println("subtração: " + (a - b));
        System.out.println("multiplicação: " + (a * b));
        System.out.println("divisão: " + (a / b));
        System.out.println("resto da divisão / módulo: " +(a % b));
        /* Operadores lógicos (&&, ||, !).
        Operadores de comparação (==, !=, <, >, <=, >=) */
        boolean resultado = (a > b) && (b > 2) && (a == 10) && (b == 5) && (a != 5);
        System.out.println("resultado de comparação: " + resultado);
    }
}