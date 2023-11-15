import Exercises.DecreasingLinesOfSymbols;
import Exercises.ImcCalculator;
import Exercises.TestScoreAverage;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // *********************************************************
        // calculating IMC
        ImcCalculator imcCalculator = new ImcCalculator();

        imcCalculator.askForHeight();
        imcCalculator.setHeight(scanner.nextDouble());

        imcCalculator.askForWeight();
        imcCalculator.setWeight(scanner.nextDouble());

        imcCalculator.printImcInformation();

        // *********************************************************

        System.out.println("\n*********************************************************\n");

        // *********************************************************
        // calculating Test Scores Average

        TestScoreAverage testScoreAverage = new TestScoreAverage();
        for(int counter = 1; counter <= 5; counter++) {
            testScoreAverage.askForTestScore(counter);
            testScoreAverage.addTestScore(scanner.nextInt());
        }
        testScoreAverage.printAverage();

        // *********************************************************

        System.out.println("\n*********************************************************\n");

        // *********************************************************
        // printing decreasing lines of symbols

        DecreasingLinesOfSymbols linesOfSymbols = new DecreasingLinesOfSymbols();
        linesOfSymbols.askForNumberOfLines();
        int numberOfLines = scanner.nextInt();

        linesOfSymbols.askForSymbol();
        String symbol = scanner.next();

        linesOfSymbols.printLineOfSymbols(numberOfLines, symbol);
    }
}