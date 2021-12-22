package se.mbaeumer.javalab.streamdemo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumAndProductDemoTest {

    @Test
    void getSum() {
        assertEquals(10, SumAndProductDemo.getSum(List.of(1,2,3,4)));
    }

    @Test
    void getProduct() {
        assertEquals(24, SumAndProductDemo.getProduct(List.of(1,2,3,4)));
    }
}