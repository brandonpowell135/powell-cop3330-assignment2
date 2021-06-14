/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Powell
 */
package assignment2.ex26.base;


import java.util.Scanner;

public class solution26 {
    private static final Scanner in = new Scanner(System.in);
    public static double balance;
    public static double apr;
    public static double payment;

    public static void main(String[] args) {
    balance = readInput("What is your balance? ");
    apr = readInput("What is the APR on the card (as a percent)? ");
    payment = readInput("What is the monthly payment you can make? ");
    PaymentCalculator calc = new PaymentCalculator();

    //output how many months it will take
    double result = calc.calculateMonthsUnitPaidOff(balance,apr,payment);
    System.out.print("It will take you " + result + " months to pay off this card.");

}
    public static double readInput(String prompt){
        System.out.print(prompt);
        return in.nextDouble();
    }
}
