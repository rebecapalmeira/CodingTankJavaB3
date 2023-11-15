package Exercises;

import static java.lang.Integer.parseInt;

public class EvenOrOdd {
    /*
    Criar uma classe com uma função main que vai receber um número via argumentos do programa (args)
    e dizer se esse número é par ou impar.
    Caso tenha recebido mais ou menos de um argumento retornar mensagem
    "Número inválido de argumentos, é esperado que seja informado um argumento".
     */

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.printf("Número inválido de argumentos, é esperado que seja informado 1 argumento, no entanto %d foram informados", args.length);
        } else {
            int number = parseInt(args[0]);
            String message = (number % 2) == 0 ? "Par" : "Ímpar";
            System.out.printf("Número informado é %s", message);
        }
    }
}
