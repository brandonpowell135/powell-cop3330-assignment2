package assignment2.ex29.base;

import assignment2.ex26.base.PaymentCalculator;

import java.util.Scanner;

public class solution29 {
    private static final Scanner in = new Scanner(System.in);
    public static int rate;

    public static void main(String[] args) {
        rate = readInput("What is the rate of return? ");
        rateOfReturn rater = new rateOfReturn();

        double results = rater.calculateRateOfReturn(rate);
        System.out.print("It will take " + results + " years to double your initial investment.");
    }

    public static int readInput(String prompt) {
        System.out.print(prompt);
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
        int intInput = Integer.parseInt(input);
        return intInput;
    }
}
