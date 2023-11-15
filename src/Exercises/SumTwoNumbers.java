package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class SumTwoNumbers {

    public static void main(String[] args) {
        /*
        Criar um programa que recebe 2 números e realiza a soma deles.
        Porém, nesse caso o programa deve verificar quantos parâmetros são enviados como argumento do método main(args).
        Se for nenhum, deve pedir via System.in que o usuário digite 2 números.
        No caso de vir apenas 1, deve pedir outro parâmetro via System.in.
        Se for 2, deve realizar a soma dos dois.
        No caso de qualquer outra quantidade.
        Deve apresentar uma mensagem de erro falando que a quantidade é inválida.
         */
        Scanner scanner = new Scanner(System.in);

        double numberOne = 0.0, numberTwo = 0.0, sum = 0.0;

        if (args.length == 0) {
            printDefaultMessage();

            askForNumber(1);
            numberOne = scanner.nextDouble();

            askForNumber(2);
            numberTwo = scanner.nextDouble();

            printSum(numberOne, numberTwo);
        } else if (args.length == 1) {
            numberOne = parseDouble(args[0]);
            printDefaultMessage();

            askForNumber(2);
            numberTwo = scanner.nextDouble();

            printSum(numberOne, numberTwo);
        } else if (args.length == 2) {
            numberOne = parseDouble(args[0]);
            numberTwo = parseDouble(args[1]);

            printSum(numberOne, numberTwo);
        } else {
            System.out.println("Número de argumentos informado não é válido.");
        }
    }

    private static void printDefaultMessage() {
        System.out.println("É necessário informar 2 números para realizar a operação de soma.");
    }

    private static void askForNumber(int number) {
        System.out.printf("Digite o %d° número: ", number);
    }

    private static double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    private static void printSum(double numberOne, double numberTwo) {
        double sum = sum(numberOne, numberTwo);
        System.out.printf("A soma fechou em %.2f", sum);
    }
}
