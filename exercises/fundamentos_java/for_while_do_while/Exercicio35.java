package exercises.fundamentos_java.for_while_do_while;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        int saldo = 0;
        int deposit = 0;
        int saque = 0;
        int i = 0;
        String str = "==========CAIXA ELETRÔNICO==========\nOpção [1] Ver saldo da conta.\nOpção [2] Depositar.\nOpção [3] Sacar.\nOpção [4] Sair.\n==========CAIXA ELETRÔNICO==========";
        System.out.println(str);
        Scanner scanner = new Scanner(System.in);
        char option = '0';
        while (option != '4') {
            option = scanner.next().charAt(0);
            if (option == '1') {
                System.out.println("Saldo da conta: " + saldo);
                try {
                    Thread.sleep(3000);
                    System.out.println(str);
                } catch (InterruptedException  e) {
                    e.printStackTrace();
                }
            }
            else if (option == '2') {
                System.out.println("Deposite seu dinheiro: ");
                deposit = scanner.nextInt();
                saldo += deposit;
                System.out.println("O valor " + deposit + " foi depositado.");
                try {
                    Thread.sleep(3000);
                    System.out.println(str);
                } catch (InterruptedException  e) {
                    e.printStackTrace();
                }
            } else if (option == '3') {
                System.out.println("Saque seu dinheiro: ");
                saque = scanner.nextInt();
                saldo -= saldo;
                System.out.println("O valor " + saque + " foi sacado.");
                try {
                    Thread.sleep(3000);
                    System.out.println(str);
                } catch (InterruptedException  e) {
                    e.printStackTrace();
                }
            } else if (option == '4') {
                System.out.println("Tenha um bom dia, volte sempre!");
            } else {
                System.out.println("Você digitou um número inválido, tente novamente!");
                try {
                    Thread.sleep(3000);
                    System.out.println(str);
                } catch (InterruptedException  e) {
                    e.printStackTrace();
                }
            }
        }
        scanner.close();
    }
}
