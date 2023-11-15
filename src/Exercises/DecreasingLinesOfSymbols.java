package Exercises;

public class DecreasingLinesOfSymbols {
    public void askForNumberOfLines() {
        System.out.println("How many lines of symbols do you want to print? ");
    }

    public void askForSymbol() {
        System.out.println("Which symbol do you want to print? ");
    }

    public void printLineOfSymbols(int counter, String symbol) {
        for(int numberOfLines = counter; numberOfLines > 0; numberOfLines--) {
            for(int numberOfSymbols = numberOfLines; numberOfSymbols > 0; numberOfSymbols--) {
                System.out.print(symbol);
            }
            System.out.print("\n");
        }
    }
}
