package Exercises;

import java.util.Arrays;

public class StringToArray {
    private String word;

    public void setWord(String word) {
        this.word = word;
    }

    public void askForWord() {
        System.out.println("Digite uma palavra qualquer: ");
    }

    private String[] breakWordIntoLetters() {
        String[] arrayOfLetters = new String[this.word.length()];
        for(int counter = 0; counter < this.word.length(); counter++) {
            arrayOfLetters[counter] = String.valueOf(this.word.charAt(counter));
        }
        return arrayOfLetters;
    }

    public void printArrayOfLetters() {
        System.out.println(Arrays.toString(breakWordIntoLetters()));
    }
}
