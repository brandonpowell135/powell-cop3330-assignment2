/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Powell
 */
package assignment2.ex27.base;

import assignment2.ex25.base.PasswordChecker;
import assignment2.ex25.base.solution25;

import java.util.Scanner;

public class solution27 {
    private static final Scanner in = new Scanner(System.in);
    public static String firstName, lastName, employeeID, zipCode;


    public static void main(String[] args) {
        solution27 application = new solution27();
        firstName = application.readUserInput("Enter the first name: ");
        lastName = application.readUserInput("Enter the last name: ");
        zipCode = application.readUserInput("Enter the ZIP code: ");
        employeeID = application.readUserInput("Enter the employee ID: ");

        Validation valid = new Validation();

        String firstNameResult = valid.firstNameValidation(firstName);
        String result = valid.firstNameValidation(firstName);
        // String results = valid.validateinput(firstName);


        result = valid.firstNameValidation(firstName);
        System.out.print(result);

    }

    private String readUserInput(String prompt) {
        String input;
        System.out.print(prompt);
        input = in.nextLine();
        return input;
    }

   // public static String validateinput(String firstName) {
        // if (firstname=="The first name must be at least 2 characters long.")
    }

