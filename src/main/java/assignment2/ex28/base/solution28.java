/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Powell
 */
package assignment2.ex28.base;

import assignment2.ex27.base.solution27;

import java.util.Scanner;

public class solution28 {
    private static final Scanner in = new Scanner(System.in);
    public static double number,sum,input;

    public static void main(String[] args) {
        solution28 application = new solution28();
        for (int i=5;i>0;i--) {
            number = application.readInput("Enter a number: ");

        }
        numberAdder add = new numberAdder();
        double result = add.sum(input);
        System.out.print(sum);
    }


    public static double readInput(String prompt) {
            System.out.print(prompt);
            input = in.nextDouble();
            sum += input;
            return input;
    }

}
