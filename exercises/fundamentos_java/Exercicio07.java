public class Exercicio07 {
    public static void main(String[] args) {
        // implicita
        // double a = 10.0;
        // int b = a;
        // explicita
        double m = 3.5;
        int n = (int)m;

        double r = Double.parseDouble("153.11");

        Integer x = Integer.parseInt("2");
        System.out.println(x instanceof  Integer);

        double k = 55.3;
        String texto = Double.toString(k);
        System.out.println(texto instanceof String);

        int v = 4;
        String s = Integer.toString(v);
        System.out.println("Valor de s: " + s + ", é uma string? " + (s instanceof String));

        // byte para short; short para int; int para long; float para double
    }
}