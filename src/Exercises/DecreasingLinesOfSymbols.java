package Exercises;

public class DecreasingLinesOfSymbols {
    public void askForNumberOfLines() {
        System.out.println("Quantas linhas de símbolos deseja mostrar na tela? ");
    }

    public void askForSymbol() {
        System.out.println("Qual símbolo gostaria de mostrar? ");
    }

    public void printLineOfSymbols(int counter, String symbol) {
        for(int numberOfLines = counter; numberOfLines > 0; numberOfLines--) {
            for(int symbolsInLine = numberOfLines; symbolsInLine > 0; symbolsInLine--) {
                System.out.print(symbol.charAt(0));
            }
            System.out.print("\n");
        }
    }
}
