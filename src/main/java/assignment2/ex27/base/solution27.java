package assignment2.ex27.base;

import assignment2.ex25.base.PasswordChecker;
import assignment2.ex25.base.solution25;

import java.util.Scanner;

public class solution27 {
    private static final Scanner in = new Scanner(System.in);
    public static String firstName,lastName,employeeID,zipCode;


    public static void main(String[] args) {
        solution27 application = new solution27();
        firstName = application.readUserInput("Enter the first name: ");
        lastName = application.readUserInput("Enter the last name: ");
        zipCode = application.readUserInput("Enter the ZIP code: ");
        employeeID = application.readUserInput("Enter the employee ID: ");

        Validation valid = new Validation();

        String firstNameResult = valid.firstNameValidation(firstName);
        String result = valid.firstNameValidation(firstName);
        //String output = application.validateinput(result);

        result = valid.firstNameValidation(firstName);
        System.out.print(result);

    }
    private String readUserInput(String prompt) {
        String input;
        System.out.print(prompt);
        input = in.nextLine();
        return input;
    }
    //public String validateinput(boolean firstName){





}
