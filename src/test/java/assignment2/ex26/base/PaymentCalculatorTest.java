package assignment2.ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void All_Zero() {
        PaymentCalculator calc = new PaymentCalculator();

        double actual = calc.calculateMonthsUnitPaidOff(0,1,1);
        double expected = 0;
        double delta = 0.0001;

        assertEquals(expected,actual,delta);

    }
    @Test
    void Example_output() {
        PaymentCalculator calc = new PaymentCalculator();

        double actual = calc.calculateMonthsUnitPaidOff(5000,12,100);
        double expected = 70.0;
        double delta = 0.0001;

        assertEquals(expected,actual,delta);

    }
    @Test
    void Decimal_output() {
        PaymentCalculator calc = new PaymentCalculator();

        double actual = calc.calculateMonthsUnitPaidOff(6000.667,20.5,500.9111111);
        double expected = 14.0;
        double delta = 0.0001;

        assertEquals(expected,actual,delta);

    }
}