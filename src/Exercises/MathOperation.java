package Exercises;

import java.util.Scanner;

public class MathOperation {
    /*
    Realizar uma operação matemática, que deve ser passada via input do usuário ( opções: + - / * )
    entre dois números inteiros que também devem ser solicitados via System.in.
    Caso a operação seja desconhecida exibir uma mensagem "Operação desconhecida" e encerrar o programa.

    Exemplo:
    ```language
    Qual operação deseja fazer? ( opções: + - / * )
    Informe o primeiro número.
    Informe o segundo número.
     */

    private double numberOne, numberTwo;
    private String operation;

    Scanner scanner = new Scanner(System.in);

    public void askForOperation() {
        System.out.println("Qual operação matemática deseja realizar? Opções: + - / *");
    }

    public void setOperation(String operation) {
        String possibleOperations = "+-/*";
        if (operation.length() == 1 && possibleOperations.contains(operation)) {
            this.operation = operation;
        } else {
            System.out.println("Operação desconhecida");
        }
    }

    public String getOperation() {
        return this.operation;
    }

    public void askForNumber(int number) {
        System.out.printf("Informe o %d° número da operação: ", number);
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    private double calculateOperation() {
        return switch (this.operation) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "/" -> numberOne / numberTwo;
            case "*" -> numberOne * numberTwo;
            default -> 0.0;
        };
    }

    public void printResult() {
        System.out.printf("O resultado da operação é: %.2f", calculateOperation());
    }

}
