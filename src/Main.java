import Exercises.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // *********************************************************
        // calculating IMC
//        ImcCalculator imcCalculator = new ImcCalculator();
//
//        imcCalculator.askForHeight();
//        imcCalculator.setHeight(scanner.nextDouble());
//
//        imcCalculator.askForWeight();
//        imcCalculator.setWeight(scanner.nextDouble());
//
//        imcCalculator.printImcInformation();

        // *********************************************************

//        System.out.println("\n\n*********************************************************\n");

        // *********************************************************
        // calculating Test Scores Average

//        TestScoreAverage testScoreAverage = new TestScoreAverage();
//        testScoreAverage.askForNumberOfTests();
//        testScoreAverage.registerTestScores(scanner.nextInt());
//        testScoreAverage.printAverage();

        // *********************************************************

//        System.out.println("\n\n*********************************************************\n");

        // *********************************************************
        // printing decreasing lines of symbols

//        DecreasingLinesOfSymbols linesOfSymbols = new DecreasingLinesOfSymbols();
//        linesOfSymbols.askForNumberOfLines();
//        int numberOfLines = scanner.nextInt();
//
//        linesOfSymbols.askForSymbol();
//        String symbol = scanner.next();
//
//        linesOfSymbols.printLineOfSymbols(numberOfLines, symbol);

        // *********************************************************

//        System.out.println("\n\n*********************************************************\n");

        // *********************************************************
        // converting temperatures from Celsius to Fahrenheit

//        CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();
//        celsiusToFahrenheit.registerTemperatures();
//        celsiusToFahrenheit.printConvertedTemperatures();

        // *********************************************************

//        System.out.println("\n\n*********************************************************\n");

        // *********************************************************
        // Math operation

//        MathOperation mathOperation = new MathOperation();
//        mathOperation.askForOperation();
//        mathOperation.setOperation(scanner.nextLine());
//
//        if(mathOperation.getOperation() != null) {
//            mathOperation.askForNumber(1);
//            mathOperation.setNumberOne(scanner.nextDouble());
//
//            mathOperation.askForNumber(2);
//            mathOperation.setNumberTwo(scanner.nextDouble());
//
//            mathOperation.printResult();
//        }

        // *********************************************************

//        System.out.println("\n\n*********************************************************\n");

        // *********************************************************
        // Investment

//        Investment investment = new Investment();
//
//        investment.askForInitialInvestment();
//        investment.setInitialInvestment(scanner.nextDouble());
//
//        investment.askForInterestRate();
//        investment.setInterestRate(scanner.nextDouble());
//
//        investment.askForMonthsInvesting();
//        investment.setMonths(scanner.nextInt());
//
//        investment.printProfitForecast();

        // *********************************************************

//        System.out.println("\n\n*********************************************************\n");

        // *********************************************************
        // Sum of N numbers

        SumOfN sumOfN = new SumOfN();

        sumOfN.askForN();
        sumOfN.setN((scanner.nextInt()));
        sumOfN.printSum();
    }
}