package br.com.praticas.KeyboardMappingProject.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class AnalyzeText extends Text {
    int textLength;

    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; // alphabet for the readText method

    int[] qntdLetters = new int[26]; // to store the quantity of letters in each word

    public AnalyzeText(String filename) {
        super(filename);
    }

    public void readText(String file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bf = new BufferedReader(fileReader);

        String letter;
        while ((letter = bf.readLine()) != null) { // Yoda Condition!!!! bf.readLine() = letter;

            String[] wordsArray = letter.toLowerCase().split(" "); // array with each word separated by whitespaces

            for (String word : wordsArray) { // this 'for' go through each word of the text

                for (int i = 0; i < alphabet.length; i++) { // this 'for' go through each letter on the alphabet

                    for (int j = 0; j < word.length(); j++) { //this 'for' go through each letter on the word
                        if (word.charAt(j) == alphabet[i]) {
                            qntdLetters[i] += 1;
                        }
                    }

                }
            }
        }
        for (int i = 0; i < alphabet.length; i++) { // show quantity of each letter in the Text
            System.out.println("Quantity of " + "'" + alphabet[i] + "'" + " characters: " + qntdLetters[i]);
        }
    }

    public void percents(Text file) {
        String textString = file.inputText;
        textLength = textString.length();

        System.out.println("\nThe text have: " + this.textLength + " characters.");

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("The letter " + "'" + alphabet[i] + "' is approximately equivalent to " + ((qntdLetters[i]) * 100)/ textLength +
                    "% of the text!");
        }

    }
}
