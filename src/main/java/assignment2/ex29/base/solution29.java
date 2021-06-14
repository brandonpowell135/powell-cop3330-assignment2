/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Powell
 */
package assignment2.ex29.base;

import assignment2.ex26.base.PaymentCalculator;

import java.util.Scanner;

public class solution29 {
    private static final Scanner in = new Scanner(System.in);
    public static double rate;

    public static void main(String[] args) {
        rate = readInput("What is the rate of return? ");
        rateOfReturn rater = new rateOfReturn();

        double results = rater.calculateRateOfReturn(rate);
        System.out.print("It will take " + results + " years to double your initial investment.");
    }

    public static double readInput(String prompt) {
        System.out.print(prompt);
        double rate = in
        boolean isNumber;
        do {
            if (in.hasNextInt()) {
                isNumber = true;
            } else {
                System.out.print("Sorry. That's not a valid input. ");
                isNumber = false;
                in.nextLine();
            }
        }while (!(isNumber));
        String input = in.nextLine();
        System.out.print(input);
        return input;
    }
}
