package Exercises;

import java.util.Scanner;

public class Investment {
    /*
    Pergunte para a usuária o valor que será investido em uma aplicação, a taxa de juros ao mês e o tempo que o dinheiro ficará aplicado.
    Seu programa deverá exibir quanto de juros será pago e o saldo total em cada mês.

    Exemplo:

    ```language
    Informe o valor inicial investido em R$.
    10000,00
    Informe o juros ao mês em %.
    5
    Informe o tempo em meses que o dinheiro ficará investido.
    3

    10000.0 reais, 5% de juros ao mês por 3 meses.

    Mês 1: Juros: R$ 500.0 , saldo: 10500.0
    Mês 2: Juros: R$ 525.0 , saldo: 11025.0
    Mês 3: Juros: RS 551.25 , saldo: 11576.25
    ```
     */

    private double initialInvestment, interestRate, rate, balance;
    private int months;

    Scanner scanner = new Scanner(System.in);

    public void askForInitialInvestment() {
        System.out.println("Informe o valor inicial investido em R$: ");
    }

    public void setInitialInvestment(double initialInvestment) {
        this.initialInvestment = initialInvestment;
    }

    public void askForInterestRate() {
        System.out.println("Informe o juros ao mês em %: ");
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void askForMonthsInvesting() {
        System.out.println("Informe o tempo em meses que o dinheiro ficará investido: ");
    }

    public void setMonths(int months) {
        this.months = months;
    }

    private void setInitialBalance() {
        this.balance = this.initialInvestment;
    }

    private double calculateNewBalance() {
        return this.balance += (this.balance * (this.interestRate/100));
    }

    private double calculateRate() {
        return this.balance * (this.interestRate/100);
    }

    public void printProfitForecast() {
        /*
        10000.0 reais, 5% de juros ao mês por 3 meses.

        Mês 1: Juros: R$ 500.0 , saldo: 10500.0
        Mês 2: Juros: R$ 525.0 , saldo: 11025.0
        Mês 3: Juros: RS 551.25 , saldo: 11576.25
         */
        setInitialBalance();
        System.out.printf(
                "Investimento inicial: R$ %.2f, juros de %.2f por cento ao mês, durante %d mes(es)\n\n",
                this.initialInvestment,
                this.interestRate,
                this.months
        );

        for(int counter = 1; counter <= this.months; counter++) {
            System.out.printf("Mês %d - Juros: %.2f / Saldo: %.2f\n", counter, calculateRate(), calculateNewBalance());
        }
    }
}
