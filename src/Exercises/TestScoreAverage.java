package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class TestScoreAverage {
    /*
    Faça um programa que receba as quatro notas de 0 a 10 de um aluno e informe a média das notas. Caso receba notas maiores que 10 ou menores que zero é para retornar uma mensagem informando que valor é inválido e encerrar o programa.


    Exemplo:

    ```language
    Informe a nota prova 1:
    10
    Informe a nota prova 2:
    10
    Informe a nota prova 3:
    5
    Informe a nota prova 4:
    5
    A média do aluno foi 7.5
     */
    private ArrayList<Float> testsScores = new ArrayList<>();

    public void askForNumberOfTests() {
        System.out.println("Quantas notas deseja registrar? ");
    }

    public void registerTestScores(int numberOfTests) {
        Scanner scanner = new Scanner(System.in);
        for(int counter = 1; counter <= numberOfTests; counter ++) {
            this.askForTestScore(counter);
            this.addTestScore(scanner.nextFloat());
        }
    }

    private void askForTestScore(int counter) {
        System.out.printf("Informe a nota da %dª prova: ", counter);
    }

    private void addTestScore(float testScore) {
        this.testsScores.add(testScore);
    }

    private float calculateAverage() {
        float sum = 0;
        for(float testScore : this.testsScores) {
            sum += testScore;
        };

        return sum / this.testsScores.size();
    }

    public void printAverage() {
        System.out.printf("A média do aluno foi %.2f", calculateAverage());
    }
}
