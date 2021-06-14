package assignment2.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rateOfReturnTest {
    @Test
    void four() {
        rateOfReturn rater = new rateOfReturn();

        double actual = rater.calculateRateOfReturn(4);
        double expected = 18;
        double delta = 0.0001;

        assertEquals(expected, actual, delta);
    }
    @Test
    void nine() {
        rateOfReturn rater = new rateOfReturn();

        double actual = rater.calculateRateOfReturn(9);
        double expected = 8;
        double delta = 0.0001;

        assertEquals(expected, actual, delta);
    }
    @Test
    void twelve() {
        rateOfReturn rater = new rateOfReturn();

        double actual = rater.calculateRateOfReturn(12);
        double expected = 6;
        double delta = 0.0001;

        assertEquals(expected, actual, delta);
    }
}