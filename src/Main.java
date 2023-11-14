import Exercises.CalculateIMC;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // calculating IMC
        CalculateIMC imcCalculator = new CalculateIMC();
        imcCalculator.askForHeight();
        imcCalculator.setHeight(scanner.nextDouble());

        imcCalculator.askForWeight();
        imcCalculator.setWeight(scanner.nextDouble());

        imcCalculator.printImcCategory();
    }
}