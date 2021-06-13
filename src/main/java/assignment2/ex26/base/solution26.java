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
    double rresult = calc.calculateMonthsUnitPaidOff(balance,apr,payment);
    System.out.print("It will take you " + rresult + " months to pay off this card.");

}
    public static double readInput(String prompt){
        System.out.print(prompt);
        return in.nextDouble();
    }
}
