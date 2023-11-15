package Exercises;

public class SumOfN {
    /*
    Faça um programa que pede para a usuária digitar um número inteiro positivo.
    Seu programa deverá responder a soma de do número com todos os seus antecessores positivos.

    Ex: se o número digitado for 5, a conta a ser realizada será 5 + 4 + 3 + 2 + 1, e o resultado na tela será "15".
     */

    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public void askForN() {
        System.out.println("Digite um número inteiro positivo: ");
    }

    private int calculateSumOfN() {
        int sum = 0;
        for(int counter = this.n; counter > 0; counter--) {
            sum += counter;
        }
        return sum;
    }

    public void printSum() {
        System.out.printf("A soma de todos os números entre 1 e %d é %d", this.n, calculateSumOfN());
    }
}
