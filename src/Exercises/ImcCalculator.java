package Exercises;

public class ImcCalculator {
    /*
    Crie um programa que pergunte qual a altura em metros e peso em Kg desta pessoa e retorne o IMC e a classificação deste IMC.
    >  IMC = peso / altura x altura;

    Como referência para para a classificação do IMC utilizar a tabela do link [Tabela IMC - Wikipedia](https://pt.wikipedia.org/wiki/%C3%8Dndice_de_massa_corporal#Tabela_de_IMC).

    Exemplo:

            ```language
    Informe sua altura em metros?
            1,9
    Informe seu peso em Kg?
            72,2
    O valor do seu IMC é 20 (considerado Peso normal)
    */

    private double height, weight;

    // **************************************************************
    // Getters and Setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // ****************************************************************
    // methods
    public void askForWeight() {
        System.out.println("Informe seu peso em kg: ");
    }

    public void askForHeight() {
        System.out.println("Informe sua altura em metros: ");
    }

    public void printImcCategory() {
        double calculatedImc =   this.calculateImc();
        System.out.printf(
            "O valor do seu IMC é %.1f (considerado %s).", calculatedImc, identifyImcCategory(calculatedImc)
        );
    }

    private double calculateImc () {
        return this.weight / Math.pow(this.height, 2);
    }

    private String identifyImcCategory(double imc) {
        /*
        Tabela de IMC
        Você pode utilizar a tabela abaixo para consultar o seu índice de massa corporal.

        Resultado	            Situação
        -------------------------------------------------
        Abaixo de 17	        Muito abaixo do peso
        Entre 17 e 18,49	    Abaixo do peso
        Entre 18,50 e 24,99	    Peso normal
        Entre 25 e 29,99	    Acima do peso
        Entre 30 e 34,99	    Obesidade I
        Entre 35 e 39,99	    Obesidade II (severa)
        Acima de 40	            Obesidade III (mórbida)

        */
        String imcCategory;

        if (imc < 17) {
            imcCategory = "Muito abaixo do peso";
        } else if (imc >= 17 && imc < 18.5) {
            imcCategory = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            imcCategory = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            imcCategory = "Acima do peso";
        } else if (imc >= 30 && imc < 35) {
            imcCategory = "Obesidade I";
        } else if (imc >= 35 && imc < 40) {
            imcCategory = "Obesidade II (severa)";
        } else {
            imcCategory = "Obesidade III (mórbida)";
        }

        return imcCategory;
    }
}
