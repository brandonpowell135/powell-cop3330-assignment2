package assignment2.ex24.base;
import java.util.Scanner;

public class solution24 {
    private static final Scanner in = new Scanner(System.in);

    public static String word1;
    public static String word2;

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

    public String readUserInput(String prompt) {
        String word;
        System.out.print(prompt);
        word = in.nextLine();
        return word;
    }

    public String generateOutput(boolean isAnagram) {
        if (isAnagram){
            return (word1 + " and " + word2 + " are anagrams");
        }else {
            return (word1 + " and " + word2 + " are not anagrams");


        }
    }

} 
