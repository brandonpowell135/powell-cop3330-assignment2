/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Powell
 */
package assignment2.ex24.base;
import java.util.Scanner;

public class solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {
        //read in two strings
        solution24 application = new solution24();
        word1 = application.readUserInput("Enter first string: ");
        word2 = application.readUserInput("Enter second string ");

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);
        String output = application.generateOutput(result);
        System.out.println(output);


    }

    private String readUserInput(String prompt) {
        String word;
        System.out.print(prompt);
        word = in.nextLine();
        return word;
    }

    private String generateOutput(boolean isAnagram) {
        if (isAnagram){
            return (word1 + " and " + word2 + " are anagrams");
        }else {
            return (word1 + " and " + word2 + " are not anagrams");


        }
    }

} 
