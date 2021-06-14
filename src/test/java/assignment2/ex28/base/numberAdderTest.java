package assignment2.ex28.base;

import assignment2.ex26.base.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class numberAdderTest {

    @Test
    void All_Zero() {
        numberAdder add = new numberAdder();

        double actual = add.sum(0);
        double expected = 0;
        double delta = 0.0001;

        assertEquals(expected,actual,delta);

    }
}