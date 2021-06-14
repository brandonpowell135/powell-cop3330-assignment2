/*Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output

The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints

Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.

Challenge

Create a GUI application or web application that displays graphical feedback as well as text feedback in real time. As someone enters a password, determine its strength and display the result

 */
package assignment2.ex25.base;

import java.util.Scanner;

public class solution25 {
    private static final Scanner in = new Scanner(System.in);
    private static String input;
    private static String output;

    public static void main(String[] args) {
        solution25 application = new solution25();
        PasswordChecker pass = new PasswordChecker();
        input = application.readInput();
        int result = pass.passwordValidator(input);

        if (result==4){
            output = "is a very strong password";
        } else if (result==3){
            output = "is a strong password";
        } else if (result==2){
            output = "is a weak password";
        } else if (result==1){
            output = "is a very weak password";
        }else
            output = "is an unusual password";

        System.out.print("The password "+ "\'"+ input + "\'" + output );

    }

    private String readInput() {

        System.out.print("Enter password ");
        return in.nextLine();
    }

}




