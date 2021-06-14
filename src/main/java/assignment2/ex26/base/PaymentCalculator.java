package assignment2.ex26.base;

public class PaymentCalculator {
    public double calculateMonthsUnitPaidOff(double balance,double apr, double payment) {
        double result;
        int intResult;
        double balanceRound = Math.round(balance*100)/100.0;
        double paymentRound = Math.round(payment*100)/100.0;


        result  =Math.ceil( -(1.0/30.0) * Math.log10(1 + ((balance/payment) * (1.0 - Math.pow((1.0 + (apr/36500.0)),30.0)))) / Math.log10(1.0 +(apr/36500.0)));
        intResult = Math.round((int)result);
        return result;
    }
}
