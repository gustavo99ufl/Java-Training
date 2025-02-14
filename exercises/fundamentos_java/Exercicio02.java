public class Exercicio02 {
    public static void main(String[] args) {
        // números inteiros
        byte age = 18; // 8 bits - 128 a 127
        short valor = 32767; // 16 bits - 32.768 a 32.767
        int number = 2147483647; // 32 bits -2.147.483.648 a 2.147.483.647
        long id = 9223372036854775L; // 64 bits -9.223.372.036.854.775.808 a 9.223.372.036.854.775
        // números decimais
        float money = 5003.54f; // 32 bits | precisão simples
        double pi = 3.1415926535897932384626; // 64 bits | precisão dupla
        // string
        char sexo = 'M'; // 16 bits apenas 1 caracteres
        String nome = "João Alves Santos";
        // true or false
        boolean estudante = true;
        // print
        System.out.println("Valor byte: "+ age);
        System.out.println("Valor short: "+ valor);
        System.out.println("Valor int: "+ number);
        System.out.println("Valor long "+ id);
        System.out.println("Valor float: "+ money);
        System.out.println("Valor double: "+ pi);
        System.out.println("Valor char: "+ sexo);
        System.out.println("Valor string: "+ nome);
        System.out.println("Valor boolean: "+ estudante);
    }
}