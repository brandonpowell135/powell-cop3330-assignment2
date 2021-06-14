package assignment2.ex32.base;

import assignment2.ex25.base.solution25;

import java.util.Random;
import java.util.Scanner;

public class solution32 {
    private static final Scanner in = new Scanner(System.in);
    public static int input;

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!\n");
        solution32 application = new solution32();
        input = application.readInput();



        Random rand = new Random();
        int i=0;
        if (input==3){
            i = 1000;
        } else if (input == 2){
            i = 100;
        } else if (input == 1){
            i=10;
        }
        int randomNumber = rand.nextInt(i)+1;
        int counter=0;
        while (true) {
            System.out.print("I have my number. What's your guess? ");

            int guess = in.nextInt();
            counter++;

            if (guess == randomNumber) {
                System.out.println("Correct");
                System.out.print("you got it in " + counter + " guesses!");
                break;
            } else if (guess < randomNumber) {
                System.out.print("Too low. Guess again: ");
            } else {
                System.out.print("Too high. Guess again:");
            }
        }

    }
    private int readInput() {

        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        return in.nextInt();
    }
}