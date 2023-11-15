package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    /*
        Criar uma função que transforma o valor de uma temperatura em graus celsius em fahrenheit seguindo a fórmula abaixo:

        > fahrenheit = (celsius * fator1) + fator2

        > fator1 é representado pela divisão de 9 por 5

        > fator2 é 32

        celcius é o valor variável da temperatura em celsius.

        O seu programa deve calcular o valor em fahrenheit de ao menos duas temperaturas distintas e deve imprimir o resultado no console.

        Exemplo:
        ```language
        Temperatura 1 XºC são YºF
        Temperatura 2 ZºC são WºF
     */

    private ArrayList<Double> temperaturesToConvert = new ArrayList<>();

    // *********************************************************
    private void askForNumberOfTemperatureInputs() {
        System.out.println("Quantas temperaturas deseja converter de °C para °F, entre 2 e 5?");
    }

    private void returnInvalidInputMessage() {
        System.out.println("Número de temperaturas para serem convertidas está fora dos limites permitidos (entre 2 e 5)");
    }

    private void askForTemperature(int counter) {
        System.out.printf("Informe a %dª temperatura: ", counter);
    }

    public void registerTemperatures() {
        Scanner scanner = new Scanner(System.in);

        askForNumberOfTemperatureInputs();
        int numberOfInputs = scanner.nextInt();

        while(numberOfInputs < 2 || numberOfInputs > 5) {
            returnInvalidInputMessage();
            askForNumberOfTemperatureInputs();
            numberOfInputs = scanner.nextInt();
        }

        for(int counter = 1; counter <= numberOfInputs; counter++) {
            askForTemperature(counter);
            this.temperaturesToConvert.add(scanner.nextDouble());
        }
    }

    private double convertCelsiusToFahrenheit(double temperature) {
        /*
        fahrenheit = (celsius * fator1) + fator2
        fator1 é representado pela divisão de 9 por 5
        fator2 é 32
         */
        return (temperature * (9.0/5)) + 32;
    }

    public void printConvertedTemperatures() {
        for(int counter = 0; counter < this.temperaturesToConvert.size(); counter++) {
            double temperatureToConvert = this.temperaturesToConvert.get(counter);
            double convertedTemperature = convertCelsiusToFahrenheit(temperatureToConvert);
            System.out.printf("Temperatura %d: %.1fºC são %.1fºF\n", (counter+1), temperatureToConvert, convertedTemperature);
        }
    }
}
