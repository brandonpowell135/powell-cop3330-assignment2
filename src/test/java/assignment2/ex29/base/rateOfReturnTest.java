package assignment2.ex29.base;

import assignment2.ex26.base.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rateOfReturnTest {

    @Test
    void All_Zero() {
        rateOfReturn rater = new rateOfReturn();

        double actual = rater.calculateRateOfReturn(0);
        double expected = 0;
        double delta = 0.0001;

        assertEquals(expected, actual, delta);
    }
}