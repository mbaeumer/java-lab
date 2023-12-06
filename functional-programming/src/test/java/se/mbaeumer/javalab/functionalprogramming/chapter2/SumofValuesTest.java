package se.mbaeumer.javalab.functionalprogramming.chapter2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumofValuesTest {

    private SumofValues sumofValues;

    @Test
    void calculateSumOldSchool() {
        sumofValues = new SumofValues();
        final int sumOldSchool = sumofValues.calculateSumOldSchool();

        Assertions.assertEquals(21, sumOldSchool);
    }

    @Test
    void calculateSumWithStreams() {
        sumofValues = new SumofValues();
        final Integer sum = sumofValues.calculateSumWithStreams();

        Assertions.assertEquals(21, sum);
    }
}